package advanced.functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", input));
        input = input.stream()
                .map(Integer::parseInt)
                .sorted()
                .map(e ->e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", input));



    }
}
