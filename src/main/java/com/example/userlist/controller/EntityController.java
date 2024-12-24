package com.example.userlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userlist.model.Usermodel;
import com.example.userlist.service.EntityService;

@RestController
@RequestMapping("/api/entities")
public class EntityController {

    @Autowired
    private EntityService service;

    @GetMapping
    public List<Usermodel> getAllEntities() {
        return service.getAllEntities();
    }

    @GetMapping("/{id}")
    public Usermodel getEntityById(@PathVariable Long id) {
        return service.getEntityById(id);
    }

    @PostMapping
    public Usermodel createEntity(@RequestBody Usermodel entity) {
        return service.createEntity(entity);
    }

    @PutMapping("/{id}")
    public Usermodel updateEntity(@PathVariable Long id, @RequestBody Usermodel entityDetails) {
        return service.updateEntity(id, entityDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        service.deleteEntity(id);
    }
}
