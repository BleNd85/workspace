package main.java.com.lab111.labwork5;

/**
 * Defines a method that returns if collection has next or previous and next or previous elements of this collection
 *
 * @author Vladyslav
 */
public interface Iterator<T> {
    /**
     * Method that returns the presence of the following element of the collection
     *
     * @return the presence of the following element
     */
    boolean hasNext();

    /**
     * Method that returns the presence of the previous element of the collection
     *
     * @return the presence of the previous element
     */
    boolean hasPrevious();

    /**
     * Method that returns the following element of the collection
     *
     * @return the following element
     */
    T next();

    /**
     * Method that returns the previous element of the collection
     *
     * @return the previous element
     */
    T previous();

}
