package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import com.example.demo.presenters.Dtos.ListaServicosDto;

import java.util.List;

public interface ServicosUsecase {
    public List<ListaServicosDto> mostrarTodosServicos();
}
