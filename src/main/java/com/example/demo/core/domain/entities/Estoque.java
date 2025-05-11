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
    private String qtdMin;

    @Column(name = "qtdMax", nullable = false)
    private String qtdMax;

    @Column(name = "qtdAtual", nullable = false)
    private String qtdAtual;

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

    public String getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(String qtdMin) {
        this.qtdMin = qtdMin;
    }

    public String getQtdMax() {
        return qtdMax;
    }

    public void setQtdMax(String qtdMax) {
        this.qtdMax = qtdMax;
    }

    public String getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(String qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
