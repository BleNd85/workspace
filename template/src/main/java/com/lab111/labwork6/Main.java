package main.java.com.lab111.labwork6;

public class Main {
    public static void main(String[] args) {
        PanelComposite panel1 = new PanelComposite("Panel 1");
        panel1.addElement(new Button("Button 1"));
        panel1.addElement(new Button("Button 2"));
        panel1.addElement(new Button("Button 3"));
        PanelComposite panel2 = new PanelComposite("Panel 2");
        panel2.addElement(new Button("Button 2.1"));
        panel2.addElement(new Button("Button 2.2"));
        PanelComposite panel3 = new PanelComposite("Panel 3");
        panel3.addElement(new Button("Button 3.1"));
        panel2.addElement(panel3);
        panel1.addElement(panel2);
        CountElementsVisitor countElementsVisitor = new CountElementsVisitor();
        panel1.accept(countElementsVisitor);
        System.out.println("Кількість панелей: " + countElementsVisitor.getAmountOfPanels());
        System.out.println("Кількість кнопок: " + countElementsVisitor.getAmountOfButtons());
    }
}

