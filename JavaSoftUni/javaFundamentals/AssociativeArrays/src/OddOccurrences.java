import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().toLowerCase().split(" ");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String el : elements) {

            wordCount.putIfAbsent(el, 0);
            wordCount.put(el, wordCount.get(el) + 1);

        }

        List<String> unique = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                unique.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", unique));
    }
}
