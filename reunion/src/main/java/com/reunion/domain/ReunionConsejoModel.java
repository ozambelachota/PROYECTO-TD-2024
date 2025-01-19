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
@Table(name = "reunion_consejo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReunionConsejoModel {
<<<<<<< HEAD
    @Id
<<<<<<< HEAD
<<<<<<< Updated upstream:reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_reunion")
    private Long id_reunion;
=======
>>>>>>> 2d944ff (eliminacion)

    
=======
    @Id    
>>>>>>> f6714bf (correcion de endpoint y creacion de tabla persona)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_reunion;

    @Column(name = "fecha")
    private Date fecha;

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> Stashed changes:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java


=======
>>>>>>> 2d944ff (eliminacion)
    public Long getId_reunion() {
        return id_reunion;
    }

    public void setId_reunion(Long id_reunion) {
        this.id_reunion = id_reunion;
    }
<<<<<<< HEAD

<<<<<<< HEAD:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java
=======
<<<<<<< Updated upstream:reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

=======
>>>>>>> Stashed changes:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java
>>>>>>> 77792ef (actualizacion):reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
=======
>>>>>>> 2d944ff (eliminacion)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

<<<<<<< HEAD
    
=======

>>>>>>> 2d944ff (eliminacion)
=======
    @Column(name = "tema")
    private String tema;
>>>>>>> f6714bf (correcion de endpoint y creacion de tabla persona)
    
    @Column(name = "tipo")
    private String tipo;

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
