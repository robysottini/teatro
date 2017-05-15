package controller;

import Entidades.Direccion;
import Entidades.Teatro;
import dao.DireccionDao;
import dao.TeatroDao;

/**
 *
 * @author Roberto Sottini
 */
public class TeatroController {

    TeatroDao teatroDao = new TeatroDao();
    DireccionDao direccionDao = new DireccionDao();
    Teatro teatro = new Teatro();
    Direccion direccion = new Direccion();

    public TeatroController(
            String nombre,
            Integer capacidad,
            String calle,
            Integer numero,
            Integer codigoPostal
    ) {
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setCodigoPostal(codigoPostal);
        teatro.setNombre(nombre);
        teatro.setCapacidad(capacidad);
        teatro.setDireccion(direccion);
    }
    
    public TeatroController(
            Long idTeatro,
            String nombre,
            Integer capacidad,
            String calle,
            Integer numero,
            Integer codigoPostal
    ) {
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setCodigoPostal(codigoPostal);
        teatro.setId(idTeatro);
        teatro.setNombre(nombre);
        teatro.setCapacidad(capacidad);
        teatro.setDireccion(direccion);    
    }

    /**
     * 
     */
    public void insert() {
        teatroDao.add(teatro);
    }
    
    /**
     * 
     */
    public void modificar() {
        teatroDao.edit(teatro);
    }

    /**
     * 
     */
    public void borrar() {
        teatroDao.delete(teatro);
    }

}
