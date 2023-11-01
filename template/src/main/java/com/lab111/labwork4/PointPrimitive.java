package main.java.com.lab111.labwork4;

public class PointPrimitive implements Point {
    private int x;
    private int y;

    public PointPrimitive(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(int x) {
        this.x = x;

    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
