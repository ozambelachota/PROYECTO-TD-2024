package com.project.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.project.demo.model.personaModel;
import com.project.demo.repository.IPersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    IPersonaRepository repository;

    @Override
    public personaModel add(personaModel model) {
        return repository.save(model);
    }

    @Override
    public personaModel update(personaModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public personaModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    @Cacheable("personas")
    public List<personaModel> getAll() {
        return (List<personaModel>) repository.findAll();
    }
    
}
