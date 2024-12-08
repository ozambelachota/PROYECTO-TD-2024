package com.project.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.usuarioModel;
import com.project.demo.repository.IUsuarioRepository;


@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository repository;
    @Override
    public usuarioModel add(usuarioModel model) {
        return repository.save(model);
    }

    @Override
    public usuarioModel update(usuarioModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public usuarioModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<usuarioModel> getAll() {
        return (List<usuarioModel>) repository.findAll();
    }
    
}
