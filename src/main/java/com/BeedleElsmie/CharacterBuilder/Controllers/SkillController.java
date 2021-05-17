package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Skill;
import com.BeedleElsmie.CharacterBuilder.Repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillController {

    @Autowired
    SkillRepository skillRepository;

    @GetMapping(value = "/skills")
    public ResponseEntity getAllSkills(){
        return new ResponseEntity(skillRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/skills/{id}")
    public ResponseEntity getSkill(@PathVariable Long id){
        return new ResponseEntity(skillRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/skills")
    public ResponseEntity<List<Skill>> postSkill(@RequestBody List<Skill> skills) {
        skillRepository.saveAll(skills);
        return new ResponseEntity<>(skills, HttpStatus.CREATED);
    }
}
