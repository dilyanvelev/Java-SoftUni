import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(pow(firstNumber, power)).replace(",", "."));
    }

    private static double pow(double firstNumber, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= firstNumber;
        }
        return result;
    }
}
