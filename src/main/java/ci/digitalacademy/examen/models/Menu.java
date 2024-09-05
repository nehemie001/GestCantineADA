package ci.digitalacademy.examen.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "menu")
@ToString
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Column(name = "creation_date", nullable = false)
    private LocalDate creation_date;

    @OneToOne
    @JoinColumn(name = "id_plat")
    private Plat plat;
}
