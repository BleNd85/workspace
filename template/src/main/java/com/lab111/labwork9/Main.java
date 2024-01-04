package main.java.com.lab111.labwork9;

/*5. Визначити специфікації класів для будівника дерева розбору складного виразу (у
відповідності до Форми Бекуса-Наура) на основі його символьного подання.*/
public class Main {
    public static void main(String[] args) {
        ExpressionBuilder builder = new ConcreteExpressionBuilder();
        ExpressionDirector director = new ExpressionDirector();
        Expression expression = director.createExpression(builder);
        expression.getExpression();
    }
}
