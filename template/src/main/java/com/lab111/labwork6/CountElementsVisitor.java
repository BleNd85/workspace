package main.java.com.lab111.labwork6;

public class CountElementsVisitor implements ElementsVisitor {
    private int amountOfButtons ;
    private int amountOfPanels;

    public int getAmountOfButtons() {
        return amountOfButtons;
    }

    public int getAmountOfPanels() {
        return amountOfPanels;
    }

    @Override
    public void visitButton(Button button) {
        amountOfButtons++;
    }

    @Override
    public void visitPanel(PanelComposite panel) {
        amountOfPanels++;
    }

}
