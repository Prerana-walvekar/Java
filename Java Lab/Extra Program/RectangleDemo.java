import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;

    // Default constructor with default values (1, 1)
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength() + ", Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.getArea());

    
        System.out.println("\nEnter dimensions for the second rectangle:");
        System.out.print("Length: ");
        int length2 = scanner.nextInt();
        System.out.print("Width: ");
        int width2 = scanner.nextInt();

        Rectangle rect2 = new Rectangle(length2, width2);

        System.out.println("\nCustom Rectangle:");
        System.out.println("Length: " + rect2.getLength() + ", Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.getArea());

        
    }
}
