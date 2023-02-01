package com.gila.backendgila.controller;


import com.gila.backendgila.model.Categories;
import com.gila.backendgila.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gila.backendgila.repository.NotificationRepository;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    NotificationRepository notificationRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Notification>> getAllCategories() {
        List<Notification> categories = new ArrayList<>();

        notificationRepository.findAll().forEach(categories::add);

        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
