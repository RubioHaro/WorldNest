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
public class EntidadEmpleadoDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public EntidadEmpleadoDAO() {
        emf = Persistence.createEntityManagerFactory("com.rubio.haro.worldnest_jar_1.0Unit");
        em = emf.createEntityManager();
    }

    public void create(EntidadEmpleado ee) {
        em.getTransaction().begin();
        em.persist(ee);
        em.getTransaction().commit();
    }

    public void create(LinkedList<EntidadEmpleado> empleados) {
        em.getTransaction().begin();
        for (EntidadEmpleado ee : empleados) {
            System.out.println(ee);
            em.persist(ee);
        }
        em.getTransaction().commit();
    }

    public EntidadEmpleado read(EntidadEmpleado ee) {
        TypedQuery<EntidadEmpleado> query;
        query = em.createQuery("SELECT e FROM EntidadEmpleado e WHERE e.eid=" + ee.getEid(), EntidadEmpleado.class);
        ee = query.getSingleResult();
        return ee;
    }

    public List<EntidadEmpleado> read() {
        TypedQuery<EntidadEmpleado> query;
        query = em.createQuery("SELECT e FROM EntidadEmpleado e", EntidadEmpleado.class);
        List<EntidadEmpleado> emps = query.getResultList();
        return emps;
    }

    public void update(EntidadEmpleado ee) {
        EntidadEmpleado unEmpleado = read(ee);
        if (unEmpleado != null) {
            unEmpleado.setEsalario(ee.getEsalario());
            unEmpleado.setEnombre(ee.getEnombre());
            unEmpleado.setEgrado(ee.getEgrado());
        }
    }

    public void delete(EntidadEmpleado ee) {
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
