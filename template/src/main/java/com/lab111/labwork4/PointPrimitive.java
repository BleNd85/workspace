package main.java.com.lab111.labwork4;

public class PointPrimitive implements Point {
    private int X;
    private int Y;

    public PointPrimitive(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public void setX(int x) {
        X = x;
    }

    @Override
    public void setY(int y) {
        Y = y;
    }
}

