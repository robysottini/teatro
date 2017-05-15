package controller;

import dao.Dao;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Roberto Sottini
 */
public abstract class ATableModel extends AbstractTableModel {

    private ArrayList data;
    private Dao dao;
    String[] columns;
    Class[] tipos;

    protected String[] getColumns() {
        return this.columns;
    }

    protected Class[] getColumnClass() {
        return this.tipos;
    }

    public ATableModel(Dao dao, String[] columns, Class[] tipos) {
        this.dao = dao;
        this.columns = columns;
        this.tipos = tipos;
        this.update();
    }

    public ArrayList getData() {
        return data;
    }

    public void update() {
        data = new ArrayList(dao.getAll());
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return getData().size();
    }

    @Override
    public int getColumnCount() {
        return getColumns().length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return getColumns()[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getColumnClass()[columnIndex];
    }

    @Override
    public abstract Object getValueAt(int rowIndex, int columnIndex);

}
