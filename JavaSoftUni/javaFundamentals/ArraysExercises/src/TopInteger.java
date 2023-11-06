import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArr.length; i++) {
            boolean isTop = false;

            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                isTop = numbersArr[i] > numbersArr[j];
            }

            if (isTop) System.out.print(numbersArr[i] + " ");
        }
        System.out.print(numbersArr[numbersArr.length - 1]);

    }
}
