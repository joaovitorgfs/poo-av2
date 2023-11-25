package ui;

import dominio.Paciente;
import dominio.Exame;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Create {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("AV2-PU");

        EntityManager em = factory.createEntityManager();


        em.getTransaction().begin();

        Exame e1 = new Exame();
        e1.setDescricao("Endoscopia");
        e1.setData(LocalDate.now());
        e1.setPreco(Double.valueOf("50"));

        List<Exame> exames = new ArrayList<>();
        exames.add(e1);

        Paciente p1 = new Paciente();
        p1.setNome("Julia Silva");
        p1.setRg("MG-1234567");
        p1.setEndereco("Rua Joaquim Pereira 700");
        p1.setTelefone("(31) 99999-9999");
        p1.setDataNascimento(LocalDate.now());
        p1.setProfissao("Herdeira");
        p1.setExames(exames);

        em.persist(e1);
        em.persist(p1);

        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}

