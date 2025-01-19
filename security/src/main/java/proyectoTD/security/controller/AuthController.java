package proyectoTD.security.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectoTD.security.dto.AuthRequest;
import proyectoTD.security.dto.AuthResponse;
import proyectoTD.security.jwt.JwtToken;
import proyectoTD.security.model.AccesModel;
import proyectoTD.security.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @Autowired
    private JwtToken jwtTokenCross;

    Logger logger = LoggerFactory.getLogger(AuthController.class);

    @GetMapping
    public List<AccesModel> get() {
        return authService.getAcces();
    }

    @PostMapping
public ResponseEntity<?> post(@RequestBody AuthRequest request) {
    try {
        logger.info("Post: Username {} - Password {}", request.getUsername(), request.getPassword());
        
        AccesModel access = authService.validatedCredentials(request.getUsername(), request.getPassword());
        if (access == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("INVALID_CREDENTIALS");
        }

        String token = jwtTokenCross.generateToken(access);
        AuthResponse response = new AuthResponse(token, request.getUsername(), "1d");

        return ResponseEntity.ok(response);
    } catch (Exception e) {
        logger.error("Error during authentication", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en la funcion de post" + e.getMessage());
    }
}

}
