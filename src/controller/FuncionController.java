package controller;

import Entidades.Funcion;
import Entidades.Teatro;
import Entidades.Ticket;
import dao.FuncionDao;
import java.sql.Date;

/**
 *
 * @author Roberto Sottini
 */
public class FuncionController {

    FuncionDao funcionDao = new FuncionDao();
    Funcion funcion = new Funcion();
    Ticket ticket = new Ticket();
    Teatro teatro = new Teatro();

    public FuncionController(
            Date fecha,
            String nombre,
            Double precio,
            Long idTeatro
    ) {
        teatro.setId(idTeatro);
        funcion.setFecha(fecha);
        funcion.setNombre(nombre);
        funcion.setPrecio(precio);
        funcion.setTeatro(teatro);
    }
    
    // Constructor para modificar una función.
    public FuncionController(
            Long idFuncion,
            Date fecha,
            String nombre,
            Double precio,
            Long idTeatro
    ) {
        teatro.setId(idTeatro);
        funcion.setId(idFuncion);
        funcion.setFecha(fecha);
        funcion.setNombre(nombre);
        funcion.setPrecio(precio);
        funcion.setTeatro(teatro);   
    }
    
    public void insert() {
        funcionDao.add(funcion);
    }
    
    public void modificar() {
        funcionDao.edit(funcion);
    }

    public void borrar() {
        funcionDao.delete(funcion);
    }

}
