package com.example.demo.presenters.controllers.Produto;

import com.example.demo.core.domain.usecase.Produto.PegarFornecedorUseCase;
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
public class PegarFornecedorController {

    @Autowired
    PegarFornecedorUseCase pegarFornecedorUseCase;

    @GetMapping(value = "/mostrarFornecedores")
    public ResponseEntity<RestMessageGetObjects> postProdutoResquest() {
        List fornecedores = pegarFornecedorUseCase.buscandoFornecedores();

        RestMessageGetObjects restMessageGetObjects = new RestMessageGetObjects();
        restMessageGetObjects.setLista(fornecedores);

        return ResponseEntity.status(HttpStatus.OK).body(restMessageGetObjects);
    }
}
