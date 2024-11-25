abstract class Shape {
    abstract double calculateArea();
    abstract void draw();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    void draw() {
        System.out.println("Drawing a cylinder.");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape cylinder = new Cylinder(5, 10);

        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());

        cylinder.draw();
        System.out.println("Cylinder Surface Area: " + cylinder.calculateArea());
    }
}
