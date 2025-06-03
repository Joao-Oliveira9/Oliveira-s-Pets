package com.example.demo.presenters.response;

import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import org.springframework.http.HttpStatus;

import java.util.List;

public class RestMessageListaFuncionarios {
    HttpStatus status = HttpStatus.OK;
    String message;

    private List<ListFuncionariosDto> listaFuncionarios;

    public List<ListFuncionariosDto> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<ListFuncionariosDto> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
