package com.example.demo.core.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_SERVICO")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "tipo_servico",nullable = false)
    private String tipoServico;

    @Column(name = "valor",nullable = false)
    private Float valor;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTipo_servico() {
        return tipoServico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipoServico = tipo_servico;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
