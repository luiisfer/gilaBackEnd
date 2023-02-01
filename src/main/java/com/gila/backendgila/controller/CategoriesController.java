package com.gila.backendgila.controller;



import com.gila.backendgila.model.Categories;
import com.gila.backendgila.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gila.backendgila.repository.CategoriesRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoriesController {

    @Autowired
    CategoriesRepository categoriesRepository;

    @Autowired
    UserDataRepository userDataRepository;

    @GetMapping("/categories")
    public ResponseEntity<List<Categories>> getAllCategories() {

        return new ResponseEntity<>(categoriesRepository.findAll(), HttpStatus.OK);
    }



    @GetMapping("/category/{categoryId}")
    public ResponseEntity<Categories> getTagsById(@PathVariable(value = "id") Long id) throws Exception {
        Categories tag = categoriesRepository.findById(id)
                .orElseThrow(() -> new Exception("Not found Tag with id = " + id));

        return new ResponseEntity<>(tag, HttpStatus.OK);
    }

    @PostMapping("/add/")
    public ResponseEntity<Categories> addCategory(@RequestBody Categories categoryRequest) {
        Categories _category = categoriesRepository.save(categoryRequest);
        return new ResponseEntity<>(_category, HttpStatus.CREATED);
    }
}
