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
import org.springframework.cglib.core.Local;
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
        System.out.println(horarioDto.data());
        Funcionario funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
        Animal animal = animalRepository.findByCpfAndNome(horarioDto.cpf(),horarioDto.nome());
        if(animal==null){throw new Error("Animal não encontrado");}
        Servico servico = servicoRepository.findByTipoServico(horarioDto.servico());
        LocalDateTime data = LocalDateTime.parse(horarioDto.data());

        if(horarioDisponivel(funcionario, data)){
            Horario horario = new Horario();

            horario.setAnimal(animal);
            horario.setTelefone(animal.getTelefone());
            horario.setData(data);
            horario.setFuncionario(funcionario);
            horario.setServico(servico);
            horario.setStatus("Pendente");

            agendamentoRepository.save(horario);
            resposta = "agendamento realizado";
        }else throw new Error("Horario não disponivel");

        return resposta;
    }

    private boolean horarioDisponivel(Funcionario funcionario, LocalDateTime data){
        if(agendamentoRepository.findByFuncionarioAndDataHorarioAndStatus(funcionario,data, "Pendente")==null){
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
                telefone_do_dono = animal.getTelefone();
            }
            String data = horario.getDataHorario().toString();
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
        Horario horario = agendamentoRepository.findByFuncionarioAndDataHorarioAndStatus(funcionario,data,"Pendente");
        if(horario!=null){
            horario.setStatus("Cancelado");
            agendamentoRepository.save(horario);
            resposta = "agendamento cancelado";
        }else throw new Error("Nenhum agendamento encontrado");

        return resposta;
    }

    public String editarAgendamento(HorarioDto horarioDto){
            Horario horario;
            resposta = "agendamento editado";

            if(horarioDto.id() != null){
                UUID id = UUID.fromString(horarioDto.id());
                horario = agendamentoRepository.findById(id).orElse(null);
                LocalDateTime data;
                Funcionario funcionario;

                if(horario != null){

                    if(horarioDto.funcionario() != null || horarioDto.data() != null) {
                        int op = verificarDto(horarioDto);

                        switch (op) {
                            case 1:
                                funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
                                data = LocalDateTime.parse(horarioDto.data());
                                if(horarioDisponivel(funcionario,data)){
                                    horario.setFuncionario(funcionario);
                                    horario.setData(data);
                                }else throw new Error("Horario não disponivel"); // exception?
                                break;
                            case 2:
                                funcionario = funcionarioRepository.findByNome(horarioDto.funcionario());
                                if(horarioDisponivel(funcionario,horario.getDataHorario())){
                                    horario.setFuncionario(funcionario);
                                }else throw new Error("Horario não disponivel");
                                break;
                            case 3:
                                data = LocalDateTime.parse(horarioDto.data());
                                if(horarioDisponivel(horario.getFuncionario(),data)){
                                    horario.setData(data);
                                }else throw new Error("Horario não disponivel");
                                break;
                        }
                    }
                    if(horarioDto.servico()!=null) {
                        Servico servico = servicoRepository.findByTipoServico(horarioDto.servico());
                        horario.setServico(servico);
                    }
                    agendamentoRepository.save(horario);
                }

            }

        return resposta;
    }

    private int verificarDto(HorarioDto dto){
        int op;

        if(dto.funcionario()!=null && dto.data()!=null){
            op = 1;
        }else if (dto.funcionario()!=null){
            op = 2;
        }else op = 3;


        return op;
    }

}