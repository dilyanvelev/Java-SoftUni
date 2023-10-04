import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String separator = scanner.nextLine();

        System.out.printf("%s%s%s", firstName, separator, secondName);
    }
}
