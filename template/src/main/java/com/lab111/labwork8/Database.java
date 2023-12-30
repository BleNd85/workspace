package main.java.com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton pattern class which represents database,
 * implements a method that allows creation of only one instance of this class
 *
 * @author Vladyslav
 */
public class Database {
    /**
     * Filed that represents unique instance of Database class
     */
    private static Database instance;
    /**
     * Field that represents list of tables that are contained in database
     */
    private List<RelationalTable> tables;

    /**
     * Private constructor of Database class
     */
    private Database() {
        tables = new ArrayList<>();
    }

    /**
     * Method to access the unique instance of this class
     *
     * @return Unique instance of this class
     */
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    /**
     * Method to add tables to the database
     *
     * @param table Instance of RelationTable class
     */
    public void addTable(RelationalTable table) {
        tables.add(table);

    }

    /**
     * Method to remove table from the database
     *
     * @param table Instance of RelationTable class
     */
    public void removeTable(RelationalTable table) {
        tables.remove(table);
    }

    /**
     * Method to get list of tables that are contained in database
     *
     * @return list of tables that are contained in database
     */
    public List<RelationalTable> getTables() {
        return tables;
    }
}
