package com.example.demo.presenters.Dtos;

import java.util.UUID;

public record AnimalUpdateDto(UUID id, String nome_do_animal, String tipo, String idade, String peso , String cpf_dono,String telefone) {
}
