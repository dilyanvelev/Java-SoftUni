package advanced.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> urls = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (!input.equals("back")) {
                urls.push(input);
                System.out.println(urls.peek());
            } else {
                if (urls.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    urls.pop();
                    System.out.println(urls.peek());
                }
            }
            input = scanner.nextLine();
        }
    }
}
