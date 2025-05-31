package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.usecase.Produto.MostrarProdutosUseCase;
import com.example.demo.presenters.Dtos.MostrarProdutos;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarProdutosService implements MostrarProdutosUseCase {

    @Autowired
    EntityManager entityManager;

    public List<MostrarProdutos> buscandoProdutos() {
        String sql = "SELECT p.nome_do_produto, p.codigoean_13, p.preco, c.nome_da_categoria,  " +
                "           f.nome_do_fornecedor, m.nome_da_marca, e.qtd_min, e.qtd_atual\n" +
                "FROM tb_produto p\n" +
                "JOIN tb_estoque e ON e.produto = p.id\n" +
                "JOIN tb_categoria c ON p.categoria = c.id\n" +
                "JOIN tb_fornecedor f ON p.fornecedor = f.id\n" +
                "JOIN tb_marca m ON p.marca = m.id\n" +
                "ORDER BY p.nome_do_produto ASC;";

        List<MostrarProdutos> produtos = entityManager.createNativeQuery(sql, MostrarProdutos.class)
                .getResultList();

        for(MostrarProdutos p: produtos){
            System.out.println("Nome: " + p.getNomeDoProduto());
            System.out.println("Codigo: " + p.getCodigoEan13());
            System.out.println("Preco: " + p.getPreco());
            System.out.println("Categoria: " + p.getNomeDaCategoria());
            System.out.println("Fornecedor: " + p.getNomeDoFornecedor());
            System.out.println("Marca: " + p.getNomeDaMarca());
            System.out.println("QtdMin: " + p.getQtdMin());
            System.out.println("QtdAtual: " + p.getQtdAtual());
        }

        return produtos;
    }
}
