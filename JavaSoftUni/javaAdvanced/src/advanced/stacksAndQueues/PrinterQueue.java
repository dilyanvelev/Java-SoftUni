package advanced.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String command = scanner.nextLine();
        while (!command.equals("print")) {

            if (command.equals("cancel")) {
                if (!printerQueue.isEmpty()) {
                    // Remove the first file in the queue (canceled)
                    System.out.println("Canceled " + printerQueue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {

                printerQueue.offer(command);
            }

            command = scanner.nextLine();
        }
        for (String file : printerQueue){
            System.out.println(file);
        }


    }
}
