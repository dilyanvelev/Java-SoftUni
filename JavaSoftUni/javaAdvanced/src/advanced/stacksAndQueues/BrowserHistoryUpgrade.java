package advanced.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (history.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardPages.addFirst(history.pop());
                    System.out.println(history.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardPages.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    history.push(forwardPages.pop());
                    System.out.println(history.peek());
                }
            } else {
                forwardPages.clear();
                history.push(input);
                System.out.println(history.peek());
            }
            input = scanner.nextLine();
        }
    }
}
