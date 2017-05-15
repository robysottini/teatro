package controller;

import Entidades.Direccion;
import Entidades.Cliente;
import dao.DireccionDao;
import dao.ClienteDao;

/**
 *
 * @author Roberto Sottini
 */
public class ClienteController {

    ClienteDao clienteDao = new ClienteDao();
    DireccionDao direccionDao = new DireccionDao();
    Cliente cliente = new Cliente();
    Direccion direccion = new Direccion();

    public ClienteController(
            Integer documento,
            String nombre,
            String apellido,
            Integer telefono,
            String calle,
            Integer numero,
            Integer codigoPostal
    ) {
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setCodigoPostal(codigoPostal);
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
    }
    
    public ClienteController(
            Long idCliente,
            Integer documento,
            String nombre,
            String apellido,
            Integer telefono,
            String calle,
            Integer numero,
            Integer codigoPostal
    ) {
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setCodigoPostal(codigoPostal);
        cliente.setId(idCliente);
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);    
    }

    /**
     * 
     */
    public void insert() {
        clienteDao.add(cliente);
    }
    
    /**
     * 
     */
    public void modificar() {
        clienteDao.edit(cliente);
    }

    /**
     * 
     */
    public void borrar() {
        clienteDao.delete(cliente);
    }

}
