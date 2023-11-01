package main.java.com.lab111.labwork4;

public interface GraphicObject {
    /**
     * Sets value of y coordinate of a line
     *
     * @param y y coordinate of a line
     */
    void setY(double y);

    /**
     * Sets value of x coordinate of a line
     *
     * @param x x coordinate of a line
     */

    void setX(double x);

    /**
     * Method that draws a line by coordinates of start and end or by coordinates of line
     */
    void draw();
}
