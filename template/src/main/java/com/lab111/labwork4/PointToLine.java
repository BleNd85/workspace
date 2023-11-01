package main.java.com.lab111.labwork4;

public class PointToLine implements GraphicObject {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private Point startPoint;
    private Point endPoint;

    public PointToLine(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void draw() {
        x1 = startPoint.getX();
        y1 = startPoint.getY();
        x2 = endPoint.getX();
        y2 = endPoint.getY();
        System.out.println(x1 + x2 + y1 + y2);
    }
}
