package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarFornecedorUseCase;
import com.example.demo.presenters.Dtos.PegarCategoria;
import com.example.demo.presenters.Dtos.PegarFornecedor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PegarFornecedorService implements PegarFornecedorUseCase {

    @Autowired
    EntityManager entityManager;

    public List<PegarFornecedor> buscandoFornecedores() {
        String sql = "SELECT nome_do_fornecedor FROM tb_fornecedor";

        List<PegarFornecedor> fornecedores = entityManager.createNativeQuery(sql, PegarFornecedor.class)
                .getResultList();

        for(PegarFornecedor f: fornecedores){
            System.out.println("Nome: " + f.getNomeFornecedor());
        }

        return fornecedores;
    }
}
