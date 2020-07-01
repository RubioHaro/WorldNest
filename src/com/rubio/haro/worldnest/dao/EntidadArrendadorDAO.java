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
public class EntidadArrendadorDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public EntidadArrendadorDAO() {
        emf = Persistence.createEntityManagerFactory("WorldNestDesktopPU");
        em = emf.createEntityManager();
    }

    public void create(EntidadArrendador ee) {
        em.getTransaction().begin();
        em.persist(ee);
        em.getTransaction().commit();
    }

    public void create(LinkedList<EntidadArrendador> arrendatarios) {
        em.getTransaction().begin();
        for (EntidadArrendador entidadArrendatario : arrendatarios) {
            em.persist(entidadArrendatario);
        }
        em.getTransaction().commit();
    }

    public EntidadArrendador read(EntidadArrendador ee) {
        TypedQuery<EntidadArrendador> query;
        query = em.createQuery("SELECT e FROM EntidadArrendador e WHERE e.enombre='" + ee.getEnombre() + "'", EntidadArrendador.class);
        ee = query.getSingleResult();
        return ee;
    }

    public List<EntidadArrendador> read() {
        TypedQuery<EntidadArrendador> query;
        query = em.createQuery("SELECT e FROM EntidadArrendador e", EntidadArrendador.class);
        List<EntidadArrendador> emps = query.getResultList();
        return emps;
    }

    public void update(EntidadArrendador ee) {
        EntidadArrendador unArrendatario = read(ee);
        if (unArrendatario != null) {
            unArrendatario.setEdireccion(ee.getEdireccion());
            unArrendatario.setEnombre(ee.getEnombre());
            unArrendatario.setEtelefono(ee.getEtelefono());
        }
    }

    public void delete(EntidadArrendador ee) {
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
