package controller;

import Entidades.Funcion;
import dao.FuncionDao;
import java.sql.Date;
import java.text.DecimalFormat;

/**
 *
 * @author Roberto Sottini
 */
public class FuncionTableModel extends ATableModel {

    public FuncionTableModel() {
        super(new FuncionDao(),
                new String[]{
                    "Id",
                    "Fecha",
                    "Nombre",
                    "Precio",
                    "Id teatro",
                    "Teatro"
                },
                new Class[]{
                    Long.class,
                    Date.class,
                    String.class,
                    String.class,
                    Integer.class,
                    String.class
                }
        );
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcion f = (Funcion) getData().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return f.getId();
            case 1:
                return f.getFecha();
            case 2:
                return f.getNombre();
            case 3:
                DecimalFormat df = new DecimalFormat("0.00");
                String precioConDecimales = df.format(f.getPrecio());
                return precioConDecimales;
            case 4:
                return f.getTeatro().getId();
            case 5:
                return f.getTeatro().getNombre();
        }
        return null;
    }

}
