package com.reunionconsejo.infrastructure.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reunionconsejo.applications.IReunionConsejoService;
import com.reunionconsejo.domain.ReunionConsejoModel;
import com.reunionconsejo.infrastructure.repository.IReunionConsejoRepository;

@Service
public class ReunionConsejoService implements IReunionConsejoService{
    @Autowired
    IReunionConsejoRepository repository;

    @Override
    public ReunionConsejoModel add(ReunionConsejoModel model) {
        return repository.save(model);
    }
    @Override
    public ReunionConsejoModel update(ReunionConsejoModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public ReunionConsejoModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<ReunionConsejoModel> getAll() {
        return (List<ReunionConsejoModel>) repository.findAll();
    }
}
