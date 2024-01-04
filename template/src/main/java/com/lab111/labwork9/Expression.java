package main.java.com.lab111.labwork9;

/**
 * Product class whose object we are constructing
 */
public class Expression {
    /**
     * Field that represents expression that is being constructed
     */
    private String expression;

    /**
     * Constructor of Expression class
     *
     * @param expression Constructed expression
     */

    public Expression(String expression) {
        this.expression = expression;
    }

    /**
     * Method to get expression
     */
    public void getExpression() {
        System.out.println("(" + expression + ")");
    }
}
