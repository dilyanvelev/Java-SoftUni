
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int[] arrOfNumbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arrOfNumbers[i] = Integer.parseInt(input[i]);
        }
        int counter = 0;
        while (arrOfNumbers.length > 1) {
            counter++;
            int[] condensed = new int[arrOfNumbers.length - 1];
            for (int i = 0; i < arrOfNumbers.length - 1; i++) {
                condensed[i] = arrOfNumbers[i] + arrOfNumbers[i + 1];
            }
            arrOfNumbers = condensed;
        }
        if (counter == 1){
            System.out.printf("%d is already condensed to number", arrOfNumbers[0]);
        }else{
            System.out.println(arrOfNumbers[0]);
        }



    }
}





