import java.util.Scanner;

class Faculty {
    String name;
    double basicSalary;
    String designation;

    Faculty(String name, double basicSalary, String designation) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    double calculateAnnualSalary() {
        double additionalComponent = 0;

        if (designation.equalsIgnoreCase("Professor")) {
            additionalComponent = basicSalary * 0.5; 
        } else if (designation.equalsIgnoreCase("Associate Professor")) {
            additionalComponent = basicSalary * 0.3; 
        } else if (designation.equalsIgnoreCase("Assistant Professor")) {
            additionalComponent = basicSalary * 0.2; 
        }

        return (basicSalary + additionalComponent) * 12; 
    }
}

public class UniversitySalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter faculty name: ");
        String name = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter designation (Professor/Associate Professor/Assistant Professor): ");
        String designation = scanner.nextLine();

        Faculty faculty = new Faculty(name, basicSalary, designation);

        System.out.printf("Annual Salary for %s (%s): %.2f%n", 
                          faculty.name, faculty.designation, faculty.calculateAnnualSalary());
    }
}
