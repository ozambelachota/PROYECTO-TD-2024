package com.project.demo.services.usuarioService;

import java.util.List;

import com.project.demo.model.usuarioModel.usuarioModel;

public interface IUsuarioService {
    public usuarioModel add (usuarioModel model);
    public usuarioModel update (usuarioModel model);
    public boolean delete (int id);
    public usuarioModel getById (int id);
    public List<usuarioModel> getAll ();
}
