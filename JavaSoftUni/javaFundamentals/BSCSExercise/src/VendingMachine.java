import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalPrice += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
        }
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                System.out.printf("Change: %.2f",totalPrice);
                break;
            }
            if (input.equals("Nuts") || input.equals("Water") || input.equals("Crisps") || input.equals("Soda") || input.equals("Coke")) {
                if (input.equals("Nuts")) {
                    if (totalPrice >= 2.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalPrice -= 2.0;

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (input.equals("Water")) {
                    if (totalPrice >= 0.7) {
                        System.out.printf("Purchased %s%n", input);
                        totalPrice -= 0.7;


                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (input.equals("Crisps")) {

                    if (totalPrice >= 1.5) {
                        totalPrice -= 1.5;
                        System.out.printf("Purchased %s%n", input);

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (input.equals("Soda")) {

                    if (totalPrice >= 0.8) {
                        totalPrice -= 0.8;
                        System.out.printf("Purchased %s%n", input);

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (input.equals("Coke")) {

                    if (totalPrice >= 1.0) {
                        totalPrice -= 1.0;
                        System.out.printf("Purchased %s%n", input);

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else {
                    System.out.println("Invalid product.");

                }
            }else{
                System.out.println("Invalid product");

            }
        }


    }
}
