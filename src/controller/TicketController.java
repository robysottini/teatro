package controller;

import Entidades.Cliente;
import Entidades.Funcion;
import Entidades.Teatro;
import Entidades.Ticket;
import dao.ClienteDao;
import dao.FuncionDao;
import dao.TicketDao;
import java.sql.Date;

/**
 *
 * @author Roberto Sottini
 */
public class TicketController {

    ClienteDao clienteDao = new ClienteDao();
    FuncionDao funcionDao = new FuncionDao();
    TicketDao ticketDao = new TicketDao();
    Cliente cliente = new Cliente();
    Funcion funcion = new Funcion();
    Teatro teatro = new Teatro();
    Ticket ticket = new Ticket();

    // Constructor para guardar un ticket.
    public TicketController(
            Date fechaVenta,
            Long idCliente,
            Long idFuncion
    ) {
        cliente.setId(idCliente);
        funcion.setId(idFuncion);
        ticket.setFechaVenta(fechaVenta);
        ticket.setCliente(cliente);
        ticket.setFuncion(funcion);
    }
    
    // Constructor para modificar un ticket.
    public TicketController(
            Long idTicket,
            Date fechaVenta,
            Long idCliente,
            Long idFuncion
    ) {        
        cliente.setId(idCliente);
        funcion.setId(idFuncion);
        ticket.setId(idTicket);
        ticket.setFechaVenta(fechaVenta);
        ticket.setCliente(cliente);
        ticket.setFuncion(funcion);
    }
    
    public void insert() {
        ticketDao.add(ticket);
    }
    
    public void modificar() {
        ticketDao.edit(ticket);
    }

    public void borrar() {
        ticketDao.delete(ticket);
    }

}
