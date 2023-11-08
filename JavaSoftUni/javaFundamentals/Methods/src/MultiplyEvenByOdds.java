import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(mulEvenOdds(number));
    }

    private static int mulEvenOdds(int number) {
        int evenSum = 0;
        int oddsSum = 0;
        String numsAsStr = String.valueOf(number);

        for (int i = 0; i < numsAsStr.length(); i++) {
            if (numsAsStr.charAt(i) == '-') {
                i = 1;
            }
            int num = Integer.parseInt(String.valueOf(numsAsStr.charAt(i)));
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddsSum += num;
            }
        }

        return evenSum * oddsSum;
    }
}
