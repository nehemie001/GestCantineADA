package ci.digitalacademy.examen.services.mapper;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {
}
