package main.java.com.lab111.labwork6;

/**
 * Clas of a button primitive which implements Element interface
 */
public class Button implements Element {
    /**
     * Field of a button name
     */
    private String name;

    /**
     * Constructor of the Button
     *
     * @param name Button name
     */

    public Button(String name) {
        this.name = name;
    }

    /**
     * Method that displays information about button
     */
    @Override
    public void display() {
        System.out.println("Button: " + name);
    }

    /**
     * Method that accepts visitor for a specific button
     *
     * @param visitor Instance of ElementVisitor
     */
    @Override
    public void accept(ElementsVisitor visitor) {
        visitor.visitButton(this);
    }
}
