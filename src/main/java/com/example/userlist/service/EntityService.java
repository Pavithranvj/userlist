package com.example.userlist.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userlist.model.Usermodel;
import com.example.userlist.repository.EntityRepository;

@Service
public class EntityService {

    @Autowired
    private EntityRepository repository;

    public List<Usermodel> getAllEntities() {
        return repository.findAll();
    }

    public Usermodel getEntityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
    }

    public Usermodel createEntity(Usermodel entity) {
        return repository.save(entity);
    }

    public Usermodel updateEntity(Long id, Usermodel entityDetails) {
        Usermodel entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));

        entity.setName(entityDetails.getName());
        entity.setDescription(entityDetails.getDescription());

        return repository.save(entity);
    }

    public void deleteEntity(Long id) {
        repository.deleteById(id);
    }
}