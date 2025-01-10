package com.reunion.infrastructure.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reunion.applications.IReunionConsejoService;
import com.reunion.domain.ReunionConsejoModel;
import com.reunion.infrastructure.repository.IReunionConsejoRepository;

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
