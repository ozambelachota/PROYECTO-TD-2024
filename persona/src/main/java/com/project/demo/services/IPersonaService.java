package com.project.demo.services;

import java.util.List;

import com.project.demo.model.personaModel;

public interface IPersonaService {
    public personaModel add (personaModel model);
    public personaModel update (personaModel model);
    public boolean delete (int id);
    public personaModel getById (int id);
    public List<personaModel> getAll ();
}
