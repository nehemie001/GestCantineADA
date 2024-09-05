package ci.digitalacademy.examen.services.Impl;

import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.repository.PlatRepository;
import ci.digitalacademy.examen.services.PlatService;
import ci.digitalacademy.examen.services.dto.PlatDTO;
import ci.digitalacademy.examen.services.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private final PlatMapper platMapper;

    /**
     * @param platDTO
     * @return
     */
    @Override
    public PlatDTO save(PlatDTO platDTO) {
        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return platMapper.toDto(plat);
    }

    /**
     * @param platDTO
     * @return
     */
    @Override
    public Plat updatePlat(PlatDTO platDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return platRepository.findById(id).map(plat -> {
            return platMapper.toDto(plat);
        });
    }

    /**
     * @return
     */
    @Override
    public List<PlatDTO> findAll() {
        log.debug("Request to get all plat");
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDto(plat);
        }).toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        platRepository.deleteById(id);
    }

    /**
     * @param nom
     * @return
     */
    @Override
    public Plat getPlatByNom(String nom) {
        return null;
    }
}
