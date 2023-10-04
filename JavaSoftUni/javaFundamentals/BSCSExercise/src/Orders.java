import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 0; i < ordersCount; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double currentOrderPrice = ((days * capsuleCount) * pricePerCapsule);
            totalPrice += currentOrderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", currentOrderPrice);



        }
        System.out.printf("Total: $%.2f",totalPrice);


    }
}
