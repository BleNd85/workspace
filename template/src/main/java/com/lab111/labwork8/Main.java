package main.java.com.lab111.labwork8;
/*Визначити специфікації класів для подання реляційної таблиці, схеми бази даних та
валідатора запитів до таблиці. Забезпечити можливість створення тільки одного примірника
схеми бази даних.*/

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        RelationalTable userTable = new RelationalTable("users");
        userTable.addColumn("id");
        userTable.addColumn("name");
        database.addTable(userTable);
        RelationalTable dataTable = new RelationalTable("userInfo");
        dataTable.addColumn("age");
        dataTable.addColumn("gender");
        database.addTable(dataTable);
        List<RelationalTable> tables = database.getTables();
        for (RelationalTable table : tables) {
            System.out.println(table.getName());
            System.out.println(table.getColumns());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву таблиці для запиту");
        String queryTableName = scanner.nextLine();
        QueryValidator queryValidator = new QueryValidator(database);
        queryValidator.makeQuery(queryTableName);
    }
}
