package advanced.setsAndMaps;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbersCount = new LinkedHashMap<>();

        for (double num : input) {
            if (!numbersCount.containsKey(num)) {
                numbersCount.put(num, 1);
            } else {
                numbersCount.put(num, numbersCount.get(num) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbersCount.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
