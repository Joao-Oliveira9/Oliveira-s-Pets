package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.entities.Horario;
import com.example.demo.core.domain.usecase.AgendamentoHorarioUsecase;
import com.example.demo.core.domain.usecase.ListaAnimalUseCase;
import com.example.demo.infra.port.AgendamentoRepository;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalAgendamentoDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import com.example.demo.presenters.Dtos.HorarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListaAnimalService implements ListaAnimalUseCase {

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    AgendamentoRepository agendamentoRepository;

    public List<AnimalUpdateDto> listarAnimais() {

        List<AnimalUpdateDto> listaAnimaisDto = new ArrayList<>();
        List<Animal> listaAnimaisJPA = animalRepository.findAll();


        for(Animal animal : listaAnimaisJPA){
            System.out.println(animal.getNome());
            AnimalUpdateDto animalDto = new AnimalUpdateDto(animal.getId(),animal.getNome(),animal.getTipo(),animal.getIdade(),animal.getPeso(),animal.getCpf(), animal.getTelefone());
            listaAnimaisDto.add(animalDto);
        }
        return listaAnimaisDto;
    }

    public AnimalAgendamentoDto mostrarAnimalAndTelefone(HorarioDto horarioDto){
        UUID id = UUID.fromString(horarioDto.id());
        Horario horario = agendamentoRepository.findById(id).orElse(null);
        AnimalAgendamentoDto animalAgendamentoDto = null;

        if(horario != null){
            animalAgendamentoDto = new AnimalAgendamentoDto(horario.getAnimal().getNome(), horario.getTelefone());
        }else throw new Error("agendamento não encontrado");

        return animalAgendamentoDto;
    }
}
