package ci.digitalacademy.examen.controller;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.PlatService;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import ci.digitalacademy.examen.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
@RequestMapping("/plats")
@RequiredArgsConstructor
public class PlatController {

    private final PlatService platService;

    @GetMapping
    public String showPlatPage(Model model) {
        List<PlatDTO> plats = platService.findAll();
        model.addAttribute("plats", plats);
        return "plats/list";
    }

    @PostMapping
    public String save(PlatDTO platDTO){
        platService.save(platDTO);
        return "redirect:/plats";
    }

    @GetMapping("/add")
    public String showAddPlatPage(Model model) {
        log.debug("Request to show add plat forms");
        model.addAttribute("plat", new Plat());
        return "plats/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateStudentForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Rquest to show update plat forms");
        Optional<PlatDTO> plat = platService.findOne(id);
        if (plat.isPresent()){
            model.addAttribute("plat", plat.get());
            return "plats/forms";
        } else {
            return "redirect:/plats";
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deletePlat(@PathVariable(name = "id") Long id) {
        try {
            platService.delete(id);
            return new ResponseEntity<>("Plat deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting plats", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
