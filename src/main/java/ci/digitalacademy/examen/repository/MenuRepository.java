package ci.digitalacademy.examen.repository;

import ci.digitalacademy.examen.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
