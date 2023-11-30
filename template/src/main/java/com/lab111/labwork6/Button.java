package main.java.com.lab111.labwork6;

public class Button implements Element {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Button: " + name);
    }

    @Override
    public void accept(ElementsVisitor visitor) {
        visitor.visitButton(this);
    }
}
