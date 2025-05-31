package com.example.demo.core.service;

import com.example.demo.Utils;
import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.RegistroDeAnimalUsecase;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDto;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.lang.reflect.Field;

@Service
public class RegistroAnimalService implements RegistroDeAnimalUsecase {

    @Autowired
    AnimalRepository animalRepository;

    public void registroAnimal(AnimalDto animalDto){
        Animal animal = new Animal();

        Boolean temNulo = Utils.hasNullField(animalDto);

//        if(temNulo == false && existeAnimal(animalDto.nome_do_animal(),animalDto.cpf_dono()) == false ){
//            animal.setCpf(animalDto.cpf_dono());
//            animal.setIdade(animalDto.idade());
//            animal.setPorte(animalDto.porte());
//            animal.setNome(animalDto.nome_do_animal());
//            animal.setTipo(animalDto.tipo());
//
//            animalRepository.save(animal);
//        }
//        else{
//            System.out.println("Campo Vazio");
//        }

        if(temNulo == true){
            System.out.println("Campo Vazio");
        } else if (existeAnimal(animalDto.nome_do_animal(),animalDto.cpf_dono()) == true) {
            System.out.println("Animal ja registrado");
        }
        else{
            animal.setCpf(animalDto.cpf_dono());
            animal.setIdade(animalDto.idade());
            animal.setPorte(animalDto.porte());
            animal.setNome(animalDto.nome_do_animal());
            animal.setTipo(animalDto.tipo());

            animalRepository.save(animal);
        }


    }

    public Boolean existeAnimal(String nome, String cpf){
        return animalRepository.existsByCpfAndNome(cpf,nome);

    }



}
