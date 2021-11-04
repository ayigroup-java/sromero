package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class PersonaController {

    @Autowired
    OperationService operationService;

    @GetMapping("/getByLegajo")
    public String getPersonaPorLegajo(
            @RequestParam(name = "legajo") String id,
            Model model) {

        String response = operationService.getById(id);

        model.addAttribute("message", response);

        return "welcome";
    }

    @GetMapping("/getAll")
    public String getAllPersonas(
            Model model) {

        model.addAttribute("message", "Usuario");

        List<Persona> listPersonas = operationService.getAll();

        List<String> listPersonasNonbre = new ArrayList<>();


        Map<String, String> listPersonasNombre = listPersonas.stream().collect(
                Collectors.toMap(Persona::getNombre, Persona::getLegajo));

        model.addAttribute("tasks", listPersonasNombre);

        return "welcome_list";
    }
}
