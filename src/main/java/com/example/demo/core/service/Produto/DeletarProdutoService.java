package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.entities.Estoque;
import com.example.demo.core.domain.entities.Produto;
import com.example.demo.core.domain.usecase.Produto.DeletarProdutosUseCase;
import com.example.demo.exceptions.ProdutoNotFoundException;
import com.example.demo.infra.port.EstoqueRepository;
import com.example.demo.infra.port.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletarProdutoService implements DeletarProdutosUseCase {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    EstoqueRepository estoqueRepository;

    public void removerProduto(String codigoEAN_13) {
        Produto produto = produtoRepository.findByCodigoEAN13(codigoEAN_13);
        Estoque estoque = estoqueRepository.findByProduto(produto);

        if(produto != null && estoque != null){
            System.out.println(produto.getId());
            estoqueRepository.delete(estoque);
            produtoRepository.delete(produto);
        } else {
            throw new ProdutoNotFoundException("Nao foi possível encontrar o produto");
        }

    }
}
