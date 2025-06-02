package com.example.demo.core.domain.usecase;

import com.example.demo.core.domain.entities.RegistroProdutos;
import com.example.demo.presenters.Dtos.MostrarProdutosVendidos;
import com.example.demo.presenters.Dtos.RegistrarProdutosDto;

import java.util.List;

public interface RegistroProdutosUseCase {
    public void registroProdutosComprados(RegistrarProdutosDto registrarProdutosDto);
    public List<MostrarProdutosVendidos> buscandoProdutosVendidos();
}
