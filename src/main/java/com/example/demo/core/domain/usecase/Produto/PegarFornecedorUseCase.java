package com.example.demo.core.domain.usecase.Produto;

import com.example.demo.presenters.Dtos.PegarFornecedor;

import java.util.List;

public interface PegarFornecedorUseCase {
    public List<PegarFornecedor> buscandoFornecedores();
}
