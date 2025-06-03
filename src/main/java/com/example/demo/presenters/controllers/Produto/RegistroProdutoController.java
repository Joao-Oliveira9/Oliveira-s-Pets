package com.example.demo.presenters.controllers.Produto;

import com.example.demo.core.domain.usecase.Produto.RegistroDeProdutoUsecase;
import com.example.demo.presenters.Dtos.ProdutoDto;
import com.example.demo.presenters.response.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RegistroProdutoController {

    @Autowired
    RegistroDeProdutoUsecase registroDeProdutoUsecase;

    @PostMapping(value = "/produtos")
    public ResponseEntity<RestMessage> postProdutoRequest(@RequestBody ProdutoDto produtoDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("Produto cadastrado com sucesso!!");

        System.out.println(produtoDto.codigoEAN_13());
        registroDeProdutoUsecase.registroProduto(produtoDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
