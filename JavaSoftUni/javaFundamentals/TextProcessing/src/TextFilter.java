import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("*".repeat(word.length()));

            while (text.contains(word)){
                text = text.replace(word, stringBuilder.toString());
            }


        }
        System.out.println(text);
    }
}
