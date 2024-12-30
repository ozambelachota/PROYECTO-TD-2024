package com.project.demo.application.services;

import java.util.List;

import com.project.demo.domain.catalogoModel;

public interface ICatalogoService {
    public catalogoModel add (catalogoModel model);
    public catalogoModel update (catalogoModel model);
    public boolean delete (int id);
    public catalogoModel getById (int id);
    public List<catalogoModel> getAll ();
}

