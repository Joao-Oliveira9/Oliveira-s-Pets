package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, UUID> {
    Marca findByNome(String nome);
}
