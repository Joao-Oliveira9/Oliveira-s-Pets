package com.example.demo.core.domain.usecase.Produto;

import com.example.demo.presenters.Dtos.PegarMarca;

import java.util.List;

public interface PegarMarcaUseCase {
    public List<PegarMarca> buscandoMarcas();
}
