package com.example.demo.presenters.controllers;

import com.example.demo.core.domain.usecase.FuncionariosUseCase;
import com.example.demo.presenters.response.RestMessageListaAgendamento;
import com.example.demo.presenters.response.RestMessageListaFuncionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionariosController {

    @Autowired
    FuncionariosUseCase funcionariosUsecase;

    @GetMapping(value = "/mostrarFuncionarios")
    public ResponseEntity<RestMessageListaFuncionarios> getFuncionariosRequest(){
        RestMessageListaFuncionarios restMessage = new RestMessageListaFuncionarios();

        restMessage.setListaFuncionarios(funcionariosUsecase.mostrarTodosFuncionarios());

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

}
