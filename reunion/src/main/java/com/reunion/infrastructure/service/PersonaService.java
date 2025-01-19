package com.reunion.infrastructure.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reunion.applications.IPersonaService;
import com.reunion.domain.PersonaModel;

import com.reunion.infrastructure.repository.IPersonaRepository;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    IPersonaRepository repository;
    @Override
    public PersonaModel add(PersonaModel model) {
        try {return repository.save(model);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    @Override
    public PersonaModel update(PersonaModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public PersonaModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<PersonaModel> getAll() {
        return (List<PersonaModel>) repository.findAll();
    }

}
