package com.example.demo.controller;

import com.example.demo.model.Cuenta;
import com.example.demo.model.Empleado;
import com.example.demo.model.InitElement;
import com.example.demo.services.OperationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/remove")
    public String removeByLegajo(@RequestParam(name = "id") Integer id) {
        try {
            operationService.removeByLegajo(id);
            return "borrado exitoso";
        } catch (Exception ex) {
            return "ocurrio un error en el delete";
        }
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/getEmpleado")
    public ResponseEntity getEmpleado(@RequestParam(name = "id") int id) {
        try {
            Empleado empleado = operationService.getEmpleadoById(id);

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(empleado);

            return ResponseEntity.ok(json);

        } catch (Exception ex) {
            ex.printStackTrace();
            String errorResponse = "Error en get de empleado: " + ex.getMessage() + " - " +
                    ex.getCause();

            return ResponseEntity.ok(errorResponse);
        }
    }

    @PostMapping("/newEmpleado")
    public String newEmpleado(
            @RequestParam(name = "legajo", defaultValue = "anonimo") String legajo,
            @RequestBody InitElement initElement){

        operationService.insertLegajo(legajo);

        System.out.println(initElement);
        return "Insertado Exitoso...";
    }
}
