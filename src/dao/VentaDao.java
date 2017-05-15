package dao;

import Entidades.Funcion;
import Entidades.Ticket;
import java.util.List;

/**
 *
 * @author Roberto Sottini
 */
public class VentaDao extends Dao<VentaDao> {

    public VentaDao() {
        super(VentaDao.class);
    }
    
//    public List<Ticket> getVentas() {
//        String consultaSelect = "SELECT t FROM Entidades.Ticket t";
//        return getEm().createQuery(consultaSelect).getResultList();
//    }
    
}
