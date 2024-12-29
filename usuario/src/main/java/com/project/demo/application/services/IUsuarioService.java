package com.project.demo.application.services;

import java.util.List;

import com.project.demo.domain.usuarioModel;

public interface IUsuarioService {
    public usuarioModel add (usuarioModel model);
    public usuarioModel update (usuarioModel model);
    public boolean delete (int id);
    public usuarioModel getById (int id);
    public List<usuarioModel> getAll ();
}
