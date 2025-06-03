package com.example.demo.presenters;

import com.example.demo.core.domain.usecase.DeleteAnimalUseCase;
import com.example.demo.core.domain.usecase.ListaAnimalUseCase;
import com.example.demo.core.domain.usecase.RegistroDeAnimalUsecase;
import com.example.demo.core.domain.usecase.UpdateAnimalUseCase;
import com.example.demo.presenters.Dtos.AnimalDeleteDto;
import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.Dtos.AnimalUpdateDto;
import com.example.demo.presenters.Dtos.HorarioDto;
import com.example.demo.presenters.response.RestMessage;
import com.example.demo.presenters.response.RestMessageLista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RegistroAnimalController {

    @Autowired
    RegistroDeAnimalUsecase registroDeAnimalUsecase;

    @Autowired
    DeleteAnimalUseCase deleteAnimalUseCase;

    @Autowired
    ListaAnimalUseCase listaAnimalUseCase;

    @Autowired
    UpdateAnimalUseCase updateAnimalUseCase;

    @PostMapping(value = "/animais")
    public ResponseEntity<RestMessage> postAnimalResquest(@RequestBody AnimalDto animalDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("animal cadastrado");
//        System.out.println(animalDto.idade());
        registroDeAnimalUsecase.registroAnimal(animalDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @DeleteMapping(value = "/animais")
    public ResponseEntity<RestMessage> deleteAnimalResquest(@RequestBody AnimalDeleteDto animalDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("animal cadastrado");
//        System.out.println(animalDto.idade());
//        registroDeAnimalUsecase.registroAnimal(animalDto);

        deleteAnimalUseCase.deletarAnimal(animalDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }

    @GetMapping(value = "/animais")
    public ResponseEntity<RestMessageLista> listaAnimaisResquest(){
        RestMessageLista restMessage = new RestMessageLista();
        restMessage.setMessage("animal cadastrado");

//        RestMessage restMessage = new RestMessage();
//        restMessage.setMessage("animal cadastrado");
        restMessage.setListaAnimais(listaAnimalUseCase.listarAnimais());

        listaAnimalUseCase.listarAnimais();

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
//        listaAnimalUseCase.listarAnimais();

    }


    @PatchMapping(value = "/animais")
    public ResponseEntity<RestMessage> modificarInfoAnimalRequest(@RequestBody AnimalUpdateDto animalDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("animal cadastrado");

        updateAnimalUseCase.updateRegistroAnimal(animalDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);


    }

    @GetMapping(value = "/mostrarAnimalAgendamento")
    public ResponseEntity<RestMessageLista> mostrarAnimalAgendamentoRequest(@RequestBody HorarioDto horarioDto){
        RestMessageLista restMessage = new RestMessageLista();
        restMessage.setAnimalAgendamentoDto(listaAnimalUseCase.mostrarAnimalAndTelefone(horarioDto));


        return ResponseEntity.status(HttpStatus.OK).body(restMessage);


    }

}
