package main.java.com.lab111.labwork6;

/**
 * Interface which defines methods display and accept
 *
 * @author Vladyslav
 */
public interface Element {
    /**
     * Method which defines visitor as parameter
     *
     * @param visitor instance of ElementVisitor
     */
    void accept(ElementsVisitor visitor);

    /**
     * Method which displays information about specific element
     */
    void display();
}
