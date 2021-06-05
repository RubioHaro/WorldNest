package com.rubio.haro.worldnest.dao;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class EntidadArrendatarioDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public EntidadArrendatarioDAO() {
        //emf = Persistence.createEntityManagerFactory("worldnest_jar_1.0Unit");

        emf = Persistence.createEntityManagerFactory("com.rubio.haro.worldnest_jar_1.0Unit");
        em = emf.createEntityManager();
    }

    public void create(EntidadArrendatario ee) {
        em.getTransaction().begin();
        em.persist(ee);
        em.getTransaction().commit();
    }

    public void create(LinkedList<EntidadArrendatario> arrendatarios) {
        em.getTransaction().begin();
        for (EntidadArrendatario entidadArrendatario : arrendatarios) {
            System.out.println(entidadArrendatario);
            em.persist(entidadArrendatario);
        }
        em.getTransaction().commit();
    }

    public EntidadArrendatario read(EntidadArrendatario ee) {
        TypedQuery<EntidadArrendatario> query;
        query = em.createQuery("SELECT e FROM EntidadArrendatario e WHERE e.eid=" + ee.getEid(), EntidadArrendatario.class);
        ee = query.getSingleResult();
        return ee;
    }

    public List<EntidadArrendatario> read() {
        TypedQuery<EntidadArrendatario> query;
        query = em.createQuery("SELECT e FROM EntidadArrendatario e", EntidadArrendatario.class);
        List<EntidadArrendatario> emps = query.getResultList();
        return emps;
    }

    public void update(EntidadArrendatario ee) {
        EntidadArrendatario unArrendatario = read(ee);
        if (unArrendatario != null) {
            unArrendatario.setEdireccion(ee.getEdireccion());
            unArrendatario.setEnombre(ee.getEnombre());
            unArrendatario.setEtelefono(ee.getEtelefono());
        }
    }

    public void delete(EntidadArrendatario ee) {
        ee = read(ee);
        em.getTransaction().begin();
        em.remove(ee);
        em.getTransaction().commit();
    }

    public void close() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }
}
