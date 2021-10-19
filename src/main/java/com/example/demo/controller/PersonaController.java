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

@Controller
public class PersonaController {

    @Autowired
    OperationService operationService;

    @GetMapping("/getByLegajo")
    public String getPersonaPorLegajo(
            @RequestParam(name = "legajo") String legajo,
            Model model) {

        String response = operationService.getByLegajo(legajo);

        model.addAttribute("message", response);

        return "welcome";
    }

    @GetMapping("/getAll")
    public String getAllPersonas(
            Model model) {

        model.addAttribute("message", "Usuario");

        List<Persona> listPersonas = operationService.getAll();

        List<String> listPersonasNonbre = new ArrayList<>();

        for(int i=0; i< listPersonas.size(); i++) {
            listPersonasNonbre.add(listPersonas.get(i).getNombre());
        }

        model.addAttribute("tasks", listPersonasNonbre);

        return "welcome_list";
    }
}
