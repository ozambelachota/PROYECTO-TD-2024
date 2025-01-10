package com.reunion.applications;

import java.util.List;

import com.reunion.domain.ReunionMiembroModel;

public interface IReunionMiembroService {

    public ReunionMiembroModel add (ReunionMiembroModel model);
    public ReunionMiembroModel update (ReunionMiembroModel model);
    public boolean delete(int id);
    public ReunionMiembroModel getById (int id);
    public List<ReunionMiembroModel> getAll ();
}
