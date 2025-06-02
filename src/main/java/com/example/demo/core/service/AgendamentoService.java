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
import com.example.demo.presenters.Dtos.ListHorariosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
        Animal animal = animalRepository.findByCpfAndNome(horarioDto.cpf(),horarioDto.nome());
        //if(animal==null){throw new Exception()} exceção nao tem animal
        Servico servico = servicoRepository.findByTipoServico(horarioDto.servico());
        //if(servico==null){throw new Exception()} exceção nao tem servico
        Cliente cliente = clienteRepository.findByCpf(horarioDto.cpf());
        LocalDateTime data = LocalDateTime.parse(horarioDto.data());

        if(horarioDisponivel(funcionario, data)){
            Horario horario = new Horario();

            horario.setAnimal(animal);
            horario.setTelefone(cliente.getTelefone());
            horario.setData(data);
            horario.setFuncionario(funcionario);
            horario.setServico(servico);
            horario.setStatus("Pendente");

            agendamentoRepository.save(horario);
            resposta = "agendamento realizado";
        }else resposta = "horário indisponível";

        return resposta;
    }

    private boolean horarioDisponivel(Funcionario funcionario, LocalDateTime data){
        if(agendamentoRepository.findByFuncionarioAndDataAndStatus(funcionario,data, "Pendente")==null){
            return true;
        }
        return false;
    }


    public List<ListHorariosDto> mostrarTodosAgendamentos() {
        List<ListHorariosDto> listaDto = new ArrayList<>();
        List<Horario> listaHorario = agendamentoRepository.findAll();

        String nome_do_pet = "";
        String telefone_do_dono = "";
        String nome_do_funcionario = "";
        String tipo_servico = "";


        for(Horario horario : listaHorario){
            String id = "" + horario.getId();
            Animal animal = animalRepository.findById(horario.getAnimal().getId()).orElse(null);
            if(animal != null){
                nome_do_pet = animal.getNome();
                Cliente cliente = clienteRepository.findByCpf(animal.getCpf());
                telefone_do_dono = cliente.getTelefone();
            }
            String data = horario.getData().toString();
            Funcionario funcionario = funcionarioRepository.findById(horario.getFuncionario().getId()).orElse(null);
            if(funcionario != null){
                nome_do_funcionario = funcionario.getNome();
            }
            Servico servico = servicoRepository.findById(horario.getServico().getId()).orElse(null);
            if(servico != null) {
                tipo_servico = servico.getTipo_servico();
            }
            String status = horario.getStatus();

            ListHorariosDto listaDtoString = new ListHorariosDto(id,nome_do_pet,telefone_do_dono,data,nome_do_funcionario,tipo_servico,status);

            listaDto.add(listaDtoString);
        }

        return listaDto;
    }



    public String cancelarAgendamento(HorarioDto horarioDto) {
        Funcionario funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
        //if(funcionario==null){throw new Exception()} exceção nao tem funcionario
        LocalDateTime data = LocalDateTime.parse(horarioDto.data());
        Horario horario = agendamentoRepository.findByFuncionarioAndDataAndStatus(funcionario,data,"Pendente");
        if(horario!=null){
            horario.setStatus("Cancelado");
            agendamentoRepository.save(horario);
            resposta = "agendamento cancelado";
        }else resposta = "nenhum horario agendado";

        return resposta;
    }

    public String editarAgendamento(HorarioDto horarioDto){
            Horario horario;
            resposta = "agendamento editado";

            if(horarioDto.id() != null){
                UUID id = UUID.fromString(horarioDto.id());
                horario = agendamentoRepository.findById(id).orElse(null);

                if(horario != null){
                    if(horarioDto.data()!=null){
                        LocalDateTime data = LocalDateTime.parse(horarioDto.data());
                        horario.setData(data);
                    }
                    if(horarioDto.funcionario()!=null){
                        Funcionario funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
                        horario.setFuncionario(funcionario);
                    }
                    if(horarioDto.servico()!=null){
                        Servico servico = servicoRepository.findByTipoServico(horarioDto.servico());
                        horario.setServico(servico);
                    }

                    agendamentoRepository.save(horario);
                }

            }else{
                resposta = "null";
            }

        return resposta;
    }
}
