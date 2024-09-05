package ci.digitalacademy.examen.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "plat")
@ToString
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "summary", nullable = false)
    private String summary;

}
