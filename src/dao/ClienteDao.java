package dao;

import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Roberto Sottini
 */
public class ClienteDao extends Dao<Cliente> {

    public ClienteDao() {
        super(Cliente.class);
    }
    
    public List<Cliente> getClientes() {
        return getEm().createQuery("SELECT c FROM Entidades.Cliente c ORDER BY c.apellido, c.nombre, c.documento").getResultList();
    }
}
