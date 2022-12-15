package week_15_day39_Recap.shapeTask;

import java.security.PrivateKey;

public class Circle extends Shape {

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
                super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.out.println("Invalid radius " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
