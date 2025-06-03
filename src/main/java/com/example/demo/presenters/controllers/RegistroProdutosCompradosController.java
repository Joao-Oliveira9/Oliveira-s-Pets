package com.example.demo.presenters.controllers;

import com.example.demo.core.domain.usecase.RegistroProdutosUseCase;
import com.example.demo.presenters.Dtos.RegistrarProdutosDto;
import com.example.demo.presenters.response.RestMessage;
import com.example.demo.presenters.response.RestMessageGetObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "http://127.0.0.1:5500")
public class RegistroProdutosCompradosController {

    @Autowired
    RegistroProdutosUseCase registroProdutosUseCase;

    @PostMapping(value = "/registrarProdutosVendidos")
    public ResponseEntity<RestMessage> postRegistroProdutosRequest(@RequestBody RegistrarProdutosDto registrarProdutosDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("Produto vendido cadastrado");

       registroProdutosUseCase.registroProdutosComprados(registrarProdutosDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @GetMapping(value = "/mostrarProdutosVendidos")
    public ResponseEntity<RestMessageGetObjects> getRegistroProdutosRequest(){
        List produtos = registroProdutosUseCase.buscandoProdutosVendidos();

        RestMessageGetObjects restMessageGetObjects = new RestMessageGetObjects();
        restMessageGetObjects.setLista(produtos);

        return ResponseEntity.status(HttpStatus.OK).body(restMessageGetObjects);
    }
}
