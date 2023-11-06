import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        int start = 0;
        int length = 1;
        int bestStart = 0;
        int bestLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    bestStart = start;
                }
            } else {
                start = i;
                length = 1;
            }
        }

        for (int i = bestStart; i < bestStart + bestLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
