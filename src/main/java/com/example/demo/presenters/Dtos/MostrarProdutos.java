package com.example.demo.presenters.Dtos;

public class MostrarProdutos {
    private String nomeDoProduto;
    private String codigoEan13;
    private String preco;
    private String nomeDaCategoria;
    private String nomeDoFornecedor;
    private String nomeDaMarca;
    private String qtdMin;
    private String qtdAtual;

    public MostrarProdutos(String nomeDoProduto, String codigoEan13, String preco, String nomeDaCategoria, String nomeDoFornecedor, String nomeDaMarca, String qtdMin, String qtdAtual) {
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
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

    public String getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(String qtdMin) {
        this.qtdMin = qtdMin;
    }

    public String getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(String qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
