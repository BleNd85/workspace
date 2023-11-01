package main.java.com.lab111.labwork4;


import static java.lang.Math.sqrt;

public class PointToLineAdapter implements GraphicObject {
    /**
     * Field of instance of Point which represents start of the line
     */
    private Point startPoint;
    /**
     * Field of instance of Point which represents end of the line
     */
    private Point endPoint;
    /**
     * Field which represents x coordinate of a startPoint
     */
    private double x1;
    /**
     * Field which represents y coordinate of a startPoint
     */
    private double y1;
    /**
     * Field which represents x coordinate of an endPoint
     */
    private double x2;
    /**
     * Field which represents y coordinate of an endPoint
     */
    private double y2;
    /**
     * Field which represents X coordinate of a line
     */
    private double X;
    /**
     * Field which represents Y coordinate of a line
     */
    private double Y;

    /**
     * @param startPoint Instance of Point which represents start of the line
     * @param endPoint   Instance of Point which represents end of the line
     */

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

    /**
     * Method that draws a line by coordinates of start and end
     */
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
