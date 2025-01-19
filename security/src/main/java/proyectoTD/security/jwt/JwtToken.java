package proyectoTD.security.jwt;

import java.security.Key;
import java.sql.Date;
import java.time.Instant;
import java.util.UUID;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import proyectoTD.security.model.AccesModel;

@Component
public class JwtToken {
    public static final long JWT_TOKEN_VALIDITY = 2 * 60 * 60;

    @Value("${jwt.secret}")
    private String secret;

    public String generateToken(AccesModel access) {

        Key hmacKey = new SecretKeySpec(secret.getBytes(), SignatureAlgorithm.HS256.getJcaName());
        Instant now = Instant.now();
        String jwtToken = Jwts.builder()
                .claim("id_usuario", access.getId_usuario())
                .claim("nombre_usuario", access.getNombre_usuario())
                .claim("id_persona", access.getId_persona())
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(now))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .signWith(hmacKey)
                .compact();

        return jwtToken;
    }

}
