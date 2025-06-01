package com.example.demo.core.domain.usecase;

import com.example.demo.core.domain.entities.Horario;
import com.example.demo.presenters.Dtos.HorarioDto;

public interface AgendamentoHorarioUsecase {
    public String agendarHorario(HorarioDto horarioDto);
    //public List<MostraHorario> mostrarHorariosDisponiveis();
    public String cancelarAgendamento(HorarioDto horarioDto);
    public String editarAgendamento(HorarioDto horarioDto);
}
