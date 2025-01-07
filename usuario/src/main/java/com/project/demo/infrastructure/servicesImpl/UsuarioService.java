package com.project.demo.infrastructure.servicesImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.application.services.IUsuarioService;
import com.project.demo.domain.personaModel;
import com.project.demo.domain.usuarioModel;
import com.project.demo.infrastructure.repositories.IUsuarioRepository;


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

    @Override
    public personaModel getPersonabyUser(int id) {
        return repository.gerPersonabyUsuario(id);
    }
}
