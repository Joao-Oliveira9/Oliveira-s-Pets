package com.example.demo.core.service;

import com.example.demo.Utils;
import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.UpdateAnimalUseCase;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDeleteDto;
import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateAnimalService implements UpdateAnimalUseCase {


    @Autowired
    AnimalRepository animalRepository;

    public void updateRegistroAnimal(AnimalUpdateDto animalDto){
//        Boolean temNulo = Utils.hasNullField(animalDto);

//        System.out.println(animalDto.cpf_dono());
//        System.out.println(animalDto.nome_do_animal());

        Animal animal;

        if(animalDto.id() != null){
            animal = animalRepository.findById(animalDto.id()).orElse(null);
            if(animal != null){
                System.out.println("passei aqui");
                if(animalDto.cpf_dono()!=null){
                    animal.setCpf(animalDto.cpf_dono());
                } if (animalDto.nome_do_animal()!=null) {
                    animal.setNome(animalDto.cpf_dono());
                }  if (animalDto.idade()!=null) {
                    animal.setIdade(animalDto.idade());
                } if (animalDto.tipo()!=null) {
                    animal.setTipo(animalDto.tipo());
                }  if (animalDto.peso()!=null) {
                    System.out.println("passei aqui");
                    animal.setPeso(animalDto.peso());
                }  if (animalDto.idade()!=null) {
                    animal.setIdade(animalDto.idade());
                }  if (animalDto.nome_do_animal()!=null) {
                    animal.setNome(animalDto.nome_do_animal());
                }
                animalRepository.save(animal);
            }
        }
        else {
            System.out.println("Null");
        }


    }

    public Boolean existeAnimal(String nome, String cpf){
        return animalRepository.existsByCpfAndNome(cpf,nome);
    }



}
