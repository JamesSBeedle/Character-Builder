package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Race;
import com.BeedleElsmie.CharacterBuilder.Repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaceController {

    @Autowired
    RaceRepository raceRepository;

    @GetMapping(value = "/races")
    public ResponseEntity getAllRaces() {
        return new ResponseEntity(raceRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/races/{id}")
    public ResponseEntity getRace(@PathVariable Long id){
        return new ResponseEntity(raceRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/races")
    public ResponseEntity<List<Race>> postRace(@RequestBody List<Race> races){
        raceRepository.saveAll(races);
        return new ResponseEntity<>(races, HttpStatus.CREATED);
    }
}

