import java.util.Random;

public class SimpleMultiThreadedApp {
    public static void main(String[] args) {
        Random random = new Random();
        Object lock = new Object();
        int[] generatedNumber = new int[1]; 

        Thread numberGenerator = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                generatedNumber[0] = random.nextInt(100); 
                System.out.println("Generated Number: " + generatedNumber[0]);
                synchronized (lock) {
                    lock.notifyAll(); 
                }
            }
        });

        Thread squareCalculator = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    if (generatedNumber[0] % 2 == 0) {
                        int square = generatedNumber[0] * generatedNumber[0];
                        System.out.println("Square of " + generatedNumber[0] + ": " + square);
                    }
                }
            }
        });

        Thread cubeCalculator = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    if (generatedNumber[0] % 2 != 0) {
                        int cube = generatedNumber[0] * generatedNumber[0] * generatedNumber[0];
                        System.out.println("Cube of " + generatedNumber[0] + ": " + cube);
                    }
                }
            }
        });

        numberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
