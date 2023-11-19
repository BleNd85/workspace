package main.java.com.lab111.labwork5;

import java.util.List;

/**
 * Class which Implements Iterator interface for a specific collection
 *
 * @author Vladyslav
 */
public class MyIterator<T> implements Iterator<T> {
    /**
     * Field of the list of elements which is being iterated
     */
    private List<T> collection;
    /**
     * Starting position of the iterator
     */
    private int headPosition = 0;
    /**
     * Starting position from the end of the iterator
     */
    private int tailPosition;

    /**
     * Constructor of MyIterator
     *
     * @param collection list of elements which is being iterated
     */

    public MyIterator(List<T> collection) {
        this.collection = collection;
        this.tailPosition = collection.size() - 1;
    }

    /**
     * Method that checks if collection has next element
     *
     * @return if collection has next element
     */
    @Override
    public boolean hasNext() {
        return headPosition < collection.size();
    }

    /**
     * Method that checks if collection has previous element
     *
     * @return if collection has previous element
     */
    @Override
    public boolean hasPrevious() {
        return tailPosition >= 0;
    }

    /**
     * Method that returns next element of the collection
     *
     * @return next element of the collection
     */
    @Override
    public T next() {
        if (hasNext()) {
            T item = collection.get(headPosition);
            headPosition++;
            return item;
        }
        return null;
    }

    /**
     * Method that returns previous element of the collection
     *
     * @return previous element of the collection
     */
    @Override
    public T previous() {
        if (hasPrevious()) {
            T item = collection.get(tailPosition);
            tailPosition--;
            return item;
        }
        return null;
    }
}
