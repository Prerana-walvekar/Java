import java.io.*;
import java.util.Scanner;

public class SimpleFileOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Write to the file");
        System.out.println("2. Append to the file");
        System.out.println("3. Read from the file");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter text to write: ");
                String textToWrite = scanner.nextLine();
                writeFile(fileName, textToWrite);
                break;
            case 2:
                System.out.print("Enter text to append: ");
                String textToAppend = scanner.nextLine();
                appendFile(fileName, textToAppend);
                break;
            case 3:
                readFile(fileName);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void writeFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
            System.out.println("Text written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void appendFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            System.out.println("Text appended to file.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
