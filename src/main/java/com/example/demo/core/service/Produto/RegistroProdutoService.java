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

        if (produtoRepository.findByCodigoEAN13(produtoDto.codigoEAN_13()) != null) {
            System.out.println("Já existe esse produto!!");
            throw new Error("Já existe esse produto!!");
        }

        System.out.println("Categoria: " + produtoDto.nome_categoria());
        Categoria categoria = categoriaRepository.findByNome(produtoDto.nome_categoria());

        System.out.println("Marca: " + produtoDto.nome_marca());
        Marca marca = marcaRepository.findByNome(produtoDto.nome_marca());
        Fornecedor fornecedor = fornecedorRepository.findByNome(produtoDto.nome_fornecedor());

        produto.setNome(produtoDto.nome_do_produto());
        produto.setPreco(Double.parseDouble(produtoDto.preco()));
        produto.setCategoria(categoria);
        produto.setMarca(marca);
        produto.setFornecedor(fornecedor);
        produto.setCodigoEAN_13(produtoDto.codigoEAN_13());

        estoque.setProduto(produto);
        estoque.setQtdAtual(Integer.parseInt(produtoDto.qtdAtual()));
        estoque.setQtdMin(Integer.parseInt(produtoDto.qtdMin()));
        estoque.setQtdMax(Integer.parseInt(produtoDto.qtdMax()));

        produtoRepository.save(produto);
        estoqueRepository.save(estoque);
    }
}
