package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Estoque;
import com.example.demo.core.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, UUID> {
    //Para pegar a qtdMin e qtdAtual (colocar no front)
    Estoque findByProduto(Produto produto);
}
