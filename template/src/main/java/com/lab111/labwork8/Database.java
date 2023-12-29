package main.java.com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance;
    private List<RelationalTable> tables;

    Database() {
        tables = new ArrayList<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();

        }
        return instance;
    }

    public void addTable(RelationalTable table) {
        tables.add(table);

    }

    public void removeTable(RelationalTable table) {
        tables.remove(table);
    }

    public List<RelationalTable> getTables() {
        return tables;
    }

}
