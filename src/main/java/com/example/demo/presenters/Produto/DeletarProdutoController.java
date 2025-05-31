package com.example.demo.presenters.Produto;

import com.example.demo.core.domain.usecase.Produto.DeletarProdutosUseCase;
import com.example.demo.presenters.Dtos.ProdutoDto;
import com.example.demo.presenters.response.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class DeletarProdutoController {

    @Autowired
    DeletarProdutosUseCase deletarProdutosUseCase;

    @DeleteMapping (value = "/deletarProdutos")
    public ResponseEntity<RestMessage> postProdutoResquest(@RequestBody ProdutoDto produtoDto) {
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("Produto deletado");

        deletarProdutosUseCase.removerProduto(produtoDto.codigoEAN_13());

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
