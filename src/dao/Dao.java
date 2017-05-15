package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Roberto Sottini
 * @param <T>
 */
public class Dao<T> {

    Class entityClass;
    EntityManager em;
    EntityManagerFactory emf;
    public Dao(Class entityClass) {
        this.entityClass = entityClass;
        emf = Persistence.createEntityManagerFactory("TeatroPU");
    }
    
    public Integer count() {
        return (Integer) getEm().createQuery("SELECT count(m) FROM " + entityClass.getName() + " m").getSingleResult();
    }

    public List getAll() {
        return getEm().createQuery("SELECT m FROM " + entityClass.getName() + " m").getResultList();
    }

    public EntityManager getEm() {
        return emf.createEntityManager();
    }

    /**
     * Add de BREAD.
     * @param entity La entidad que se quiere agregar.
     * @return 
     */
    public T add(T entity) {
       EntityManager em = this.getEm();
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            System.out.println("Persist guardar ok.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            //System.out.println("mal");
            System.out.println(e);
        }
        em.close();
        return entity;
    }

    /**
     * Edit de BREAD.
     * @param entity La entidad que se quiere modificar.
     * @return 
     */
    public T edit(T entity) {
        EntityManager em;
        em = this.getEm();
        em.getTransaction().begin();
        try {
            em.merge(entity);
            em.getTransaction().commit();
            System.out.println("Se editó la entidad: " + entity.toString());
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al editar la entidad.");
            System.out.println(e);
        }
        em.close();
        return entity;
    }

    /**
     * Edit de BREAD.
     * @param entity La entidad que se quiere modificar.
     * @return 
     */
    public T delete(T entity) {
        EntityManager em;
        em = this.getEm();
        em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
            System.out.println("Se borró la entidad: " + entity.toString());
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al borrar la entidad.");
            System.out.println(e);
        }
        em.close();
        return entity;
    }

    public T find(Long id) {
        return (T) this.getEm().find(entityClass, id);
    }

}
