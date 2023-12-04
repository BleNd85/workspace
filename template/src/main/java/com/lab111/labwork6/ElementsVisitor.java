package main.java.com.lab111.labwork6;

/**
 * Interface which defines methods visitButton and visitPanel
 */
public interface ElementsVisitor {
    /**
     * Method that implements a button visit
     *
     * @param button Instance of Button element
     */
    void visitButton(Button button);

    /**
     * Method that implements a panel visit
     *
     * @param panel Instance of Panel element
     */

    void visitPanel(PanelComposite panel);
}
