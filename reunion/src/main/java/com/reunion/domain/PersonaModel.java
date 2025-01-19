package com.reunion.domain;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "persona")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaModel {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_persona;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "correo")
    private String correo;

    @Column(name = "cargo")
    private String cargo;
    
    @Column(name = "estado")
    private char estado;
    
    @Column(name = "creado_usuario", nullable = true)
    private Integer creadoUsuario;
  
    @Column(name = "creado_fecha", nullable = true)
    private Date creadoFecha;
  
    @Column(name = "modificado_usuario", nullable = true)
    private Integer modificadoUsuario;
  
    @Column(name = "modificado_fecha", nullable = true)
    private Date modificadoFecha;
  
    @Column(name = "eliminacion_usuario", nullable = true)
    private Integer eliminacionUsuario;
  
    @Column(name = "eliminacion_fecha", nullable = true)
    private Date eliminacionFecha;
}
