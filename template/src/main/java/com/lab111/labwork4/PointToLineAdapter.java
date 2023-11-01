package main.java.com.lab111.labwork4;


import static java.lang.Math.sqrt;

public class PointToLineAdapter implements GraphicObject {

    private Point startPoint;
    private Point endPoint;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double X;
    private double Y;

    public PointToLineAdapter(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void setY(double y) {
    }

    @Override
    public void setX(double x) {
    }

    @Override
    public void draw() {
        x1 = startPoint.getX();
        y1 = startPoint.getY();
        x2 = endPoint.getX();
        y2 = endPoint.getY();
        X = x2 - x1;
        Y = y2 - y1;
        double length = sqrt(X * X + Y * Y);
        System.out.println("Лінія побудована по точкам із заданими координатами\n" +
                "Coordinates of the points:\nX1 = " + x1 + "\nY1 = " + y1 + "\nX2 = " + x2 + "\nY2 = " + y2 +
                "\nCoordinates of line:\nX = " + X + "\nY = " + Y + "\nLength of line is: " + length + " cm\n");

    }
}
