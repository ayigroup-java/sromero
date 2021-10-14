/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.services;

import java.util.Random;
import com.sample.model.Persona;

/**
 *
 * @author sromero
 */
public class OperationsService {

    public static String concatenarDatos(String name) {

        Random random = new Random();

        String generatedString = random.ints(97, 122 + 1)
                .limit(10)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        
        Persona persona = new Persona(name, generatedString);

        return persona.getName() + " - Tu legajo es: " + persona.getLegajo();
    }
}
