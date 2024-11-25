import java.io.*;
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Class: ");
        int studentClass = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter Height (cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student_info.dat"))) {
            dos.writeInt(rollNo);
            dos.writeInt(studentClass);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);
            System.out.println("Student information saved.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        try (DataInputStream dis = new DataInputStream(new FileInputStream("student_info.dat"))) {
            System.out.println("\nStudent Information:");
            System.out.println("Roll No: " + dis.readInt());
            System.out.println("Class: " + dis.readInt());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble() + " kg");
            System.out.println("Height: " + dis.readDouble() + " cm");
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readUTF());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
