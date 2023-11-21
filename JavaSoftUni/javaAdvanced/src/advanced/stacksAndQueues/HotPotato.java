package advanced.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> kids = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split(" ")));
        int passes = Integer.parseInt(scanner.nextLine());

        while (kids.size() > 1) {
            for (int i = 1; i < passes; i++) {
                String firstKid = kids.pollFirst();
                assert firstKid != null;
                kids.add(firstKid);
            }
            String removedKid = kids.pollFirst();
            System.out.println("Removed " + removedKid);

        }
        System.out.println("Last is " + kids.pollFirst());


    }
}
