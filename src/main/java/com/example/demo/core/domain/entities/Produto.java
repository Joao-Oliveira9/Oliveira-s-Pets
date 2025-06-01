package com.example.demo.core.domain.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_do_produto", nullable = false)
    private String nome;

    @Column(name = "preco", nullable = false)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fornecedor", nullable = false)
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "marca", nullable = false)
    private Marca marca;

    @Column(name = "codigoEAN_13", nullable = false)
    private String codigoEAN13;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getCodigoEAN_13() {
        return codigoEAN13;
    }

    public void setCodigoEAN_13(String codigoEAN_13) {
        this.codigoEAN13 = codigoEAN_13;
    }
}
