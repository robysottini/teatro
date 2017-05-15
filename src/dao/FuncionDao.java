package dao;

import Entidades.Funcion;
import java.util.List;

/**
 *
 * @author Roberto Sottini
 */
public class FuncionDao extends Dao<Funcion> {

    public FuncionDao() {
        super(Funcion.class);
    }
    
    public List<Funcion> getFunciones() {
        String consultaSelect
                = "SELECT f "
                + "FROM Entidades.Funcion f "
                + "WHERE f.fecha >= current_date "
                + "";
        
        return getEm().createQuery(consultaSelect).getResultList();
    }
    
    public Integer contarAsientos(Long idFuncion) {
        String consultaContarAsientos 
                = "SELECT te.capacidad "
                + "FROM Entidades.Funcion f "
                + "LEFT JOIN f.teatro te "
                + "WHERE f.id = " + idFuncion
                + "";
        
        return (Integer) getEm().createQuery(consultaContarAsientos).getSingleResult();
    }

}
