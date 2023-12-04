package advanced.setsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        List<Double> grades;
        Map<String, List<Double>> studentGrade = new TreeMap<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);

            if (!studentGrade.containsKey(name)) {
                grades = new ArrayList<>();
                grades.add(grade);
                studentGrade.put(name, grades);
            } else {
                grades = studentGrade.get(name);
                grades.add(grade);
                studentGrade.put(name, grades);
            }


        }
        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {
            double average = entry.getValue().stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.0);

            String gradesString = entry.getValue().stream()
                    .map(num -> String.format("%.2f", num))
                    .collect(Collectors.joining(" "));

            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(), gradesString, average);
        }


    }
}
