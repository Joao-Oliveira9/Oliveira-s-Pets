package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;

import java.util.List;

public interface ListaAnimalUseCase {

    public List<AnimalUpdateDto> listarAnimais();
}
