package com.example.demo.core.domain.usecase;

import com.example.demo.core.domain.entities.Horario;
import com.example.demo.presenters.Dtos.HorarioDto;
import com.example.demo.presenters.Dtos.ListHorariosDto;

import java.util.List;

public interface AgendamentoHorarioUsecase {
    public String agendarHorario(HorarioDto horarioDto);
    public List<ListHorariosDto> mostrarTodosAgendamentos();
    public String cancelarAgendamento(HorarioDto horarioDto);
    public String editarAgendamento(HorarioDto horarioDto);
}
