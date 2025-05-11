package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.RegistroDeAnimalUsecase;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAnimalService implements RegistroDeAnimalUsecase {

    @Autowired
    AnimalRepository animalRepository;

    public void registroAnimal(AnimalDto animalDto){
        Animal animal = new Animal();

        animal.setCpf(animalDto.cpf_dono());
        animal.setIdade(animalDto.idade());
        animal.setPorte(animalDto.porte());
        animal.setNome(animalDto.nome_do_animal());
        animal.setTipo(animalDto.tipo());

        animalRepository.save(animal);
    }
    public void existeAnimal(){
    }
}
