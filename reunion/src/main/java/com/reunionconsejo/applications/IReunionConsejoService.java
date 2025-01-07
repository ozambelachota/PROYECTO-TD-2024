package com.reunionconsejo.applications;

import java.util.List;

import com.reunionconsejo.domain.ReunionConsejoModel;

public interface IReunionConsejoService {
    public ReunionConsejoModel add (ReunionConsejoModel model);
    public ReunionConsejoModel update (ReunionConsejoModel model);
    public boolean delete (int id);
    public ReunionConsejoModel getById (int id);
    public List<ReunionConsejoModel> getAll ();
}
