package com.reunion.applications;

import java.util.List;

import com.reunion.domain.PersonaModel;

public interface IPersonaService {
    public PersonaModel add (PersonaModel model);
    public PersonaModel update (PersonaModel model);
    public boolean delete (int id);
    public PersonaModel getById (int id);
    public List<PersonaModel> getAll ();

}
