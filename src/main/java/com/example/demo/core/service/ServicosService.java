package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Funcionario;
import com.example.demo.core.domain.entities.Servico;
import com.example.demo.core.domain.usecase.ServicosUseCase;
import com.example.demo.infra.port.FuncionarioRepository;
import com.example.demo.infra.port.ServicoRepository;
import com.example.demo.presenters.Dtos.ListFuncionariosDto;
import com.example.demo.presenters.Dtos.ListaServicosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicosService implements ServicosUseCase {

    @Autowired
    ServicoRepository servicosRepository;

    public List<ListaServicosDto> mostrarTodosServicos() {
        List<ListaServicosDto> listaDto = new ArrayList<>();
        List<Servico> listaServicos = servicosRepository.findAll();

        for(Servico servico : listaServicos){
            ListaServicosDto listDtoString = new ListaServicosDto(servico.getTipo_servico());
            listaDto.add(listDtoString);
        }

        return listaDto;
    }
}
