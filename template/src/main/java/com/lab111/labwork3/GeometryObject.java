package main.java.com.lab111.labwork3;

public class GeometryObject implements Geometry {
    private String name;
    private int width;
    private int height;
    private int x;
    private int y;

    public GeometryObject(String name, int width, int height, int x, int y) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void properties() {
        System.out.println("Object: " + name + "\nWidth: " + width + "\nHeight: " + height + "\nx = " + x + "\ny = " + y + "\n");
    }
}
