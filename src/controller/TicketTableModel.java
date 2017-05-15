package controller;

import Entidades.Funcion;
import Entidades.Ticket;
import dao.FuncionDao;
import dao.TicketDao;
import java.sql.Date;

/**
 *
 * @author Roberto Sottini
 */
public class TicketTableModel extends ATableModel {

    public TicketTableModel() {
        super(new TicketDao(),
                new String[]{
                    "Nº ticket",
                    "Fecha venta",
                    "Id cliente",
                    "Cliente",
                    "Id función",
                    "Función",
                    "Fecha función",
                    "Teatro"
                },
                new Class[]{
                    Long.class,
                    Date.class,
                    Integer.class,
                    String.class,
                    Integer.class,
                    String.class,
                    Date.class,
                    String.class
                }
        );
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ticket t = (Ticket) getData().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getId();
            case 1:
                return t.getFechaVenta();
            case 2:
                return t.getCliente().getId();
            case 3:
                return t.getCliente().toString();
            case 4:
                return t.getFuncion().getId();
            case 5:
                return t.getFuncion().getNombre();
            case 6:
                return t.getFuncion().getFecha();
            case 7:
                return t.getFuncion().getTeatro().getNombre();
        }
        return null;
    }

}
