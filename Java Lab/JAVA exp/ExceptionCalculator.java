import java.util.Scanner;

public class ExceptionCalculator {

    public static class TooLongAddition extends Exception {
        public TooLongAddition(String message) {
            super(message);
        }
    }

    public static class NegativeAnswer extends Exception {
        public NegativeAnswer(String message) {
            super(message);
        }
    }

    public static class TooLongMultiplication extends Exception {
        public TooLongMultiplication(String message) {
            super(message);
        }
    }

    public static class Calculator {
        private int num1;
        private int num2;

        public Calculator(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public int add() throws TooLongAddition {
            int result = num1 + num2;
            if (result > 1000) {
                throw new TooLongAddition("Addition result exceeds 1000.");
            }
            return result;
        }

        public int subtract() throws NegativeAnswer {
            int result = num1 - num2;
            if (result < 0) {
                throw new NegativeAnswer("Subtraction result is negative.");
            }
            return result;
        }

        public int multiply() throws TooLongMultiplication {
            int result = num1 * num2;
            if (result > 5000) {
                throw new TooLongMultiplication("Multiplication result exceeds 5000.");
            }
            return result;
        }

        public double divide() {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return (double) num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator(num1, num2);

        try {
            System.out.println("Addition: " + calculator.add());
        } catch (TooLongAddition e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Subtraction: " + calculator.subtract());
        } catch (NegativeAnswer e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Multiplication: " + calculator.multiply());
        } catch (TooLongMultiplication e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
