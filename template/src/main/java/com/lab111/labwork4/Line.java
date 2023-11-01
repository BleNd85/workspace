package main.java.com.lab111.labwork4;

import static java.lang.Math.sqrt;

public class Line implements GraphicObject {
    private double X;
    private double Y;

    public Line(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public void setY(double y) {
        Y = y;
    }

    @Override
    public void setX(double x) {
        X = x;
    }

    @Override
    public void draw() {
        double length = sqrt(X * X + Y * Y);
        System.out.println("Лінія побудована по заданим координатам\n" +
                "Coordinates of line:\nX = " + X + "\nY = " + Y +
                "\nLength of the line is: " + length + " cm\n");
    }
}
