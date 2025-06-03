package com.example.demo.presenters.controllers;

import com.example.demo.core.domain.usecase.ServicosUseCase;
import com.example.demo.presenters.response.RestMessageListaServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ServicosController {

    @Autowired
    ServicosUseCase servicosUsecase;

    @GetMapping(value = "/mostrarServicos")
    public ResponseEntity<RestMessageListaServicos> getFuncionariosRequest(){
        RestMessageListaServicos restMessage = new RestMessageListaServicos();

        restMessage.setListaServicos(servicosUsecase.mostrarTodosServicos());

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
