package com.example.demo.services;

import com.example.demo.model.Persona;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OperationService {

    @Autowired
    private PersonaRepository personaRepository;

    public String insertLegajo(String name) {

        Persona persona = new Persona();

        try {
            Random random = new Random();

            String generatedString = random.ints(97, 122 + 1)
                    .limit(10)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            persona.setLegajo(generatedString);
            persona.setId(generatedString);
            persona.setNombre(name);

            personaRepository.insertWithEntityManager(persona);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return persona.getLegajo();
    }

    public String getByLegajo(String legajo) {
        Persona persona = personaRepository.getPersonaWithEntityManager(legajo);

        String message = "El legajo de " + persona.getNombre() + " es " + persona.getLegajo();

        return message;
    }

    public List<Persona> getAll() {
        List<Persona> listPersonas = personaRepository.findAll();

        return listPersonas;
    }

    public void removeByLegajo(String legajo) {
        personaRepository.removeByLegajo(legajo);
    }
}
