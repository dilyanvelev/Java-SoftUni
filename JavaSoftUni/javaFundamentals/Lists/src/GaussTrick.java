import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;


public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());


        List<Integer> newNumbers = new ArrayList<>();

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size() / 2; i++) {
                newNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));

            }
        } else {
            for (int i = 0; i < numbers.size() / 2; i++) {
                newNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));

            }
            newNumbers.add(numbers.size() / 2 + 1);
        }


        for (int num : newNumbers) {
            System.out.print(num + " ");
        }


    }
}
