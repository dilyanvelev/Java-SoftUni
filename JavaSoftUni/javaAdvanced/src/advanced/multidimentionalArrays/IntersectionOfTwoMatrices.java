package advanced.multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];

        for (int count = 0; count < 2; count++) {
            for (int i = 0; i < rows; i++) {
                String[] elements = scanner.nextLine().split(" ");
                for (int j = 0; j < cols; j++) {
                    if (count == 0) {
                        firstMatrix[i][j] = elements[j];
                    } else {
                        secondMatrix[i][j] = elements[j];
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    firstMatrix[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
