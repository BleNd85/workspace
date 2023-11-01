package main.java.com.lab111.labwork4;

//5. Визначити специфікації класів, які подають графічні об'єкти у редакторі векторної графіки -
//примітиви (точка) та їх композиції (лінія). Примітиви мають цілочислові атрибути
//координат (в пікселях), а об'єкти-композиції — раціональні (в сантиметрах). Відповідно
//інтерфейс точки містить методи setХ(int) та setY(int), а метод малювання лінії може
//оперувати лише методами setX(double), setY(double) примітива (які відсутні в класі точки).
//Забезпечити можливість використання функціональності точки при малюванні лінії без
//зміни інтерфейсу точки та методу малювання лінії.

/**
 * Main class
 *
 * @author Vladyslav
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new PointPrimitive(100, 50);
        Point point2 = new PointPrimitive(200, 100);
        GraphicObject line1 = new PointToLineAdapter(point1, point2);
        GraphicObject line2 = new Line(100, 50);
        line1.draw();
        line2.draw();
        point1.setX(-100);
        point2.setY(-95);
        line2.setX(-80);
        line2.setY(89);
        line1.draw();
        line2.draw();

    }
}
