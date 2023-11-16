package main.java.com.lab111.labwork5;

import java.util.List;

public class MyCollection implements Iterable {
    private String[] elements = {"1", "10", "100", "1000", "", "10000", "0", "5687"};

    @Override
    public Iterator<String> iterator() {
        return new MyIterator<>(List.of(elements));
    }

    @Override
    public void directOrder() {
        System.out.println("У прямому напрямку:");
        MyCollection collection = new MyCollection();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (!item.isEmpty()) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void reverseOrder() {
        System.out.println("У зворотному напрямку:");
        MyCollection collection = new MyCollection();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasPrevious()) {
            String item = iterator.previous();
            if (!item.isEmpty()) {
                System.out.println(item);
            }
        }
    }
}
