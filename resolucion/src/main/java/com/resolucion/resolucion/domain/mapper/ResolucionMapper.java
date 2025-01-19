package com.resolucion.resolucion.domain.mapper;

import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.domain.dto.resolucion.ResolucionDTO;
import com.resolucion.resolucion.domain.dto.resolucion.ResolucionSaveDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ResolucionMapper {

    // Convierte de entidad a DTO (para leer o actualizar, incluye el id)
    @Mapping(target = "idResolucion", source = "id_resolucion")  // Mapea id_resolucion de la entidad a idResolucion en el DTO
    @Mapping(target = "idArchivo", source = "archivo.id_archivo") // Mapea id_archivo de la entidad Archivo a idArchivo en el DTO
    @Mapping(target = "idSolicitud", source = "solicitud.id_solicitud")  // Mapea id_solicitud de la entidad Solicitud a idSolicitud en el DTO
    ResolucionDTO toDto(Resolucion resolucion);

    // Convierte DTO (para guardar) a la entidad
    @Mapping(target = "id_resolucion", source = "idResolucion") // Mapea idResolucion del DTO a id_resolucion en la entidad
    @Mapping(target = "archivo.id_archivo", source = "idArchivo") // Mapea idArchivo del DTO a archivo.id_archivo de la entidad
    @Mapping(target = "solicitud.id_solicitud", source = "idSolicitud")  // Mapea idSolicitud del DTO a solicitud.id_solicitud de la entidad
    Resolucion toEntityFromDto(ResolucionDTO resolucionDTO);

    // Convierte DTO de creación (sin el ID) a entidad
    @Mapping(target = "id_resolucion", ignore = true)  // No mapea el id
    @Mapping(target = "archivo.id_archivo", source = "idArchivo")  // Mapea idArchivo del DTO a archivo.id_archivo
    @Mapping(target = "solicitud.id_solicitud", source = "idSolicitud")  // Mapea idSolicitud del DTO a solicitud.id_solicitud
    Resolucion toResolution(ResolucionSaveDTO resolucionSaveDTO);
}
