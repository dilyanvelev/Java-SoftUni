import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char first = scanner.next().charAt(0);
                char second = scanner.next().charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                System.out.println(getMax(firstStr, secondStr));
                break;
        }


    }

    private static int getMax(int a, int b) {

        return Math.max(a, b);
    }

    private static char getMax(char a, char b) {
        char result = 0;
        if (a > b) {
            result += a;
        } else {
            result += b;
        }

        return result;
    }

    private static String getMax(String a, String b) {
        String result = "";
        if (a.length() > b.length()) {
            result += a;
        } else {
            result += b;
        }
        return result;

    }

}
