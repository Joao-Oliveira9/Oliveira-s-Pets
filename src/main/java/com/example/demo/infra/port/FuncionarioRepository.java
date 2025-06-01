package com.example.demo.infra.port;


import com.example.demo.core.domain.entities.Funcionario;
import com.example.demo.core.domain.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {
    Funcionario findByNome(String nome);
}
