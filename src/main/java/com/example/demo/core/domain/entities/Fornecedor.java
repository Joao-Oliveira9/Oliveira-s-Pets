package com.example.demo.core.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_FORNECEDOR")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_do_fornecedor",nullable = false)
    private String nome;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
