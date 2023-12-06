package advanced.functionalProgramming;

import java.util.*;
import java.util.function.Predicate;

public class FindEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bounds = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(bounds[0]);
        int upperBound = Integer.parseInt(bounds[1]);
        List<Integer> numbers = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            numbers.add(i);
        }

        String command = scanner.nextLine();

        Predicate<Integer> filterPredicate = null;

        if (command.equals("odd")) {
            filterPredicate = num -> num % 2 != 0;
        } else if (command.equals("even")) {
            filterPredicate = num -> num % 2 == 0;
        }

        assert filterPredicate != null;
        numbers.stream()
                .filter(filterPredicate)
                .forEach(num -> System.out.print(num + " "));
    }
}
