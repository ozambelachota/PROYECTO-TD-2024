package proyectoTD.security.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTD.security.model.AccesModel;
import proyectoTD.security.repository.IAuthRepository;

@Service
public class AuthService {
    @Autowired
    IAuthRepository authRepository;

    public List<AccesModel> getAcces() {
        return (List<AccesModel>) authRepository.findAll();
    }

    public AccesModel validatedCredentials(String UserName, String Password) {
        List<AccesModel> result = (List<AccesModel>) authRepository.findAll();
        List<AccesModel> resultFilter = result.stream()
                .filter(t -> t.getNombre_usuario().equals(UserName) && t.getContraseña().equals(Password))
                .collect(Collectors.toList());
        if (null == resultFilter || resultFilter.isEmpty()) {
            return null;
        }
        return resultFilter.get(0);
    }
}
