package main.java.com.lab111.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of a panel composite, which implements Element interface
 *
 * @author Vladyslav
 */
public class PanelComposite implements Element {
    /**
     * Field of list which contains buttons
     */
    private List<Element> listOfElements;

    /**
     * Panel name field
     */
    private String name;

    /**
     * PanelComposite constructor
     *
     * @param name Button name
     */

    public PanelComposite(String name) {
        this.name = name;
        this.listOfElements = new ArrayList<>();
    }

    /**
     * Method that adds elements to the list
     *
     * @param element Instance of an Element
     */
    public void addElement(Element element) {
        listOfElements.add(element);
    }

    /**
     * Method which displays information about panel
     */
    @Override
    public void display() {
        System.out.println("Panel: " + name);
        for (Element button : listOfElements) {
            button.display();
        }
    }

    /**
     * Method that accepts visitor for elements of the panel
     *
     * @param visitor instance of ElementVisitor
     */
    @Override
    public void accept(ElementsVisitor visitor) {
        visitor.visitPanel(this);
        for (Element button : listOfElements) {
            button.accept(visitor);
        }
    }
}
