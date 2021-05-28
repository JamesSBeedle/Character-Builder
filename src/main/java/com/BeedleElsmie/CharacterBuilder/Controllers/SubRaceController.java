package com.BeedleElsmie.CharacterBuilder.Controllers;


import com.BeedleElsmie.CharacterBuilder.Models.SubRace;
import com.BeedleElsmie.CharacterBuilder.Repositories.SubRaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubRaceController {

    @Autowired
    SubRaceRepository subraceRepository;


        @GetMapping(value = "/subraces")
    public ResponseEntity getAllSubraces(){
        return new ResponseEntity(subraceRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/subraces/{id}")
    public ResponseEntity getSubraces(@PathVariable Long id) {
        return new ResponseEntity(subraceRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/subraces")
    public ResponseEntity<List<SubRace>> postSubclass(@RequestBody List<SubRace> subraces){
        subraceRepository.saveAll(subraces);
        return new ResponseEntity<>(subraces, HttpStatus.CREATED);
    }
}
