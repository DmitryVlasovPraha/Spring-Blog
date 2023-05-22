package com.crud.javacrud.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home"; // возврат шаблона с именем home
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Главная страница");
        return "about"; // возврат шаблона с именем home
    }

}