package ci.digitalacademy.examen.services.dto;

import ci.digitalacademy.examen.models.Plat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MenuDTO {

    private Long id;

    private LocalDate creation_date;

    private Plat plat;

}
