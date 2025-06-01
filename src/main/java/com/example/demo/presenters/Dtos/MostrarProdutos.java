package com.example.demo.presenters.Dtos;

public class MostrarProdutos {
    private String nomeDoProduto;
    private String codigoEan13;
    private Double preco;
    private String nomeDaCategoria;
    private String nomeDoFornecedor;
    private String nomeDaMarca;
    private Integer qtdMin;
    private Integer qtdAtual;

    public MostrarProdutos(String nomeDoProduto, String codigoEan13, Double preco, String nomeDaCategoria, String nomeDoFornecedor, String nomeDaMarca, Integer qtdMin, Integer qtdAtual) {
        this.nomeDoProduto = nomeDoProduto;
        this.codigoEan13 = codigoEan13;
        this.preco = preco;
        this.nomeDaCategoria = nomeDaCategoria;
        this.nomeDoFornecedor = nomeDoFornecedor;
        this.nomeDaMarca = nomeDaMarca;
        this.qtdMin = qtdMin;
        this.qtdAtual = qtdAtual;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getCodigoEan13() {
        return codigoEan13;
    }

    public void setCodigoEan13(String codigoEan13) {
        this.codigoEan13 = codigoEan13;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNomeDaCategoria() {
        return nomeDaCategoria;
    }

    public void setNomeDaCategoria(String nomeDaCategoria) {
        this.nomeDaCategoria = nomeDaCategoria;
    }

    public String getNomeDoFornecedor() {
        return nomeDoFornecedor;
    }

    public void setNomeDoFornecedor(String nomeDoFornecedor) {
        this.nomeDoFornecedor = nomeDoFornecedor;
    }

    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    public void setNomeDaMarca(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    public Integer getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(Integer qtdMin) {
        this.qtdMin = qtdMin;
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(Integer qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
