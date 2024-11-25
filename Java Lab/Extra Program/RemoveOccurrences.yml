import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int target = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num != target) {
                result.add(num);
            }
        }

        System.out.println("Array after removal: " + result);
    }
}
