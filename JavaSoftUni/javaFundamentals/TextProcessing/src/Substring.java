import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String word = scanner.nextLine();
        String newWord = null;
        while (word.contains(toRemove)){
            newWord = word.replace(toRemove, "");
            word = newWord;
        }
        System.out.println(word);
    }
}
