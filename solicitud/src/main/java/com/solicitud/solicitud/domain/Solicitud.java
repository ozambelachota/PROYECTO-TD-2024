package com.solicitud.solicitud.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Document(collection = "solicitud") // "collection" especifica la colección en MongoDB
@Data
public class Solicitud {
    @Id
    private String id_solicitud; // Esto mapea automáticamente el campo "_id" en MongoDB

    private Date fecha; // MongoDB almacenará esto como ISODate

    private String comentario;

    private String fase;

    private String tipo;
}
