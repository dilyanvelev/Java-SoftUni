import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());

        }
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(numbers[i - 1] + " ");

        }


    }
}
