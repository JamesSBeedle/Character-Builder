package com.BeedleElsmie.CharacterBuilder.Controllers;


import com.BeedleElsmie.CharacterBuilder.Models.SubClass;
import com.BeedleElsmie.CharacterBuilder.Repositories.SubClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubClassController {

    @Autowired
    SubClassRepository subclassRepository;


        @GetMapping(value = "/subclasses")
    public ResponseEntity getAllSubclasses(){
        return new ResponseEntity(subclassRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/subclasses/{id}")
    public ResponseEntity getSubclass(@PathVariable Long id) {
        return new ResponseEntity(subclassRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/subclasses")
    public ResponseEntity<List<SubClass>> postSubclass(@RequestBody List<SubClass> subclasses){
        subclassRepository.saveAll(subclasses);
        return new ResponseEntity<>(subclasses, HttpStatus.CREATED);
    }
}
