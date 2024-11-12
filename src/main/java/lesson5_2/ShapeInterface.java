package lesson5_2;

public interface ShapeInterface {
    default double getPerimeter() {
        return 0;
    }

    double getArea();

}