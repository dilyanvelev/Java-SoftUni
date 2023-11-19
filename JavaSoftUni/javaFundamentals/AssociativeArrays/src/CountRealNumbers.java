import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbersCount = new TreeMap<>();
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (double num : numbers){
            if (numbersCount.get(num) == null){
                numbersCount.put(num, 1);
            }else{
                numbersCount.put(num, numbersCount.get(num) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbersCount.entrySet()) {
            System.out.println(new DecimalFormat("0.#").format(entry.getKey()) + " -> " + entry.getValue());
        }


    }
}
