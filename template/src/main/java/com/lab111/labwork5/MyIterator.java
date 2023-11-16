package main.java.com.lab111.labwork5;

import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int headPosition = 0;
    private int tailPosition;

    public MyIterator(List<T> collection) {
        this.collection = collection;
        this.tailPosition = collection.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return headPosition < collection.size();
    }

    @Override
    public boolean hasPrevious() {
        return tailPosition >= 0;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = collection.get(headPosition);
            headPosition++;
            return item;
        }
        return null;
    }

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
