package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, UUID> {
    Servico findByTipo_servico(String tipo_servico);
}
