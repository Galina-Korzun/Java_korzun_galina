package lesson5_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5, "red", "green");
        Triangle triangle = new Triangle(2,3,5,"blue","black");
        Circle circle = new Circle(5, "white", "yellow");

        rectangle.printAllInfo();
        triangle.printAllInfo();
        circle.printAllInfo();

    }
}