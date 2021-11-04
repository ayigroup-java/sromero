package com.example.demo.repositories;

import com.example.demo.model.Persona;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithEntityManager(Persona persona) {
        this.entityManager.persist(persona);
    }

    @Transactional
    public Persona getPersonaWithEntityManager(String legajo) {
        return this.entityManager.find(Persona.class, legajo);
    }

    @Transactional
    public List<Persona> findAll() {
        return entityManager.createQuery("from Persona").getResultList();
    }

    @Transactional
    public void removeByLegajo(String legajo) {
        Persona persona = getPersonaWithEntityManager(legajo);
        try{
            entityManager.remove(persona);
        } catch (Exception ex) {
            System.out.println("Exception en removeor por legajo: ");
            System.out.println(ex.getMessage());
        }
    }
}
