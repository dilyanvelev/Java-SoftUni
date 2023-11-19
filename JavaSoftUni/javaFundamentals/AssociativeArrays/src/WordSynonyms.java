import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < lines; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordSynonyms.putIfAbsent(word, new ArrayList<>());
            wordSynonyms.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
}
