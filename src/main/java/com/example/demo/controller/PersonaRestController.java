package com.example.demo.controller;

import com.example.demo.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {

    @Autowired
    OperationService operationService;

    @PostMapping("/insertLegajo")
    public String addLegajo(
            @RequestParam(name = "name", required = false, defaultValue = "anonimo")
                    String name, Model model) {

        String legajo = operationService.insertLegajo(name);
        String message = name + ". Tu legajo es: " + legajo;

        return message;
    }

    @DeleteMapping("/remove")
    public String removeByLegajo(@RequestParam(name = "legajo") String legajo) {
        try {
            operationService.removeByLegajo(legajo);
            return "borrado exitoso";
        } catch (Exception ex) {
            return "ocurrio un error en el delete";
        }
    }
}
