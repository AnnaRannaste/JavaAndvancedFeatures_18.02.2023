package OOP_EX7;

public class OOPEx7 {

    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println(circle);
        System.out.println();

        System.out.println("Calculated area of the circle is: " + circle.getArea());
        System.out.println("Calculated perimeter of the circle is: " + circle.getPerimeter());
        System.out.println();

        ResizableCircle resizable = new ResizableCircle(10);
        resizable.resize(40);
        System.out.println(resizable);


    }

}

class Circle implements GeometricObject {

    protected float radius;

    public Circle(float radius) {

        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;

    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';

    }
}


class ResizableCircle extends Circle implements ResizableInterface {

    public ResizableCircle(float radius) {
        super(radius);

    }


    @Override
    public void resize(int percent) {
        radius = radius - (radius * percent / 100);

    }

    @Override
    public String toString() {
        return "ResizableCircle { " +
                "radius= " + radius +
                '}';

    }
}



