package mathpackage;

import java.util.Arrays;

public class MathOperations {
    
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public static double mean(double[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static double median(double[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
        } else {
            return numbers[length / 2];
        }
    }

    public static double standardDeviation(double[] numbers) {
        double mean = mean(numbers);
        double variance = Arrays.stream(numbers).map(n -> Math.pow(n - mean, 2)).average().orElse(0);
        return Math.sqrt(variance);
    }

    public static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}
