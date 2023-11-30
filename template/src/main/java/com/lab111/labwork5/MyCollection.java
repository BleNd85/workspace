package main.java.com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which Implements Iterable interface, provides an iterator for its collection.
 *
 * @author Vladyslav
 */
public class MyCollection<T> implements Iterable<T> {
    /**
     * List of elements which is being iterated
     */
    private List<T> elements = new ArrayList<T>();
    /**
     * List of strings for testing
     */
    private String[] stringTestList = {"1", "1b", "100c", "1000d", "", "10000", "0", ""};
    /**
     * List of integers for testing
     */
    private Integer[] intTestList = {1, 10, 100, 1000, 10000, 0, 500000};

    /**
     * Method that is used to add new elements to the list
     *
     * @param item element which can be added to list
     */

    public void addItem(T item) {
        elements.add(item);
    }

    /**
     * Method that is used to add a whole array of string elements
     */
    public void addStringList() {
        elements.clear();
        for (String stringItem : stringTestList) {
            elements.add((T) stringItem);
        }
    }

    /**
     * Method that is used to add a whole array of integer elements
     */
    public void addIntList() {
        elements.clear();
        for (Integer intItem : intTestList) {
            elements.add((T) intItem);
        }
    }

    /**
     * Provides an iterator for this class
     *
     * @return iterator for this class
     */
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(elements);
    }

    /**
     * Returns collection values in direct order into the console
     *
     * @param iterator iterator instance
     */
    @Override
    public void directOrder(Iterator<T> iterator) {
        System.out.println("У прямому напрямку:");
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (!(item == "")) {
                System.out.println(item + " " + item.getClass());
            }
        }
    }

    /**
     * Returns collection values in reverse order into the console
     *
     * @param iterator iterator instance
     */
    @Override
    public void reverseOrder(Iterator<T> iterator) {
        System.out.println("У зворотному напрямку:");
        while (iterator.hasPrevious()) {
            T item = iterator.previous();
            if (!(item == "")) {
                System.out.println(item);
            }
        }
    }
}
