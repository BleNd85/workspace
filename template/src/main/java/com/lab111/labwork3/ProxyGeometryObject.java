package main.java.com.lab111.labwork3;

public class ProxyGeometryObject implements Geometry {
    private GeometryObject geometryObject;
    private String name;
    private int width;
    private int height;
    private int x;
    private int y;

    public ProxyGeometryObject(String name, int width, int height, int x, int y) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void properties() {
        if (geometryObject == null) {
            geometryObject = new GeometryObject(name, width, height, x, y);
        }
        geometryObject.properties();
    }
}

