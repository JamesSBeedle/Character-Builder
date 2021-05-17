package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Role;
import com.BeedleElsmie.CharacterBuilder.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @GetMapping(value = "/roles")
    public ResponseEntity getAllRoles() {
        return new ResponseEntity(roleRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/roles/{id}")
    public ResponseEntity getRole(@PathVariable Long id){
        return new ResponseEntity(roleRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/roles")
    public ResponseEntity<List<Role>> postRole(@RequestBody List<Role> roles){
        roleRepository.saveAll(roles);
        return new ResponseEntity<>(roles, HttpStatus.CREATED);
    }
}
