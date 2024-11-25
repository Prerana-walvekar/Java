import java.util.HashMap;

public class HashMapExp {
    public static void main(String[] args) {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 92);

        System.out.println("Student Grades:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + ": " + studentGrades.get(name));
        }

        String searchName = "Bob";
        if (studentGrades.containsKey(searchName)) {
            System.out.println(searchName + "'s grade: " + studentGrades.get(searchName));
        } else {
            System.out.println(searchName + " is not found.");
        }

        studentGrades.remove("Charlie");
        System.out.println("After removing Charlie:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + ": " + studentGrades.get(name));
        }

        System.out.println("Total number of students: " + studentGrades.size());
    }
}
