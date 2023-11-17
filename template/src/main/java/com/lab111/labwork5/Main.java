package main.java.com.lab111.labwork5;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        Iterator<String> iterator = collection.iterator();
        collection.directOrder(iterator);
        collection.reverseOrder(iterator);
    }
}

