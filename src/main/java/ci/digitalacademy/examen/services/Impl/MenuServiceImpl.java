package ci.digitalacademy.examen.services.Impl;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.repository.MenuRepository;
import ci.digitalacademy.examen.services.MenuService;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import ci.digitalacademy.examen.services.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;
    /**
     * @param menuDTO
     * @return
     */
    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuMapper.toDto(menu);
    }

    /**
     * @param menuDTO
     * @return
     */
    @Override
    public Menu update(MenuDTO menuDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return menuRepository.findById(id).map(menu -> {
            return menuMapper.toDto(menu);
        });
    }

    /**
     * @return
     */
    @Override
    public List<MenuDTO> findAll() {
        log.debug("Request to get menu plat");
        return menuRepository.findAll().stream().map(menu -> {
            return menuMapper.toDto(menu);
        }).toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}
