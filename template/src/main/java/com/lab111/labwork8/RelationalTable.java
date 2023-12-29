package main.java.com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

public class RelationalTable {
    private String tableName;
    private List<String> columns;

    public RelationalTable(String tableName) {
        this.tableName = tableName;
        this.columns = new ArrayList<>();
    }

    public void addColumn(String column) {
        columns.add(column);
    }

    public void removeColumn(String column) {
        columns.remove(column);
    }

    public String getName() {
        return tableName;
    }

    public List<String> getColumns() {
        return columns;
    }

}
