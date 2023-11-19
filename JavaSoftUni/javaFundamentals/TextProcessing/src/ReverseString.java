import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = command.length() - 1; i >= 0; i--) {
                stringBuilder.append(command.charAt(i));
            }
            System.out.println(command + " = " + stringBuilder.toString());
            stringBuilder = new StringBuilder();
            command = scanner.nextLine();
        }
    }
}
