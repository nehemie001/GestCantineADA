package ci.digitalacademy.examen.services.mapper;

import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat> {
}
