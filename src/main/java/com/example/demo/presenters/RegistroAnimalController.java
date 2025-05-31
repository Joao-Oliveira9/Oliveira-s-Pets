package com.example.demo.presenters;

import com.example.demo.core.domain.usecase.RegistroDeAnimalUsecase;
import com.example.demo.presenters.Dtos.AnimalDto;
import com.example.demo.presenters.response.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroAnimalController {

    @Autowired
    RegistroDeAnimalUsecase registroDeAnimalUsecase;

    @PostMapping(value = "/animais")
    public ResponseEntity<RestMessage> postAnimalResquest(@RequestBody AnimalDto animalDto){
        RestMessage restMessage = new RestMessage();
        restMessage.setMessage("animal cadastrado");
//        System.out.println(animalDto.idade());
        registroDeAnimalUsecase.registroAnimal(animalDto);

        return ResponseEntity.status(HttpStatus.OK).body(restMessage);
    }
}
