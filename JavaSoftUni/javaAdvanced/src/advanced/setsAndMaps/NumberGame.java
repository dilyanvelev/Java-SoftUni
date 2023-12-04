package advanced.setsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int counter = 0;
        while (counter < 50 && !firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int firstNumber = firstDeck.iterator().next();
            int secondNumber = secondDeck.iterator().next();


            firstDeck.remove(firstNumber);
            secondDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            }else{
                firstDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            }
            counter++;
        }
        if (firstDeck.isEmpty() || secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else if (secondDeck.isEmpty() || firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
