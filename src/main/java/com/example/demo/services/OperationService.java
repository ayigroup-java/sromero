package com.example.demo.services;

import com.example.demo.model.Cuenta;
import com.example.demo.model.Empleado;
import com.example.demo.model.Persona;
import com.example.demo.repositories.EmpleadoJPARepository;
import com.example.demo.repositories.PersonaJPARepository;
import com.example.demo.repositories.PersonaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OperationService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private EmpleadoJPARepository empleadoJPARepository;

    @Autowired
    private PersonaJPARepository personaJPARepository;

    public String insertLegajo(String name) {

        Persona persona = new Persona();

        try {
            Random random = new Random();

            String generatedString = random.ints(97, 122 + 1)
                    .limit(10)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            long generatedLong = new Random().nextLong();


            persona.setLegajo(generatedString);
            persona.setId(generatedLong);
            persona.setNombre(name);

            persistWithJPA(persona);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return persona.getLegajo();
    }

    private void persistWithJPA(Persona persona) {
        personaJPARepository.save(persona);
    }

    private void persistWithEM(Persona persona) {
        personaRepository.insertWithEntityManager(persona);
    }

    public String getById(String id) {
        Persona persona = personaRepository.getPersonaWithEntityManager(id);

        String message = "El legajo de " + persona.getNombre() + " es " + persona.getLegajo();

        return message;
    }

    public Empleado getEmpleadoById(int id) {
        try {
            Empleado empleado = empleadoJPARepository.getById(id);
            return empleado;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public List<Persona> getAll() {
        List<Persona> listPersonas = personaJPARepository.findAll();

        return listPersonas;
    }

    public void removeByLegajo(Integer id) {
        empleadoJPARepository.deleteById(id);
    }
}
