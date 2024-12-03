package main.java.com.project.demo.Modulo_Solicitud.services;

import java.util.List;

import main.java.com.project.demo.Modulo_Solicitud.model.SolicitudModel;
import main.java.com.project.demo.Modulo_Solicitud.repository.ISolicitudRepository;

@Service
public class SolicitudService implements ISolicitudService {

    @Autowired
    ISolicitudRepository repository;

    @Override
    public SolicitudModel add(SolicitudModel model) {
        return repository.save(model);
    }

    @Override
    public SolicitudModel update(SolicitudModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }
    @Override
    public List<SolicitudModel> findAll() {
        return (List<SolicitudModel>) repository.findAll();
    }
    @Override
    public SolicitudModel findById(int id) {
        return repository.findById(id).get();
    }
    public SolicitudModel update(Long id, UsuarioModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    


    
    
}
