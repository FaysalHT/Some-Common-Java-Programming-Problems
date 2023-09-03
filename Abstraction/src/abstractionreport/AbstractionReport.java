//JAVA PROGRAM FOR ABSTRACTION
//FAYSAL HOSSAIN TOMAL

package abstractionreport;

class Shape {

    private double length;
    private double breadth;

    public Shape() {
        this.length = 0;
        this.breadth = 0;
    }

    public Shape(double length) {
        this.length = length;
        this.breadth = length;
    }

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return this.length * this.breadth;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.breadth);
    }

}

class Rectangle extends Shape {

    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

}

class Square extends Shape {

    public Square(double side) {
        super(side);
    }

}

public class AbstractionReport {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

    }

}