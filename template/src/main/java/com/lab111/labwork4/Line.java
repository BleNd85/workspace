package main.java.com.lab111.labwork4;

import static java.lang.Math.sqrt;

/**
 * Line class which implements interface GraphicObject,
 * draws a line by given coordinates.
 *
 * @author Vladyslav
 */
public class Line implements GraphicObject {
    /**
     * Field which represents X coordinate of a line
     */
    private double X;
    /**
     * Field which represents Y coordinate of a line
     */
    private double Y;

    /**
     * @param X x coordinate of a line
     * @param Y y coordinate of a line
     */

    public Line(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Sets value of y coordinate of a line
     *
     * @param y y coordinate of a line
     */
    @Override
    public void setY(double y) {
        Y = y;
    }

    /**
     * Sets value of x coordinate of a line
     *
     * @param x y coordinate of a line
     */
    @Override
    public void setX(double x) {
        X = x;
    }

    /**
     * Method that draws a line by coordinates of it
     */
    @Override
    public void draw() {
        double length = sqrt(X * X + Y * Y);
        System.out.println("Лінія побудована по заданим координатам\n" +
                "Coordinates of line:\nX = " + X + "\nY = " + Y +
                "\nLength of the line is: " + length + " cm\n");
    }
}
