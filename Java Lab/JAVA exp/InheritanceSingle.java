class Person {
    protected String name;
    protected String birthdate; 

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public int calculateAge() {
        int birthYear = Integer.parseInt(birthdate.split("-")[0]);
        int currentYear = 2024; 
        return currentYear - birthYear;
    }
}

class Student extends Person {
    private int rollNo;
    private double[] marks;

    public Student(String name, String birthdate, int rollNo, double[] marks) {
        super(name, birthdate);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public double calAvg() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String birthdate, int empId, double salary) {
        super(name, birthdate);
        this.empId = empId;
        this.salary = salary;
    }

    public double calTax() {
        return salary * 0.10;
    }
}

public class InheritanceSingle {
    public static void main(String[] args) {
        double[] studentMarks = {85.0, 90.0, 78.0};
        Student student = new Student("Alice", "2000-05-10", 101, studentMarks);
        System.out.printf("Student: %s, Age: %d, Average Marks: %.2f%n", 
                          student.name, student.calculateAge(), student.calAvg());

        Employee employee = new Employee("Bob", "1985-11-20", 201, 60000.00);
        System.out.printf("Employee: %s, Age: %d, Tax: %.2f%n", 
                          employee.name, employee.calculateAge(), employee.calTax());
    }
}
