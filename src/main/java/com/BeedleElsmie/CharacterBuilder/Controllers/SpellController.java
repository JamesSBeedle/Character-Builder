package com.BeedleElsmie.CharacterBuilder.Controllers;


import com.BeedleElsmie.CharacterBuilder.Models.Spell;
import com.BeedleElsmie.CharacterBuilder.Repositories.SpellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpellController {

    @Autowired
    SpellRepository spellRepository;

    @GetMapping(value = "/spells")
    public ResponseEntity getAllSpells() {
        return new ResponseEntity(spellRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/spells/{id}")
    public ResponseEntity getSpell(@PathVariable Long id){
        return new ResponseEntity(spellRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/spells")
    public ResponseEntity<List<Spell>> postSpell(@RequestBody List<Spell> spells){
        spellRepository.saveAll(spells);
        return new ResponseEntity<>(spells, HttpStatus.CREATED);
    }
}
