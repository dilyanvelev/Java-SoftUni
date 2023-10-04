import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = scanner.nextInt();

        if (day.equals("Weekday")) {
            if (0 <= age && age <= 18) {
                System.out.print("12$");
            } else if (18 < age && age <= 64) {
                System.out.print("18$");
            }else if (64<age && age <=122){
                System.out.print("12$");
            }else{
                System.out.print("Error!");
            }

        } else if (day.equals("Weekend")) {
            if (0 <= age && age <= 18) {
                System.out.print("15$");
            } else if (18 < age && age <= 64) {
                System.out.print("20$");
            }else if (64<age && age <=122){
                System.out.print("15$");
            }else{
                System.out.print("Error!");
            }


        } else if (day.equals("Holiday")) {
            if (0 <= age && age <= 18) {
                System.out.print("5$");
            } else if (18 < age && age <= 64) {
                System.out.print("12$");
            }else if (64<age && age <=122){
                System.out.print("10$");
            }else{
                System.out.print("Error!");
            }

        }
    }
}
