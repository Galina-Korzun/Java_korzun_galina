package lesson5_2;

public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius, String color, String borderColor) {
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public void printAllInfo() {
        System.out.println("Circle{" + "perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                ", color = " + color +
                ", borderColor = " + borderColor +
          '}' );
    }
}