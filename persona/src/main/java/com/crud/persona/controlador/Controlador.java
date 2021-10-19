package com.crud.persona.controlador;

import com.crud.persona.interfaceService.IpersonaService;
import com.crud.persona.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }

    @PostMapping("/editar{codsis}")
    public String save(@PathVariable int codsis, Model model){
        Optional<Persona> persona = service.listarCodsis(codsis);
        model.addAttribute("persona", persona);
        return "form";
    }

    @GetMapping("/eliminar/{codsis}")
    public String delete(Model model, @PathVariable int codsis){
        service.delete(codsis);
        return "redirect:listar";
    }
}
