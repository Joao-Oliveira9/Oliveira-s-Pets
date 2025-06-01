package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.entities.Funcionario;
import com.example.demo.core.domain.entities.Horario;
import com.example.demo.core.domain.entities.Servico;
import com.example.demo.core.domain.usecase.AgendamentoHorarioUsecase;
import com.example.demo.infra.port.AgendamentoRepository;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.infra.port.FuncionarioRepository;
import com.example.demo.infra.port.ServicoRepository;
import com.example.demo.presenters.Dtos.HorarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AgendamentoService implements AgendamentoHorarioUsecase {

    @Autowired
    AgendamentoRepository agendamentoRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    ServicoRepository servicoRepository;

    String resposta;

    public String agendarHorario(HorarioDto horarioDto){
        Funcionario funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
        //if(funcionario==null){throw new Exception()} exceção nao tem funcionario
        Animal animal = animalRepository.findByNomeAndTelefone(horarioDto.nome(),horarioDto.telefone());
        //if(animal==null){throw new Exception()} exceção nao tem animal
        Servico servico = servicoRepository.findByTipo_servico(horarioDto.servico());
        //if(servico==null){throw new Exception()} exceção nao tem servico
        LocalDateTime data = LocalDateTime.parse(horarioDto.data());

        if(horarioDisponivel(funcionario.getId(), data)){
            Horario horario = new Horario();

            horario.setId_pet(animal.getId());
            horario.setTelefone(horarioDto.telefone());
            horario.setData(data);
            horario.setId_funcionario(funcionario.getId());
            horario.setId_servico(servico.getId());
            horario.setStatus("Pendente");

            agendamentoRepository.save(horario);
            resposta = "agendamento realizado";
        }else resposta = "horário indisponível";

        return resposta;
    }

    private boolean horarioDisponivel(UUID funcionario, LocalDateTime data){
        if(agendamentoRepository.findById_funcionarioAndDataAndStatus(funcionario,data, "Pendente")==null){
            return true;
        }
        return false;
    }
    /*
    public List<MostraHorario> mostrarHorariosDisponiveis() {
        return null;
    }

    */

    public String cancelarAgendamento(HorarioDto horarioDto) {
        Funcionario funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
        //if(funcionario==null){throw new Exception()} exceção nao tem funcionario
        LocalDateTime data = LocalDateTime.parse(horarioDto.data());
        Horario horario = agendamentoRepository.findById_funcionarioAndDataAndStatus(funcionario.getId(),data,"Pendente");
        if(horario!=null){
            horario.setStatus("Cancelado");
            agendamentoRepository.save(horario);
            resposta = "agendamento cancelado";
        }else resposta = "nenhum horario agendado";

        return resposta;
    }

    public String editarAgendamento(HorarioDto horarioDto){

    }
}
