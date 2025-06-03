package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.usecase.UpdateAnimalUseCase;
import com.example.demo.exceptions.AnimalNotFoundException;
import com.example.demo.infra.port.AnimalRepository;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                if(!animalDto.cpf_dono().isEmpty()){
                    System.out.println(animalDto.cpf_dono());
                    animal.setCpf(animalDto.cpf_dono());
                } if (!animalDto.nome_do_animal().isEmpty()) {
                    System.out.println(animalDto.nome_do_animal());
                    animal.setNome(animalDto.nome_do_animal());
                }  if (!animalDto.idade().isEmpty()) {
                    System.out.println(animalDto.idade());
                    animal.setIdade(animalDto.idade());
                } if (!animalDto.tipo().isEmpty()) {
                    System.out.println(animalDto.tipo());
                    animal.setTipo(animalDto.tipo());
                }  if (!animalDto.peso().isEmpty()) {
                    System.out.println(animalDto.peso());
                    animal.setPeso(animalDto.peso());
                } if(!animalDto.telefone().isEmpty()){
                    System.out.println(animalDto.telefone());
                    animal.setTelefone(animalDto.telefone());
                }
                animalRepository.save(animal);
            }
        }
        else {
            throw new AnimalNotFoundException("Não foi possivel encontrar o animal");
        }


    }

    public Boolean existeAnimal(String nome, String cpf){
        return animalRepository.existsByCpfAndNome(cpf,nome);
    }



}
