package main.java.com.lab111.labwork5;

public interface Iterable {

    Iterator<String> iterator();


    void directOrder(Iterator<String> iterator);


    void reverseOrder(Iterator<String> iterator);
}
