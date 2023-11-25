package advanced.multidimentionalArrays;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        // [7, 1, 3, 3, 2, 1]
        // [1, 3, 9, 8, 5, 6]
        // [4, 6, 7, 9, 1, 0]
        int sum = 0;
        int[] coordinates = new int[4];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentSum = 0;
                currentSum += matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    coordinates[0] = matrix[i][j];
                    coordinates[1] = matrix[i][j + 1];
                    coordinates[2] = matrix[i + 1][j];
                    coordinates[3] = matrix[i + 1][j + 1];
                }
            }
        }

        for (int i = 0; i < 4; i += 2) {
            System.out.println(coordinates[i] + " " + coordinates[i + 1]);
        }
        System.out.println(sum);


    }
}
