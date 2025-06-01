package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.ListaAnimalUseCase;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListaAnimalService implements ListaAnimalUseCase {

    @Autowired
    AnimalRepository animalRepository;

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
}
