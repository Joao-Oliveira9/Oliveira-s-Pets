package com.example.demo.presenters.response;

import com.example.demo.presenters.Dtos.ListHorariosDto;
import org.springframework.http.HttpStatus;

import java.util.List;

public class RestMessageListaAgendamento {
    HttpStatus status = HttpStatus.OK;
    String message;

    private List<ListHorariosDto> listaAgendamentos;

    public List<ListHorariosDto> getListaAnimais() {
        return listaAgendamentos;
    }

    public void setListaAgendamentos(List<ListHorariosDto> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
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