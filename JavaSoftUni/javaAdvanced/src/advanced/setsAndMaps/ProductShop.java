package advanced.setsAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("Revision")) {


            String shop = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);

            if (!shops.containsKey(shop)) {
                shops.put(shop, new LinkedHashMap<>());
            }

            Map<String, Double> products = shops.get(shop);

            if (!products.containsKey(product) || products.get(product) > price) {
                products.put(product, price);
            }
            input = scanner.nextLine().split(", ");
        }

        for (String shop : shops.keySet()) {
            System.out.println(shop + "->");

            Map<String, Double> products = shops.get(shop);
            for (String product : products.keySet()) {
                double price = products.get(product);
                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            }

        }
    }
}
