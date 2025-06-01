package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {
    Fornecedor findByNome(String nome);
}
