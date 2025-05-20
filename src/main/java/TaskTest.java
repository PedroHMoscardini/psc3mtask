import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

import java.util.Scanner;

public class TaskTest {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        try {
            new Register(em);

        } finally {
            em.close();
            emf.close();
        }
    }
}