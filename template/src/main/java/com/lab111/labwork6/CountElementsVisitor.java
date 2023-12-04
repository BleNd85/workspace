package main.java.com.lab111.labwork6;

/**
 * Visitor class which implements ElementsVisitor interface
 *
 * @author Vladyslav
 */

public class CountElementsVisitor implements ElementsVisitor {
    /**
     * Field that represents amount of buttons on the panel
     */
    private int amountOfButtons;
    /**
     * Field that represents amount of panels
     */
    private int amountOfPanels;

    /**
     * @return Amount of buttons
     */

    public int getAmountOfButtons() {
        return amountOfButtons;
    }

    /**
     * @return Amount of panels
     */
    public int getAmountOfPanels() {
        return amountOfPanels;
    }

    /**
     * Method which counts buttons for the panel
     *
     * @param button Instance of Button element
     */
    @Override
    public void visitButton(Button button) {
        amountOfButtons++;
    }

    /**
     * Method which counts panels
     *
     * @param panel Instance of Panel element
     */
    @Override
    public void visitPanel(PanelComposite panel) {
        amountOfPanels++;
    }

}
