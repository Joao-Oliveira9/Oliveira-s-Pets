package com.example.demo.presenters.controllers.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarCategoriaUseCase;
import com.example.demo.presenters.response.RestMessageGetObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PegarCategoriaController {

    @Autowired
    PegarCategoriaUseCase pegarCategoriaUseCase;

    @GetMapping(value = "/mostrarCategorias")
    public ResponseEntity<RestMessageGetObjects> postProdutoResquest() {
        List categorias = pegarCategoriaUseCase.buscandoCategorias();

        RestMessageGetObjects restMessageGetObjects = new RestMessageGetObjects();
        restMessageGetObjects.setLista(categorias);

        return ResponseEntity.status(HttpStatus.OK).body(restMessageGetObjects);
    }

}
