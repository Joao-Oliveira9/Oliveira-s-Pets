package com.example.demo.presenters.Dtos;

import com.example.demo.core.domain.entities.Categoria;
import com.example.demo.core.domain.entities.Fornecedor;
import com.example.demo.core.domain.entities.Marca;

public record ProdutoDto(String nome_do_produto, String preco, String nome_categoria, String nome_fornecedor, String nome_marca, String codigoEAN_13, String qtdMin, String qtdMax, String qtdAtual) {
}
