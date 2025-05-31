package com.example.demo.presenters.Produto;

import com.example.demo.core.domain.usecase.Produto.EditarProdutoUseCase;
import com.example.demo.presenters.Dtos.ProdutoDto;
import com.example.demo.presenters.response.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditarProdutoController {

    @Autowired
    EditarProdutoUseCase editarProdutoUseCase;

    @PatchMapping(value = "/editarProduto")
    public ResponseEntity<RestMessage> postProdutoResquest(@RequestBody ProdutoDto produtoDto) {
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("Produto editado");

        editarProdutoUseCase.editarProduto(produtoDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
