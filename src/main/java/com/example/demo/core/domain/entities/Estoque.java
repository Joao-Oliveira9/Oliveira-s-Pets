package com.example.demo.core.domain.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_ESTOQUE")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "produto", nullable = false)
    private Produto produto;

    @Column(name = "qtdMin", nullable = false)
    private Integer qtdMin;

    @Column(name = "qtdMax", nullable = false)
    private Integer qtdMax;

    @Column(name = "qtdAtual", nullable = false)
    private Integer qtdAtual;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(Integer qtdMin) {
        this.qtdMin = qtdMin;
    }

    public Integer getQtdMax() {
        return qtdMax;
    }

    public void setQtdMax(Integer qtdMax) {
        this.qtdMax = qtdMax;
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(Integer qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
