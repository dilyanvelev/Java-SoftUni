import java.util.Scanner;

public class SignOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(SignOfInteger(number));
    }

    static String SignOfInteger(int num) {
        String result = "The number ";
        if (num > 0) {
            result += num + " is positive.";
        } else if (num < 0) {
            result += num + " is negative.";
        } else {
            result += num + " is zero.";
        }
        return result;
    }
}
