package main.java.com.lab111.labwork9;

/**
 * Concrete Builder class that implements Builder interface and its methods to create expression
 *
 * @author Vladyslav
 */

public class ConcreteExpressionBuilder implements ExpressionBuilder {
    /**
     * Field that represents expression that is being constructed
     */
    private String expression;

    /**
     * Constructor of ConcreteExpressionBuilder class
     */
    public ConcreteExpressionBuilder() {
        this.expression = "";
    }

    /**
     * Method to add constant to the expression
     *
     * @param number Value of constant
     * @return Constant that will be added to the expression
     */
    @Override
    public ConcreteExpressionBuilder setConstant(double number) {
        this.expression += number + " ";
        return this;
    }

    /**
     * Method to add variable to the expression
     *
     * @param name Name of the variable
     * @return Variable that will be added to the expression
     */
    @Override
    public ConcreteExpressionBuilder setVariable(String name) {
        expression += name + " ";
        return this;
    }

    /**
     * Method to add simple expression to the expression
     *
     * @param simpleExpression Simple expression
     * @return Simple expression that will be added to the expression
     */
    @Override
    public ConcreteExpressionBuilder setSimpleExpression(String simpleExpression) {
        expression += simpleExpression + " ";
        return this;
    }

    /**
     * Method to add complex expression to the expression
     *
     * @param left     Values on the left side of complex expression
     * @param operator Operator between two parts of complex expression
     * @param right    Values on the right side of complex expression
     * @return Complex expression that will be added to the expression
     */
    @Override
    public ConcreteExpressionBuilder setComplexExpression(String left, char operator, String right) {
        expression += "(" + left + " " + operator + " " + right + ") ";
        return this;
    }

    /**
     * Method that is used to build the expression from all the given parts
     *
     * @return Built expression
     */
    @Override
    public Expression buildExpression() {
        return new Expression(expression);
    }
}
