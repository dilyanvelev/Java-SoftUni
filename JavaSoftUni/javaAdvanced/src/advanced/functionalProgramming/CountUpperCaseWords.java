package advanced.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Predicate<String> filterUpperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> upperCaseWords = Arrays.stream(input)
                .filter(filterUpperCase)
                .toList();
        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(System.out::println);
    }
}
