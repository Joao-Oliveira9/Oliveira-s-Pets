package com.example.demo.core.domain.usecase;

import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import java.util.List;

public interface FuncionariosUseCase {
    public List<ListFuncionariosDto> mostrarTodosFuncionarios();
}
