import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[num];
        String[] secondArr = new String[num];
        for (int i = 1; i <= num; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArr[i - 1] = numbers[0];
                secondArr[i - 1] = numbers[1];
            } else {
                firstArr[i - 1] = numbers[1];
                secondArr[i - 1] = numbers[0];
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

    }
}
