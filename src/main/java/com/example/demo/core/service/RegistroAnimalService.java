package com.example.demo.core.service;

import com.example.demo.Utils;
import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.RegistroDeAnimalUsecase;
import com.example.demo.exceptions.AnimalNotFoundException;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAnimalService implements RegistroDeAnimalUsecase {

    @Autowired
    AnimalRepository animalRepository;

    public void registroAnimal(AnimalDto animalDto){
        Boolean temNulo = Utils.hasNullField(animalDto);

        if(temNulo == true){
            throw new AnimalNotFoundException("Campo vazio!1");
        } else if (existeAnimal(animalDto.nome_do_animal(),animalDto.cpf_dono()) == true) {
            throw new AnimalNotFoundException("Já foi registrado");
        }
        else{
            Animal animal = new Animal();
            animal.setCpf(animalDto.cpf_dono());
            animal.setIdade(animalDto.idade());
            animal.setPeso(animalDto.peso());
            animal.setNome(animalDto.nome_do_animal());
            animal.setTipo(animalDto.tipo());
            animal.setTelefone(animalDto.telefone());

            animalRepository.save(animal);
        }

    }

    public Boolean existeAnimal(String nome, String cpf){
        return animalRepository.existsByCpfAndNome(cpf,nome);
    }

}