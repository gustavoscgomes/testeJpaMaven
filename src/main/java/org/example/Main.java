package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setEmail("guga@gmail.com");

        Pessoa pessoa2 = new Pessoa(null, "Andrea", "andrea@hotmail.com");

        em.getTransaction().begin();
        em.persist(pessoa);
        em.persist(pessoa2);
        em.getTransaction().commit();
        em.close();
        System.out.println("Pronto");
    }
}