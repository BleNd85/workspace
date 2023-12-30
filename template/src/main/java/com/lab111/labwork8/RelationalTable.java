package main.java.com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which is used to create relation tables
 *
 * @author Vladyslav
 */
public class RelationalTable {
    /**
     * Field that represents name of the table
     */
    private String tableName;
    /**
     * Field that represents columns in the table
     */
    private List<String> columns;

    /**
     * Constructor of RelationalTables
     *
     * @param tableName Name of the table
     */
    public RelationalTable(String tableName) {
        this.tableName = tableName;
        this.columns = new ArrayList<>();
    }

    /**
     * Method to add columns to the table
     *
     * @param column Name of the column
     */
    public void addColumn(String column) {
        columns.add(column);
    }

    /**
     * Method to remove columns to the table
     *
     * @param column Name of the column
     */
    public void removeColumn(String column) {
        columns.remove(column);
    }

    /**
     * Method to get name of the table
     *
     * @return Name of the table
     */
    public String getName() {
        return tableName;
    }

    /**
     * Method to get columns of the table
     *
     * @return Columns of the table
     */
    public List<String> getColumns() {
        return columns;
    }

}
