package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarCategoriaUseCase;
import com.example.demo.presenters.Dtos.PegarCategoria;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PegarCategoriaService implements PegarCategoriaUseCase {

    @Autowired
    EntityManager entityManager;

    public List<PegarCategoria> buscandoCategorias() {
        String sql = "SELECT nome_da_categoria FROM tb_categoria";

        List<PegarCategoria> categorias = entityManager.createNativeQuery(sql, PegarCategoria.class)
                .getResultList();

        for(PegarCategoria c: categorias){
            System.out.println("Nome: " + c.getNomeCategoria());
        }

        return categorias;
    }
}
