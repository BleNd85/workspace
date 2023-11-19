package main.java.com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> implements Iterable<T> {
    private List<T> elements = new ArrayList<T>();
    private String[] stringTestList = {"1", "1b", "100c", "1000d", "", "10000", "0", ""};
    private Integer[] intTestList = {1, 10, 100, 1000, 10000, 0, 500000};

    public void addItem(T item) {
        elements.add(item);
    }

    public void addStringList() {
        elements.clear();
        for (String stringItem : stringTestList) {
            elements.add((T) stringItem);
        }
    }

    public void addIntList() {
        elements.clear();
        for (Integer intItem : intTestList) {
            elements.add((T) intItem);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(elements);
    }

    @Override
    public void directOrder(Iterator<T> iterator) {
        System.out.println("У прямому напрямку:");
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (!(item == "")) {
                System.out.println(item);
            }
        }
    }

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
