package main.java.com.lab111.labwork4;

/**
 * Point interface which consists of setters and getters for coordinates of a point.
 *
 * @author Vladyslav
 */
public interface Point {
    /**
     * Used to set x
     *
     * @param x x coordinate
     */
    void setX(int x);

    /**
     * Used to set y
     *
     * @param y y coordinate
     */

    void setY(int y);

    /**
     * @return value of x coordinate
     */
    int getX();

    /**
     * @return value of y coordinate
     */

    int getY();
}
