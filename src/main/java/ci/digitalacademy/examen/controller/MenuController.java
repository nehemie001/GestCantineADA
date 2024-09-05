package ci.digitalacademy.examen.controller;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.MenuService;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model) {
        List<MenuDTO> menus = menuService.findAll();
        model.addAttribute("menus", menus);
        return "menus/list";
    }

    @PostMapping
    public String save(MenuDTO platDTO){
        menuService.save(platDTO);
        return "redirect:/menus";
    }

    @GetMapping("/add")
    public String showAddPlatPage(Model model) {
        log.debug("Request to show add menu forms");
        model.addAttribute("menu", new Menu());
        return "menus/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateMenuForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Rquest to show update menu forms");
        Optional<MenuDTO> menu = menuService.findOne(id);
        if (menu.isPresent()){
            model.addAttribute("menu", menu.get());
            return "menus/forms";
        } else {
            return "redirect:/menus";
        }
    }
}
