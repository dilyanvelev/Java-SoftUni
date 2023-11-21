package advanced.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (number == 0){
            System.out.println(0);
        }
        while (number > 0) {
            int remainder = number % 2;
            binaryNumber.push(remainder);
            number = number / 2;
        }

        for (int num : binaryNumber){
            System.out.print(num);
        }
    }
}
