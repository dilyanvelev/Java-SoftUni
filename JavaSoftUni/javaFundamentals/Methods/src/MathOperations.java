import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(doOperation(firstNum,secondNumber,operator));

    }

    private static int doOperation(int firstNum, int secondNumber, char operator) {
        int result = 0;
        switch (operator){
            case '+':
                result = firstNum + secondNumber;
                break;
            case '-':
                result = firstNum - secondNumber;
                break;
            case '*':
                result = firstNum * secondNumber;
                break;
            case '/':
                result = firstNum / secondNumber;
                break;
        }
        return result;
    }
}
