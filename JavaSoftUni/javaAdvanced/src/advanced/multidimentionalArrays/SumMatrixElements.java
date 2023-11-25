package advanced.multidimentionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        int[][] matrix = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                int num = Integer.parseInt(input[j]);
                sum += num;
            }
        }
        System.out.print(rows + "\n" + cols + "\n" + sum);


    }
}
