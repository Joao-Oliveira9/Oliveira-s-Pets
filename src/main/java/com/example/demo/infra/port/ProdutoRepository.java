package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    Produto findByCodigoEAN13(String nome);
}
