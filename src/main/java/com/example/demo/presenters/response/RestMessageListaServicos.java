package com.example.demo.presenters.response;

import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import com.example.demo.presenters.Dtos.ListaServicosDto;
import org.springframework.http.HttpStatus;

import java.util.List;

public class RestMessageListaServicos {
    HttpStatus status = HttpStatus.OK;
    String message;

    private List<ListaServicosDto> listaServicos;

    public List<ListaServicosDto> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(List<ListaServicosDto> listaServicos) {
        this.listaServicos = listaServicos;
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
