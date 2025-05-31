package com.example.demo.core.domain.usecase.Produto;

import com.example.demo.presenters.Dtos.PegarCategoria;

import java.util.List;

public interface PegarCategoriaUseCase {
    public List<PegarCategoria> buscandoCategorias();
}
