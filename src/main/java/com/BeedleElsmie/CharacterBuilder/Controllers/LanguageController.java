package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Language;
import com.BeedleElsmie.CharacterBuilder.Repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    LanguageRepository languageRepository;

    @GetMapping(value = "/languages")
    public ResponseEntity getAllLanguages(){
        return new ResponseEntity(languageRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/languages/{id}")
    public ResponseEntity getLanguage(@PathVariable Long id){
        return new ResponseEntity(languageRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/languages")
    public ResponseEntity<List<Language>> postFeat(@RequestBody List<Language> languages) {
        languageRepository.saveAll(languages);
        return new ResponseEntity<>(languages, HttpStatus.CREATED);
    }
}
