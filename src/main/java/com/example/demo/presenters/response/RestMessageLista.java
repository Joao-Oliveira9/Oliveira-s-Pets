package com.example.demo.presenters.response;

import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import org.springframework.http.HttpStatus;

import java.util.List;

public class RestMessageLista {
    HttpStatus status = HttpStatus.OK;
    String message;

    private List<AnimalUpdateDto> listaAnimais;

    public List<AnimalUpdateDto> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(List<AnimalUpdateDto> listaAnimais) {
        this.listaAnimais = listaAnimais;
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
