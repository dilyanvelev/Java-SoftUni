import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        System.out.println(GradeInWords(grade));
    }

    private static String GradeInWords(double grade) {
        if (2.00 <= grade && grade <= 2.99) {
            return "Fail";
        } else if (3.00 <= grade && grade <= 3.49) {
            return "Poor";
        } else if (3.50 <= grade && grade <= 4.49) {
            return "Good";
        } else if (4.50 <= grade && grade <= 5.49) {
            return "Very good";
        } else {
            return "Excellent";
        }
    }


}
