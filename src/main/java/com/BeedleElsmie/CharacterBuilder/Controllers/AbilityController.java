package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Ability;
import com.BeedleElsmie.CharacterBuilder.Repositories.AbilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbilityController {

    @Autowired
    AbilityRepository abilityRepository;

        @GetMapping(value = "/abilities")
    public ResponseEntity getAllAbilities(){
        return new ResponseEntity(abilityRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/abilities/{id}")
    public ResponseEntity getAbility(@PathVariable Long id) {
        return new ResponseEntity(abilityRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/abilities")
    public ResponseEntity<List<Ability>> postAbility(@RequestBody List<Ability> abilities){
        abilityRepository.saveAll(abilities);
        return new ResponseEntity<>(abilities, HttpStatus.CREATED);
    }
}
