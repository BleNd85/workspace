package main.java.com.lab111.labwork9;

/**
 * Interface which describes parts of expression
 *
 * @author VLadyslav
 */

public interface ExpressionBuilder {
    /**
     * Method to add constant to the expression
     *
     * @param number Value of constant
     * @return Constant that will be added to the expression
     */
    ConcreteExpressionBuilder setConstant(double number);

    /**
     * Method to add variable to the expression
     *
     * @param name Name of the variable
     * @return Variable that will be added to the expression
     */

    ConcreteExpressionBuilder setVariable(String name);

    /**
     * Method to add simple expression to the expression
     *
     * @param simpleExpression Simple expression
     * @return Simple expression that will be added to the expression
     */
    ConcreteExpressionBuilder setSimpleExpression(String simpleExpression);

    /**
     * Method to add complex expression to the expression
     *
     * @param left     Values on the left side of complex expression
     * @param operator Operator between two parts of complex expression
     * @param right    Values on the right side of complex expression
     * @return Complex expression that will be added to the expression
     */
    ConcreteExpressionBuilder setComplexExpression(String left, char operator, String right);

    /**
     * Method that is used to build the expression from all the given parts
     *
     * @return Built expression
     */
    Expression buildExpression();
}
