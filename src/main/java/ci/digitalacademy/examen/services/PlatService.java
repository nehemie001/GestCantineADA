package ci.digitalacademy.examen.services;

import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);

    Plat updatePlat(PlatDTO platDTO);

    Optional<PlatDTO> findOne(Long id);

    List<PlatDTO> findAll();

    void delete(Long id);

    Plat getPlatByNom(String nom);


}
