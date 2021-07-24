/**
 * EX_5_C
 */
abstract class Shape {
    private double height; // To hold height.
    private double width; // To hold width or base

    // Set height and width
    public void setValues(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Get height and width methods
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // this must be overridden in a subclass.
    public abstract double getArea();
}

class Box extends Shape {
    // Calculate and return area of rectangle
    public double getArea() {
        return getHeight() * getWidth();
    }
}

class Triangle extends Shape {
    // Calculate and return area of triangle
    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }
}

public class EX_5_C {
    public static void main(String[] args) {
        // Create a box and finding area
        Box b = new Box();
        b.setValues(5.0, 5.0);
        System.out.println("Area of Box is: " + b.getArea());

        // Create a triangle and finding area
        Triangle t = new Triangle();
        t.setValues(5.0, 5.0);
        System.out.println("Area of Triangle is: " + t.getArea());
    }
}