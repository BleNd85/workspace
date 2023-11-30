package main.java.com.lab111.labwork6;

import java.util.ArrayList;
import java.util.List;

public class PanelComposite implements Element {
    private List<Element> listOfButtons;
    private String name;

    public PanelComposite(String name) {
        this.name = name;
        this.listOfButtons = new ArrayList<>();
    }

    public void addElement(Element element) {
        listOfButtons.add(element);
    }

    @Override
    public void display() {
        System.out.println("Panel: " + name);
        for (Element button : listOfButtons) {
            button.display();
        }
    }

    @Override
    public void accept(ElementsVisitor visitor) {
        visitor.visitPanel(this);
        for (Element button : listOfButtons) {
            button.accept(visitor);
        }
    }
}
