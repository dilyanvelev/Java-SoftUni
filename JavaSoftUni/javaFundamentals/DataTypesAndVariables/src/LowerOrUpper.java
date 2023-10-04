import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lowerOrUpperCaseLetter = scanner.next().charAt(0);

        if (Character.isLowerCase(lowerOrUpperCaseLetter)) {
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");
        }
    }
}
