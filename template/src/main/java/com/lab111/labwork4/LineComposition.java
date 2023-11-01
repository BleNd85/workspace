package main.java.com.lab111.labwork4;

public class LineComposition implements Point {
    Point startPoint;
    Point endPoint;
    private double X;
    private double Y;

    public LineComposition(double X, double Y, Point startPoint, Point endPoint) {
        this.X = X;
        this.Y = Y;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void setX(double x) {
        X = x;
    }

    @Override
    public void setY(double y) {
        Y = y;
    }

    @Override
    public void draw() {
        startPoint = new PointPrimitive(X, Y);

    }

}
