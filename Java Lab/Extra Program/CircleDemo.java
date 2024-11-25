class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);

        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
    }
}
