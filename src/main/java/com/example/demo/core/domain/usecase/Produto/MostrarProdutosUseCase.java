package com.example.demo.core.domain.usecase.Produto;

import com.example.demo.presenters.Dtos.MostrarProdutos;

import java.util.List;

public interface MostrarProdutosUseCase {
    public List<MostrarProdutos> buscandoProdutos();
}
