package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarMarcaUseCase;
import com.example.demo.presenters.Dtos.PegarCategoria;
import com.example.demo.presenters.Dtos.PegarFornecedor;
import com.example.demo.presenters.Dtos.PegarMarca;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PegarMarcaService implements PegarMarcaUseCase {

    @Autowired
    EntityManager entityManager;

    public List<PegarMarca> buscandoMarcas() {
        String sql = "SELECT nome_da_marca FROM tb_marca";

        List<PegarMarca> marcas = entityManager.createNativeQuery(sql, PegarMarca.class)
                .getResultList();

        for(PegarMarca m: marcas){
            System.out.println("Nome: " + m.getNomeMarca());
        }

        return marcas;
    }
}
