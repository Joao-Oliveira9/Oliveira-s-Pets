package com.example.demo.presenters.controllers;

import com.example.demo.core.domain.usecase.AgendamentoHorarioUsecase;
import com.example.demo.presenters.Dtos.HorarioDto;
import com.example.demo.presenters.response.RestMessage;
import com.example.demo.presenters.response.RestMessageGetObjects;
import com.example.demo.presenters.response.RestMessageListaAgendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "http://127.0.0.1:5500")
public class AgendamentoHorarioController {

    @Autowired
    AgendamentoHorarioUsecase agendamentoUsecase;

    @PostMapping(value = "/horarios")
    public ResponseEntity<RestMessage> postAgendamentoResquest(@RequestBody HorarioDto horarioDto){
        RestMessage restMessage = new RestMessage();

        restMessage.setMessage(agendamentoUsecase.agendarHorario(horarioDto));

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @DeleteMapping(value = "/horarios")
    public ResponseEntity<RestMessage> deleteAgendamentoRequest(@RequestBody HorarioDto horarioDto){
        RestMessage restMessage = new RestMessage();

        restMessage.setMessage(agendamentoUsecase.cancelarAgendamento(horarioDto));

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @PutMapping(value = "/horarios")
    public ResponseEntity<RestMessage> updateAgendamentoRequest(@RequestBody HorarioDto horarioDto){
        RestMessage restMessage = new RestMessage();

        restMessage.setMessage(agendamentoUsecase.editarAgendamento(horarioDto));

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @GetMapping(value = "/horarios")
    public ResponseEntity<RestMessageListaAgendamento> getTodosAgendamentosRequest(){
        RestMessageListaAgendamento restMessage = new RestMessageListaAgendamento();

        restMessage.setListaAgendamentos(agendamentoUsecase.mostrarTodosAgendamentos());

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
