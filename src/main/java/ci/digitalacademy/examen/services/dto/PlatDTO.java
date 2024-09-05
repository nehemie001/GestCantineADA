package ci.digitalacademy.examen.services.dto;

import ci.digitalacademy.examen.models.Plat;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PlatDTO {

    private Long id;

    private String nom;

    private String summary;
}
