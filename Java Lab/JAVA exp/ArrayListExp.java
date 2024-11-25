import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) { 
	
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers in the ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("Total numbers: " + numbers.size());

        numbers.remove(2); 

        System.out.println("After removal:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
