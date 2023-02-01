package com.gila.backendgila.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.gila.backendgila.model.Notification;
import com.gila.backendgila.model.Submission;
import com.gila.backendgila.model.UserData;
import com.gila.backendgila.repository.SubmissionRepository;
import com.gila.backendgila.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/submission")
@CrossOrigin("*")
public class SubmissionController {

    @Autowired
    SubmissionRepository submissionRepository;


    @GetMapping("/orderAsc/")
    public ResponseEntity<List<Submission>> getAllTutorialsByOrder() {

        List<Submission> tutorials = submissionRepository.findAllByOrderByPublishedDateDesc();

        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Submission> createTutorial(@RequestBody Submission tutorial) {
        Submission _tutorial = submissionRepository.save(tutorial);
        return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }
}
