package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.DataString;
import com.bezkoder.springjwt.repository.DataStringRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*", maxAge = 3600)
@RestController
public class DataStringController {
    private final DataStringRepository repository;

    DataStringController(DataStringRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/dataString")
    List<DataString> all() {
        return repository.findAll();
    }

    @PostMapping("/dataString")
    DataString newDataString(@RequestBody DataString newDataString) {
        return repository.save(newDataString);
    }

}
