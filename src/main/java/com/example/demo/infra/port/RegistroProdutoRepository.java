package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Animal;
import com.example.demo.core.domain.entities.RegistroProdutos;
import com.example.demo.presenters.Dtos.RegistrarProdutosDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RegistroProdutoRepository extends JpaRepository<RegistroProdutos, UUID> {
}
