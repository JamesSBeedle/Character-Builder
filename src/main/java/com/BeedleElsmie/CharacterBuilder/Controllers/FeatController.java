package com.BeedleElsmie.CharacterBuilder.Controllers;

import com.BeedleElsmie.CharacterBuilder.Models.Feat;
import com.BeedleElsmie.CharacterBuilder.Repositories.FeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class FeatController {

    @Autowired
    FeatRepository featRepository;

    @GetMapping(value = "/feats")
    public ResponseEntity getAllFeats(){
        return new ResponseEntity(featRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/feats/{id}")
    public ResponseEntity getFeat(@PathVariable Long id){
        return new ResponseEntity(featRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/feats")
    public ResponseEntity<List<Feat>> postFeat(@RequestBody List<Feat> feats) {
        featRepository.saveAll(feats);
        return new ResponseEntity<>(feats, HttpStatus.CREATED);
    }
}
