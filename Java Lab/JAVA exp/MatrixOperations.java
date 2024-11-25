import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = scanner.nextInt();

        System.out.println("Enter elements of matrix A:");
        int[][] matrixA = inputMatrix(rows, cols, scanner);

        System.out.println("Enter elements of matrix B:");
        int[][] matrixB = inputMatrix(rows, cols, scanner);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of A and B:");
        printMatrix(sum);

        int[][] difference = subtractMatrices(matrixA, matrixB);
        System.out.println("Difference of A and B:");
        printMatrix(difference);

        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Product of A and B:");
        printMatrix(product);
        
        scanner.close();
    }

    private static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A's columns must equal Matrix B's rows for multiplication.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
