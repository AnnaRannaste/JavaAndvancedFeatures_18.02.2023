package OOP_EX7;

import JavaIO_EX4.JavaIOEx4;

public class OOPEx7 {

    public static void main(String[] args) {
        Circle circle = new Circle(14);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);

        ResizableInterface resizable = new ResizableCircle(40);
        resizable.resize(30);
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
        radius = radius * percent / 100;

    }

    @Override
    public String toString() {
        return "Resizable{ " +
                "radius=" + radius +
                '}';

    }
}



