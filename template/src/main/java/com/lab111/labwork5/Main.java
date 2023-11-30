package main.java.com.lab111.labwork5;
//0. Визначити специфікації класів, які інкапсулюють лінійний список об’єктів та реалізують
//        можливість послідовного обходу у прямому та зворотному напрямках оминаючи порожні
//        елементи цієї структури та не розкриваючи її сутності перед користувачем.

/**
 * Main class
 *
 * @author Vladyslav
 */
public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.addStringList();
        Iterator<String> stringIterator = collection.iterator();
        collection.directOrder(stringIterator);
        collection.reverseOrder(stringIterator);
        MyCollection<Integer> integerCollection = new MyCollection<>();
        integerCollection.addIntList();
        integerCollection.addStringList();
        Iterator<Integer> integerIterator = integerCollection.iterator();
        integerCollection.directOrder(integerIterator);
        integerCollection.reverseOrder(integerIterator);
    }
}
