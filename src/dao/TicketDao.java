package dao;

import Entidades.Ticket;

/**
 *
 * @author Roberto Sottini
 */
public class TicketDao extends Dao<Ticket> {

    public TicketDao() {
        super(Ticket.class);
    }
    
    public Long contarAsientosOcupados(Long idFuncion) {
        String consultaContarAsientosOcupados
                = "SELECT count(f) "
                + "FROM Entidades.Ticket ti "
                + "LEFT JOIN ti.funcion f "
                + "WHERE f.id = " + idFuncion
                + "";
        
        return (Long) getEm().createQuery(consultaContarAsientosOcupados).getSingleResult();
    }
    
}
