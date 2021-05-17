package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Equipment;
import com.BeedleElsmie.CharacterBuilder.Repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    EquipmentRepository equipmentRepository;

    @GetMapping(value = "/equipments")
    public ResponseEntity getAllEquipment(){
        return new ResponseEntity(equipmentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/equipments/{id}")
    public ResponseEntity getEquipment(@PathVariable Long id) {
        return new ResponseEntity(equipmentRepository.findById(id), HttpStatus.OK);
    }
    
    @PostMapping(value = "/equipments")
    public ResponseEntity<List<Equipment>> postEquipment(@RequestBody List<Equipment> equipments){
        equipmentRepository.saveAll(equipments);
        return new ResponseEntity<>(equipments, HttpStatus.CREATED);
    }
}
