package main.java.com.lab111.labwork9;

public class ExpressionDirector {
    public Expression createExpression(ExpressionBuilder builder) {
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
