package com.gila.backendgila.controller;


import com.gila.backendgila.exception.ResourceNotFoundException;
import com.gila.backendgila.model.UserData;
import com.gila.backendgila.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/userdata")
public class UserDataController {

    @Autowired
    UserDataRepository userDataRepository;

    @GetMapping("/all")
    public ResponseEntity<List<UserData>> getAllTutorials() {
        List<UserData> tutorials = new ArrayList<>();
        userDataRepository.findAll().forEach(tutorials::add);


        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserData> getTutorialById(@PathVariable("id") long id) {
        UserData userData = userDataRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        return new ResponseEntity<>(userData, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<UserData> createTutorial(@RequestBody UserData tutorial) {
        UserData _tutorial = userDataRepository.save(tutorial);
        return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }
}
