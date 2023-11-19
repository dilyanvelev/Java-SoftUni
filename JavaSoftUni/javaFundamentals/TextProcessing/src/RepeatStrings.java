import java.util.Arrays;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word);
            }
        }
    }
}
