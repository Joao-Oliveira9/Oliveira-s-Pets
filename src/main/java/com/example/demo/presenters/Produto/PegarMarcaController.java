package com.example.demo.presenters.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarMarcaUseCase;
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
public class PegarMarcaController {

    @Autowired
    PegarMarcaUseCase pegarMarcaUseCase;

    @GetMapping(value = "/mostrarMarcas")
    public ResponseEntity<RestMessageGetObjects> postProdutoResquest() {
        List marcas = pegarMarcaUseCase.buscandoMarcas();

        RestMessageGetObjects restMessageGetObjects = new RestMessageGetObjects();
        restMessageGetObjects.setLista(marcas);

        return ResponseEntity.status(HttpStatus.OK).body(restMessageGetObjects);
    }
}
