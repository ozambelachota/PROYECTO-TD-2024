package proyectoTD.security.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String token;
    private final String nombre_usuario;
    private final String accessTokenExpiration;
}
