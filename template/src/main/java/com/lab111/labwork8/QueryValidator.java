package main.java.com.lab111.labwork8;

import java.util.Scanner;

public class QueryValidator {
    private Database database;

    public QueryValidator(Database database) {
        this.database = database;
    }

    public void makeQuery(String queryTableName) {
        boolean tableIsFound = false;
        for (RelationalTable table : database.getTables()) {
            if (queryTableName.equalsIgnoreCase(table.getName())) {
                System.out.println("Створено запит до таблиці: " + table.getName());
                tableIsFound = true;
            }
        }
        if (!tableIsFound) {
            System.out.println("Виникла помилка");
        }
    }
}
