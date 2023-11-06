import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstNumber = numbersArr[0];
            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j + 1];
            }
            numbersArr[numbersArr.length - 1] = firstNumber;
        }
        System.out.println(String.join(" ", numbersArr));

    }
}
