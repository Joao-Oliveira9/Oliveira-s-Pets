package com.example.demo.core.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_do_funcionario",nullable = false)
    private String nome;

    @Column(name = "cpf",nullable = false)
    private String cpf;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "telefone",nullable = false)
    private String telefone;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
