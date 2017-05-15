package controller;

import Entidades.Direccion;
import Entidades.Cliente;
import dao.Dao;
import dao.ClienteDao;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Roberto Sottini
 */
public class ClienteTableModel extends ATableModel {

    public ClienteTableModel() {
        super(new ClienteDao(),
                new String[]{
                    "Id",
                    "Documento",
                    "Nombre",
                    "Apellido",
                    "Teléfono",
                    "Calle",
                    "Número",
                    "Codigo postal"
                },
                new Class[]{
                    Long.class,
                    Integer.class,
                    String.class,
                    String.class,
                    Integer.class,
                    String.class,
                    Integer.class,
                    Integer.class
                }
        );
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = (Cliente) getData().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getId();
            case 1:
                return c.getDocumento();
            case 2:
                return c.getNombre();
            case 3:
                return c.getApellido();
            case 4:
                return c.getTelefono();
            case 5:
                return c.getDireccion().getCalle();
            case 6:
                return c.getDireccion().getNumero();
            case 7:
                return c.getDireccion().getCodigoPostal();
        }
        return null;
    }

}
