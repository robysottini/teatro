package dao;

import Entidades.Teatro;
import java.util.List;

/**
 *
 * @author Roberto Sottini
 */
public class TeatroDao extends Dao<Teatro> {

    public TeatroDao() {
        super(Teatro.class);
    }
    
    public List<Teatro> getTeatros() {
        return getEm().createQuery("SELECT t FROM Entidades.Teatro t ORDER BY t.nombre").getResultList();
    }
    
}
