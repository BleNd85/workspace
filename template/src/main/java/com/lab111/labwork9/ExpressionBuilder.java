package main.java.com.lab111.labwork9;

public interface ExpressionBuilder {
    ConcreteExpressionBuilder setConstant(double number);

    ConcreteExpressionBuilder setVariable(String name);

    ConcreteExpressionBuilder setSimpleExpression(String simpleExpression);

    ConcreteExpressionBuilder setComplexExpression(String left, char operator, String right);

    Expression buildExpression();
}
