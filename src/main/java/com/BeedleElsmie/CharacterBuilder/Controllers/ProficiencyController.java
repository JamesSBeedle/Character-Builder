package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Proficiency;
import com.BeedleElsmie.CharacterBuilder.Repositories.ProficiencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProficiencyController {

    @Autowired
    ProficiencyRepository proficiencyRepository;

        @GetMapping(value = "/proficiencies")
    public ResponseEntity getAllProficiencies(){
        return new ResponseEntity(proficiencyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/proficiencies/{id}")
    public ResponseEntity getProficiency(@PathVariable Long id) {
        return new ResponseEntity(proficiencyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/proficiencies")
    public ResponseEntity<List<Proficiency>> postProficiency(@RequestBody List<Proficiency> proficiencies){
        proficiencyRepository.saveAll(proficiencies);
        return new ResponseEntity<>(proficiencies, HttpStatus.CREATED);
    }
}
