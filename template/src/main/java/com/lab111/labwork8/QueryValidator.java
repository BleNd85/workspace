package main.java.com.lab111.labwork8;

/**
 * Class which implements method that is used to make query to the database
 *
 * @author Vladyslav
 */
public class QueryValidator {
    /**
     * Field that represents database instance
     */
    private Database database;

    /**
     * Constructor of QueryValidator class
     *
     * @param database Database Instance
     */

    public QueryValidator(Database database) {
        this.database = database;
    }

    /**
     * Method to create to the table form database
     *
     * @param tableInstance Instance of a RelationTable table
     */
    public void makeQuery(RelationalTable tableInstance) {
        boolean tableIsFound = false;
        for (RelationalTable table : database.getTables()) {
            if (tableInstance.equals(table)) {
                System.out.println("Створено запит до таблиці: " + table.getName());
                tableIsFound = true;
            }
        }
        if (!tableIsFound) {
            System.out.println("Виникла помилка");
        }
    }
}
