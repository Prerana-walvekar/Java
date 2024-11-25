import mathpackage.MathOperations;

public class MathPackageDemo {
    public static void main(String[] args) {
	
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + MathOperations.add(5, 3));
        System.out.println("Subtraction: " + MathOperations.subtract(5, 3));
        System.out.println("Multiplication: " + MathOperations.multiply(5, 3));
        System.out.println("Division: " + MathOperations.divide(5, 3));

        double[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nStatistical Operations:");
        System.out.println("Mean: " + MathOperations.mean(numbers));
        System.out.println("Median: " + MathOperations.median(numbers));
        System.out.println("Standard Deviation: " + MathOperations.standardDeviation(numbers));

        double angle = 45;
        System.out.println("\nTrigonometric Operations:");
        System.out.println("Sine of " + angle + ": " + MathOperations.sine(angle));
        System.out.println("Cosine of " + angle + ": " + MathOperations.cosine(angle));
        System.out.println("Tangent of " + angle + ": " + MathOperations.tangent(angle));
    }
}
