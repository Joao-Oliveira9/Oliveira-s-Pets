package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public interface AgendamentoRepository extends JpaRepository<Horario, UUID> {
    Horario findById_funcionarioAndDataAndStatus(UUID funcionario, LocalDateTime data, String status);
}
