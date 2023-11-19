import java.util.Arrays;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(s -> s.length() % 2 == 0)
                .toArray();

        for (Object word : words) {
            System.out.println(word);
        }
    }
}
