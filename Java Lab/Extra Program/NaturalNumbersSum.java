import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("Natural numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum: " + sum);
    }
}
