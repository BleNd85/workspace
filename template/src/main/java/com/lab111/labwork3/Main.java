package main.java.com.lab111.labwork3;

/*7. Визначити специфікації класів для подання графічних маніпуляторів геометричних
властивостей(положення, розмір) у редакторі векторної графіки.*/

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        Geometry object1 = new ProxyGeometryObject("Object1", 1, 2, 3, 10);
        Geometry object2 = new ProxyGeometryObject("Object2", 10, 50, -10, 0);
        object1.properties();
        object2.properties();
    }
}
