import java.util.Scanner;


public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

}
