package advanced.multidimentionalArrays;

import java.util.Scanner;

public class PrintDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        for (int i = size - 1; i >= 0; i--) {
            int j = size - 1 - i;
            System.out.print(matrix[i][j] + " ");
        }


    }
}
