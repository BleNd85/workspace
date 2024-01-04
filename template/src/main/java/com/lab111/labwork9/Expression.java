package main.java.com.lab111.labwork9;

public class Expression {
    private String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public void getExpression() {
        System.out.println("(" + expression + ")");
    }
}
