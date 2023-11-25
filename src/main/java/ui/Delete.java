package ui;

import dominio.Exame;
import dominio.Paciente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Delete {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("AV2-PU");
        EntityManager em = factory.createEntityManager();

        Paciente p1 = em.find(Paciente.class, 1);

        em.getTransaction().begin();
        em.remove(p1);
        em.getTransaction().commit();

        factory.close();
        em.close();
    }
}
