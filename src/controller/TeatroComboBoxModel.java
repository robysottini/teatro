package controller;

import Entidades.Teatro;
import dao.TeatroDao;

/**
 *
 * @author Roberto Sottini
 */
public class TeatroComboBoxModel extends ATableModel {

    public TeatroComboBoxModel() {
        super(new TeatroDao(),
                new String[]{
                    "Id",
                    "Nombre",
                    "Capacidad",
                    "Calle",
                    "Número",
                    "Código postal"
                },
                new Class[]{
                    Long.class,
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
        Teatro t = (Teatro) getData().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getId();
            case 1:
                return t.getNombre();
            case 2:
                return t.getCapacidad();
            case 3:
                return t.getDireccion().getCalle();
            case 4:
                return t.getDireccion().getNumero();
            case 5:
                return t.getDireccion().getCodigoPostal();
        }
        return null;
    }

}
