package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Funcionario;
import com.example.demo.core.domain.entities.Horario;
import com.example.demo.core.domain.usecase.FuncionariosUsecase;
import com.example.demo.infra.port.FuncionarioRepository;
import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import com.example.demo.presenters.Dtos.ListHorariosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService implements FuncionariosUsecase {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public List<ListFuncionariosDto> mostrarTodosFuncionarios() {
        List<ListFuncionariosDto> listaDto = new ArrayList<>();
        List<Funcionario> listaFuncionarios = funcionarioRepository.findAll();

        for(Funcionario funcionario : listaFuncionarios){
            ListFuncionariosDto listDtoString = new ListFuncionariosDto(funcionario.getNome());
            listaDto.add(listDtoString);
        }

        return listaDto;
    }
}
