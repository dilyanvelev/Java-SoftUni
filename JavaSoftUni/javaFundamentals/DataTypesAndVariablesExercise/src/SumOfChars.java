import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numberOfLines = Integer.parseInt(sc.nextLine());
    int sum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            sum += sc.next().charAt(0);

        }
        System.out.printf("The sum equals: %d",sum);


    }
}
