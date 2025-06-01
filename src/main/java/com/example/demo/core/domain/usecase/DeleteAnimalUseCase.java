package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.AnimalDeleteDto;
import com.example.demo.presenters.Dtos.AnimalDto;

public interface DeleteAnimalUseCase {
    public void deletarAnimal(AnimalDeleteDto animalDto);
    public Boolean existeAnimal(String nome, String cpf);
}
