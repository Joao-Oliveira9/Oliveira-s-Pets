package com.example.demo.exceptions;

import com.example.demo.core.domain.entities.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ProdutoNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleProdutoNotFound(ProdutoNotFoundException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

    @ExceptionHandler(FuncionarioNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleFuncionarioNotFound(FuncionarioNotFoundException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

    @ExceptionHandler(EstoqueNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleEstoqueNotFound(EstoqueNotFoundException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

    @ExceptionHandler(AnimalNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleAnimalNotFound(AnimalNotFoundException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

    @ExceptionHandler(ServicoNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleServicoNotFound(ServicoNotFoundException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

    @ExceptionHandler(EstoqueAcabandoException.class)
    public ResponseEntity<RestErrorMessage> handleEstoqueAcabandoNotFound(EstoqueAcabandoException exception) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_ACCEPTABLE, exception.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

}
