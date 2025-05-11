package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.entities.*;
import com.example.demo.core.domain.usecase.Produto.RegistroDeProdutoUsecase;
import com.example.demo.infra.port.*;
import com.example.demo.presenters.Dtos.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroProdutoService implements RegistroDeProdutoUsecase {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    EstoqueRepository estoqueRepository;

    public void registroProduto(ProdutoDto produtoDto) {
        Produto produto = new Produto();
        Estoque estoque = new Estoque();

        Categoria categoria = categoriaRepository.findByNome(produtoDto.nome_categoria());

        System.out.println(categoria.getNome());
        Marca marca = marcaRepository.findByNome(produtoDto.nome_marca());
        Fornecedor fornecedor = fornecedorRepository.findByNome(produtoDto.nome_fornecedor());

        produto.setNome(produtoDto.nome_do_produto());
        produto.setPreco(produtoDto.preco());
        produto.setCategoria(categoria);
        produto.setMarca(marca);
        produto.setFornecedor(fornecedor);
        produto.setCodigoEAN_13(produtoDto.codigoEAN_13());

        estoque.setProduto(produto);
        estoque.setQtdAtual(produtoDto.qtdAtual());
        estoque.setQtdMin(produtoDto.qtdMin());
        estoque.setQtdMax(produtoDto.qtdMax());

        produtoRepository.save(produto);
        estoqueRepository.save(estoque);
    }

    public void editarProduto(ProdutoDto produtoDto) {

    }
}
