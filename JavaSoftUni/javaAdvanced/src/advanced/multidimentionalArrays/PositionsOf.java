package advanced.multidimentionalArrays;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowsCols = scanner.nextLine().split(" ");
        int row = Integer.parseInt(rowsCols[0]);
        int col = Integer.parseInt(rowsCols[1]);
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine().split(" ");

            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (searchedNumber == matrix[i][j]) {
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
