package com.example.demo.core.domain.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_HORARIO")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "id_pet",nullable = false)
    private UUID idPet;

    @Column(name="telefone_do_dono",nullable = false)
    private String telefone;

    @Column(name = "data",nullable = false)
    private LocalDateTime data;

    @Column(name = "id_funcionario",nullable = false)
    private UUID idFuncionario;

    @Column(name = "id_servico",nullable = false)
    private UUID idServico;

    @Column(name = "status",nullable = false)
    private String status;

    @CreationTimestamp
    @Column(name = "created_at",updatable = false)
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime update_at;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId_pet() {
        return idPet;
    }

    public void setId_pet(UUID id_pet) {
        this.idPet = id_pet;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UUID getId_funcionario() {
        return idFuncionario;
    }

    public void setId_funcionario(UUID id_funcionario) {
        this.idFuncionario = id_funcionario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public UUID getId_servico() {
        return idServico;
    }

    public void setId_servico(UUID id_servico) {
        this.idServico = id_servico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }
}

