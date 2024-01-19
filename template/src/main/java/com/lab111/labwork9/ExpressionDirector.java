package main.java.com.lab111.labwork9;

/**
 * Director class that defines the sequence of calls to ExpressionBuilder methods to build an object.
 *
 * @author Vladyslav
 */
public class ExpressionDirector {
    /**
     * Field of an ExpressionBuilder instance
     */
    private ExpressionBuilder builder;

    /**
     * Method to construct expression
     *
     * @param builder Instance of ExpressionBuilder
     * @return Constructed expression
     */
    public Expression createExpression(ExpressionBuilder builder) {
        this.builder = builder;
        return builder.setConstant(1)
                .setSimpleExpression("*")
                .setVariable("y")
                .setSimpleExpression("+")
                .setComplexExpression("10", '+', "x")
                .setSimpleExpression("+")
                .setVariable("x")
                .buildExpression();
    }
}
