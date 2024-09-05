package ci.digitalacademy.examen.services;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import ci.digitalacademy.examen.services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    MenuDTO save(MenuDTO menuDTO);

    Menu update(MenuDTO menuDTO);

    Optional<MenuDTO> findOne(Long id);

    List<MenuDTO> findAll();

    void delete(Long id);
}
