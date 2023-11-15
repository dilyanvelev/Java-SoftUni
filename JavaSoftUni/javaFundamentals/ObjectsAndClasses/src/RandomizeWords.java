import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.asList(scanner.nextLine().split(" "));
        Collections.shuffle(text);

        for (int i = 0; i < text.size(); i++) {
            System.out.println(text.get(i));
        }
    }
}
