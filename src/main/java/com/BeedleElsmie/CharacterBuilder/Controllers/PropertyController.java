package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Property;
import com.BeedleElsmie.CharacterBuilder.Repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    PropertyRepository propertyRepository;

        @GetMapping(value = "/properties")
    public ResponseEntity getAllProperties(){
        return new ResponseEntity(propertyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/properties/{id}")
    public ResponseEntity getProperty(@PathVariable Long id) {
        return new ResponseEntity(propertyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/properties")
    public ResponseEntity<List<Property>> postProperty(@RequestBody List<Property> properties){
        propertyRepository.saveAll(properties);
        return new ResponseEntity<>(properties, HttpStatus.CREATED);
    }
}
