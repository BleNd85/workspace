package main.java.com.lab111.labwork6;

public interface Element {
    void accept(ElementsVisitor visitor);
    void display();
}
