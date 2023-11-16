package main.java.com.lab111.labwork5;

public interface Iterator<T> {
    boolean hasNext();

    boolean hasPrevious();

    T next();

    T previous();

}
