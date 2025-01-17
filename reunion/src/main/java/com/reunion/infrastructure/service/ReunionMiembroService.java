package com.reunion.infrastructure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reunion.applications.IReunionMiembroService;
import com.reunion.domain.ReunionMiembroModel;
import com.reunion.infrastructure.repository.IReunionMiembroRepository;

@Service

public class ReunionMiembroService implements IReunionMiembroService{

    @Autowired
    IReunionMiembroRepository miembroRepository;

    @Override
    public ReunionMiembroModel add(ReunionMiembroModel model) {
        return  miembroRepository.save(model);
    }
    @Override
    public ReunionMiembroModel update(ReunionMiembroModel model) {
        return miembroRepository.save(model);
    }

    @Override
    public boolean delete(int id) {
        miembroRepository.deleteById(id);
        return true;
    }

    @Override
    public ReunionMiembroModel getById(int id) {
        return miembroRepository.findById(id).get();
    }

    @Override
    public List<ReunionMiembroModel> getAll() {
        return (List<ReunionMiembroModel>) miembroRepository.findAll();
    }
}
