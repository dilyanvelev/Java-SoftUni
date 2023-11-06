import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = scanner.nextInt();

        // Find pairs with the given sum
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.printf("%d %d%n", array[i], array[j]);
                }
            }
        }

    }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if (array[i] + array[j] == number) {
//                    System.out.printf("%d %d%n", array[i], array[j]);
//                }
//            }
//        }

}
