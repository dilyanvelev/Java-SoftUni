import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = scanner.nextInt();
        int sum = 0;
        for (int i = startNumber; i < endNumber + 1; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }

        System.out.printf("%nSum: %d", sum);

    }
}
