package com.project.demo.application.services;

import java.util.List;

import com.project.demo.domain.personaModel;

public interface IPersonaService {
    public personaModel add (personaModel model);
    public personaModel update (personaModel model);
    public boolean delete (int id);
    public personaModel getById (int id);
    public List<personaModel> getAll ();
}
