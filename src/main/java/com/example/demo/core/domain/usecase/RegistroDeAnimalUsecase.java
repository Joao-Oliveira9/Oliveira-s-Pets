package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.AnimalDto;

public interface RegistroDeAnimalUsecase {
    public void registroAnimal(AnimalDto animalDto);
    public void existeAnimal();
}
