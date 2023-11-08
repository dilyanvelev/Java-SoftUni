import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = scanner.nextInt();
        double result = totalPrice(product, quantity);
        System.out.printf("%.2f", result);

    }

    private static double totalPrice(String product, int quantity) {
        double result = switch (product) {
            case "coffee" -> quantity * 1.50;
            case "water" -> quantity * 1.00;
            case "coke" -> quantity * 1.40;
            case "snacks" -> quantity * 2.00;
            default -> 0;
        };
        return Double.parseDouble(String.format("%.2f", result).replace(",","."));
    }
}
