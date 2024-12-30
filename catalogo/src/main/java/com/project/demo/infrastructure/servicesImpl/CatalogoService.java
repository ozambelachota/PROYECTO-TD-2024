package com.project.demo.infrastructure.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.application.services.ICatalogoService;
import com.project.demo.domain.catalogoModel;
import com.project.demo.infrastructure.repositories.ICatalogoRepository;

@Service
public class CatalogoService implements ICatalogoService{

    @Autowired
    ICatalogoRepository repository;

    @Override
    public catalogoModel add(catalogoModel model) {
        return repository.save(model);
    }

    @Override
    public catalogoModel update(catalogoModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public catalogoModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<catalogoModel> getAll() {
        return (List<catalogoModel>) repository.findAll();
    }
}