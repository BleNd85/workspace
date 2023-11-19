package main.java.com.lab111.labwork5;

/**
 * Defines a method that returns an iterator for a specific collection and methods for iteration in different orders
 *
 * @author Vladyslav
 */
public interface Iterable<T> {
    /**
     * Method that returns an iterator for a specific collection
     *
     * @return Iterator for a specific collection
     */

    Iterator<T> iterator();

    /**
     * Iterates in direct order
     *
     * @param iterator iterator instance
     */
    void directOrder(Iterator<T> iterator);

    /**
     * Iterates in reverse order
     *
     * @param iterator iterator instance
     */
    void reverseOrder(Iterator<T> iterator);
}
