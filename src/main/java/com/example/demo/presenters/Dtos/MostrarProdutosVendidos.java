package com.example.demo.presenters.Dtos;

import java.time.LocalDateTime;

public class MostrarProdutosVendidos {
    String nome_do_produto;
    String nome_do_funcionario;
    Integer qtdAtual;
    Integer qtdVendida;
    String codigoEAN_13;
    java.sql.Timestamp created_at;

    public MostrarProdutosVendidos(String nome_do_produto, String nome_do_funcionario, Integer qtdAtual, Integer qtdVendida, String codigoEAN_13, java.sql.Timestamp created_at) {
        this.nome_do_produto = nome_do_produto;
        this.nome_do_funcionario = nome_do_funcionario;
        this.qtdAtual = qtdAtual;
        this.qtdVendida = qtdVendida;
        this.codigoEAN_13 = codigoEAN_13;
        this.created_at = created_at;
    }

    public String getNome_do_produto() {
        return nome_do_produto;
    }

    public String getNome_do_funcionario() {
        return nome_do_funcionario;
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public String getCodigoEAN_13() {
        return codigoEAN_13;
    }

    public java.sql.Timestamp getCreated_at() {
        return created_at;
    }
}
