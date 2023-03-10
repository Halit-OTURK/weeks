package week_15_day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
         super("Square"); //super(name);
        setSide(side); // because we write setSide method and add rules with if condition
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.err.println("Invalid side" + side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area" + area() +
                ", perimeter" + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */