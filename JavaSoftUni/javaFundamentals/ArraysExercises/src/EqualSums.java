import java.util.Arrays;
import java.util.Scanner;


public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int arrayLength = numbersArr.length;
        int i;
        int[] firstArr;
        int[] secondArr;
        boolean isEqual = false;
        for (i = 0; i < arrayLength; i++) {
            if (arrayLength == 1) {
                System.out.println(0);
                break;
            }
            int currentNumber = numbersArr[i];
            firstArr = new int[i];
            secondArr = new int[arrayLength - i];

//            for (int j = 0; j < i; j++) {
//                firstArr[j] = numbersArr[j];
//            }
            System.arraycopy(numbersArr, 0, firstArr, 0, i);
//            for (int j = 0; j < arrayLength - i; j++) {
//                secondArr[j] = numbersArr[j + i];
//            }
            System.arraycopy(numbersArr, i, secondArr, 0, arrayLength - i);

            int firstArrSum = Arrays.stream(firstArr).sum();
            int secondArrSum = Arrays.stream(secondArr).sum();

            if (firstArrSum == (secondArrSum - currentNumber)) {
                isEqual = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEqual && arrayLength > 1) {
            System.out.println("no");
        }

    }
}
