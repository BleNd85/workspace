package main.java.com.lab111.labwork3;
/**
*Class ProxyGeometryObject which implements Interface Geometry,
* contains a reference to a real GeometryObject
*/
public class ProxyGeometryObject implements Geometry {
    /**
     * Field "geometryObject" of real object
     */
    private GeometryObject geometryObject;
    /**
     * Field "name" represents name of the object
     */
    private String name;
    /**
     * Field "width" represents width of the object
     */
    private int width;
    /**
     * Field "height" represents height of the object
     */
    private int height;
    /*
    Field "x" represents x coordinates of object
     */
    private int x;
    /**
     * Field "y" represents y coordinates of object
     */
    private int y;
    /**Constructor of ProxyGeometryObject
     * @param name Name of the object
     * @param width Width of the object
     * @param height Height of the object
     * @param x X coordinate of the object
     * @param y Y coordinate of the object
     */
    public ProxyGeometryObject(String name, int width, int height, int x, int y) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    /**
     *Method "properties" which is used to create a new original object
     * of GeometryClass and to show properties of object
     */
    @Override
    public void properties() {
        if (geometryObject == null) {
            geometryObject = new GeometryObject(name, width, height, x, y);
        }
        geometryObject.properties();
    }
}

