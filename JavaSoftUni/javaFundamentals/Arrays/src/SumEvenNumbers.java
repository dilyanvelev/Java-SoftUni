import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbersAsString = sc.nextLine();
        String[] numbers = numbersAsString.split(" ");
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = Integer.parseInt(numbers[i]);
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);


    }
}
