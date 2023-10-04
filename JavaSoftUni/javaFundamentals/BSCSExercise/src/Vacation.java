import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = number * 8.45;
                        if (number >= 30) {
                            price *= 0.85;
                        }
                        break;
                    case "Saturday":
                        price = number * 9.80;
                        if (number >= 30) {
                            price *= 0.85;
                        }
                        break;
                    case "Sunday":
                        price = number * 10.46;
                        if (number >= 30) {
                            price *= 0.85;
                        }
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = number * 10.90;
                        if (number >= 100) {
                            number -= 10;
                            price = number * 10.90;
                        }
                        break;
                    case "Saturday":
                        price = number * 15.60;
                        if (number >= 100) {
                            number -= 10;
                            price = number * 15.60;
                        }
                        break;
                    case "Sunday":
                        price = number * 16;
                        if (number >= 100) {
                            number -= 10;
                            price = number * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = number * 15;
                        if (10 <= number && number <= 20) {
                            price *= 0.95;
                        }
                        break;
                    case "Saturday":
                        price = number * 20;
                        if (10 <= number && number <= 20) {
                            price *= 0.95;
                        }
                        break;
                    case "Sunday":
                        price = number * 22.50;
                        if (10 <= number && number <= 20) {
                            price *= 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
