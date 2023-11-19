package main.java.com.lab111.labwork5;

public interface Iterable<T> {

    Iterator<T> iterator();


    void directOrder(Iterator<T> iterator);


    void reverseOrder(Iterator<T> iterator);
}
