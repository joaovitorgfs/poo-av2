package ui;

import dominio.Paciente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Retrieve {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("AV2-PU");
        EntityManager em = factory.createEntityManager();

        Paciente p1 = em.find(Paciente.class, 1);

        System.out.println(p1);

        em.close();
        factory.close();
    }
}
