
import java.util.Scanner;

public class EqualsArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] firstArr = sc.nextLine().split(" ");
        String[] secondArr = sc.nextLine().split(" ");


        int[] firstArrNumbers = new int[firstArr.length];
        int[] secondArrNumbers = new int[firstArr.length];


        for (int i = 0; i < firstArr.length; i++) {
            firstArrNumbers[i] = Integer.parseInt(firstArr[i]);


        }

        for (int i = 0; i < secondArr.length; i++) {
            secondArrNumbers[i] = Integer.parseInt(secondArr[i]);

        }
        int sum = 0;


        for (int i = 0; i < firstArrNumbers.length; i++) {
            if (firstArrNumbers[i] == secondArrNumbers[i]) {
                sum += firstArrNumbers[i];
                if (i == firstArrNumbers.length - 1) {
                    System.out.printf("Arrays are identical. Sum: %d", sum);
                }
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }

        }


    }
}
