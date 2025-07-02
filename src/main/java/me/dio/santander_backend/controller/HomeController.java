package me.dio.santander_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Santander Backend API");
        model.addAttribute("description", "API RESTful criada para a Santander Dev Week 2025");
        model.addAttribute("version", "1.0.0");
        return "index";
    }
}
