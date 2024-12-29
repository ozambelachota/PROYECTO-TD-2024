package com.project.demo.application.services;

import java.util.List;

<<<<<<< HEAD
import com.project.demo.domain.personaModel;
=======
>>>>>>> af798b7 (feature: files reorganized)
import com.project.demo.domain.usuarioModel;

public interface IUsuarioService {
    public usuarioModel add (usuarioModel model);
    public usuarioModel update (usuarioModel model);
    public boolean delete (int id);
    public usuarioModel getById (int id);
    public List<usuarioModel> getAll ();
    public personaModel getPersonabyUser(int id);
}
