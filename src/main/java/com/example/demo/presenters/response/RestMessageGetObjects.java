package com.example.demo.presenters.response;

import org.springframework.http.HttpStatus;

import java.util.List;

public class RestMessageGetObjects {

    HttpStatus status = HttpStatus.OK;
    List<Object> lista;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }
}
