package com.crud.estudiante.controlador;

import com.crud.estudiante.interfaceService.IestudianteService;
import com.crud.estudiante.modelo.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IestudianteService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Estudiante> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Estudiante());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Valid Estudiante p, Model model){
        service.save(p);
        return "redirect:/listar";
    }
}
