import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] splitLetters = sc.nextLine().split(" ");

        for (int i = splitLetters.length - 1; i >= 0; i--) {
            System.out.print(splitLetters[i] + " ");

        }



    }
}
