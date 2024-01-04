package main.java.com.lab111.labwork9;

public class ConcreteExpressionBuilder implements ExpressionBuilder {
    private String expression;

    public ConcreteExpressionBuilder() {
        this.expression = "";
    }

    @Override
    public ConcreteExpressionBuilder setConstant(double number) {
        this.expression += number + " ";
        return this;
    }

    @Override
    public ConcreteExpressionBuilder setVariable(String name) {
        expression += name + " ";
        return this;
    }

    @Override

    public ConcreteExpressionBuilder setSimpleExpression(String simpleExpression) {
        expression += simpleExpression + " ";
        return this;
    }

    @Override
    public ConcreteExpressionBuilder setComplexExpression(String left, char operator, String right) {
        expression += "(" + left + " " + operator + " " + right + ") ";
        return this;
    }

    @Override
    public Expression buildExpression() {
        return new Expression(expression);
    }
}
