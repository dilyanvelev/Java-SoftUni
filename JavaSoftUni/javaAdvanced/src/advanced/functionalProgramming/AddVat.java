package advanced.functionalProgramming;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] prices = scanner.nextLine().split(", ");
        Function<String, Double> parseToDouble = Double::parseDouble;
        UnaryOperator<Double> addVat = e -> e*1.2;
        Consumer<Double> printer = e -> System.out.printf("%.2f%n",e);
        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(parseToDouble)
                .map(addVat)
                .forEach(printer);
    }
}
