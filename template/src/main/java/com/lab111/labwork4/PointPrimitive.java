package main.java.com.lab111.labwork4;

/**
 * @author Vladyslav
 * PointPrimitive class which implements interface Point,
 * defines a point that will be adapted to draw a line.
 */
public class PointPrimitive implements Point {
    /**
     * Field which represents X coordinate
     */
    private int x;
    /**
     * Field which represents Y coordinate
     */
    private int y;

    /**
     * @param x x coordinate of the point
     * @param y y coordinate of the point
     */
    public PointPrimitive(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets value of x coordinate
     *
     * @param x x coordinate of the point
     */
    @Override
    public void setX(int x) {
        this.x = x;

    }

    /**
     * Sets value of y coordinate
     *
     * @param y y coordinate of the point
     */
    @Override
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return value of x coordinate
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * @return value of y coordinate
     */
    @Override
    public int getY() {
        return y;
    }
}
