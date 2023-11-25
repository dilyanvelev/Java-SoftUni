package advanced.multidimentionalArrays;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstMatrixSize = scanner.nextLine().split(" ");
        int firstMatrixRows = Integer.parseInt(firstMatrixSize[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixSize[1]);
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int row = 0; row < firstMatrixRows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < firstMatrixCols; col++) {
                firstMatrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        String[] secondMatrixSize = scanner.nextLine().split(" ");
        int secondMatrixRows = Integer.parseInt(secondMatrixSize[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixSize[1]);
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        if (firstMatrixRows != secondMatrixRows || firstMatrixCols != secondMatrixCols) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < secondMatrixRows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < secondMatrixCols; col++) {
                secondMatrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        for (int i = 0; i < firstMatrixRows; i++) {
            for (int j = 0; j < firstMatrixCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");

    }
}
