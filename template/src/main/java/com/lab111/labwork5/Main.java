package main.java.com.lab111.labwork5;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.addStringList();
        Iterator<String> stringIterator = collection.iterator();
        collection.directOrder(stringIterator);
        collection.reverseOrder(stringIterator);
        collection.addIntList();
        Iterator<String> integerIterator = collection.iterator();
        collection.directOrder(integerIterator);
        collection.reverseOrder(integerIterator);
    }
}
