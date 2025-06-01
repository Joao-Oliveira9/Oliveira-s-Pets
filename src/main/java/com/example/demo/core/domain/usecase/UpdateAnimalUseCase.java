package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;

public interface UpdateAnimalUseCase {
    public void updateRegistroAnimal(AnimalUpdateDto animalDto);
}
