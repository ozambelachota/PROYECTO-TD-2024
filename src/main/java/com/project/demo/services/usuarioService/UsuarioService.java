package com.project.demo.services.usuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.demo.model.usuarioModulo.usuarioModel;
import com.project.demo.repository.usuarioRepository.IUsuarioRepository;

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
