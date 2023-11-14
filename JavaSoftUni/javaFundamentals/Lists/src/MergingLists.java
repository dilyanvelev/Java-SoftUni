import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersA = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> numbersB = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> newNumbers = new ArrayList<>();

        int sizeA = numbersA.size();
        int sizeB = numbersB.size();
        int maxSize = Math.max(sizeA, sizeB);

        for (int i = 0; i < maxSize; i++) {
            if (i < sizeA) {
                newNumbers.add(numbersA.get(i));
            }
            if (i < sizeB) {
                newNumbers.add(numbersB.get(i));
            }
        }

        for (int num : newNumbers) {
            System.out.print(num + " ");
        }
    }
}
