package com.BeedleElsmie.CharacterBuilder.Controllers;


import com.BeedleElsmie.CharacterBuilder.Models.Trait;
import com.BeedleElsmie.CharacterBuilder.Repositories.TraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TraitController {

    @Autowired
    TraitRepository traitRepository;


        @GetMapping(value = "/traits")
    public ResponseEntity getAllTraits(){
        return new ResponseEntity(traitRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/traits/{id}")
    public ResponseEntity getTrait(@PathVariable Long id) {
        return new ResponseEntity(traitRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/traits")
    public ResponseEntity<List<Trait>> postTrait(@RequestBody List<Trait> traits){
        traitRepository.saveAll(traits);
        return new ResponseEntity<>(traits, HttpStatus.CREATED);
    }
}

