import java.text.DecimalFormat;
import java.util.*;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .toList();

        List<Double> nextNumbers = sumAdjacentNumbers(numbers);
        while (nextNumbers.size() != numbers.size()){
            numbers = nextNumbers;
            nextNumbers = sumAdjacentNumbers(numbers);
        }


        for (double num : numbers){
            System.out.print(new DecimalFormat("0.#").format(num) + " ");
        }
    }

    private static List<Double> sumAdjacentNumbers(List<Double> numbers) {
        List<Double> nextNumbers = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {
            if (i < numbers.size() - 1 && Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                nextNumbers.add(numbers.get(i) + numbers.get(i + 1));
                i += 2;
            } else {
                nextNumbers.add(numbers.get(i));
                i++;
            }
        }
        return nextNumbers;
    }
}
