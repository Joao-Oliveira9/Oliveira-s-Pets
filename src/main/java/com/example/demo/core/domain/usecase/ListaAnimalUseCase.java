package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.AnimalAgendamentoDto;
import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import com.example.demo.presenters.Dtos.HorarioDto;

import java.util.List;

public interface ListaAnimalUseCase {

    public List<AnimalUpdateDto> listarAnimais();

    public AnimalAgendamentoDto mostrarAnimalAndTelefone(HorarioDto horarioDto);
}
