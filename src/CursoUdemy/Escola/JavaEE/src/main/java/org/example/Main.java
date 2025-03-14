package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Joao", "jvbm2177@gmail.com");
        Pessoa p2 = new Pessoa(null, "Lucas", "lucas@gmail.com");
        Pessoa p3 = new Pessoa(null,"Lara", "Lara@gmail.com");

        // "Crio a conexao"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJavaEE");
        EntityManager em = emf.createEntityManager();

        // persisto os dados (coloco eles no banco de dados"
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("adcionados ");

        // recuperar dados (retornar do banco de dados e tal
        Pessoa p = em.find(Pessoa.class, 1);
        System.out.println("encontrado ");

        // para excluir um dado tem que ser de alguem que acabou de ser encontrado no banco de dados
        // nao pode ser um classe nao monitorada
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();


        System.out.println(p);
    }
}
