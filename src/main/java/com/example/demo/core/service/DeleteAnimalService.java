package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.DeleteAnimalUseCase;
import com.example.demo.exceptions.AnimalNotFoundException;
import com.example.demo.exceptions.FuncionarioNotFoundException;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalDeleteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAnimalService implements DeleteAnimalUseCase {

    @Autowired
    AnimalRepository animalRepository;

    public void deletarAnimal(AnimalDeleteDto animalDto){
        if(existeAnimal(animalDto.nome_do_animal(),animalDto.cpf_dono())){
            Animal animal = animalRepository.findByCpfAndNome(animalDto.cpf_dono(),animalDto.nome_do_animal());
            if(animal == null){
                throw new AnimalNotFoundException("Não foi possível encontrar o funcionário");
            }
            animalRepository.delete(animal);
        }
        else{
            throw new AnimalNotFoundException("Animal não existe!!");
        }
    }

    public Boolean existeAnimal(String nome, String cpf){
        return animalRepository.existsByCpfAndNome(cpf,nome);
    }


}
