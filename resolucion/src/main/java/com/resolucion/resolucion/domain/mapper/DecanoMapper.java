package com.resolucion.resolucion.domain.mapper;

import com.resolucion.resolucion.domain.Decano;
import com.resolucion.resolucion.domain.dto.decano.DecanoDto;
import com.resolucion.resolucion.domain.dto.decano.DecanoSaveDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DecanoMapper {

    DecanoDto toDTO(Decano decano);

    @Mapping(target = "idDecano", ignore = true)
    Decano toDecano(DecanoSaveDTO decanoSaveDTO);

    @Mapping(target = "idDecano", ignore = true)
    Decano toDecano(DecanoDto decanoDto);
}
