package com.example.demo.infra.port;

import com.example.demo.core.domain.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AnimalRepository extends JpaRepository<Animal, UUID> {

}
