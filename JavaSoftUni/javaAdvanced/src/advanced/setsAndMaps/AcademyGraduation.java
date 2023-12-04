package advanced.setsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());  // Consume the newline character

        Map<String, double[]> studentsData = new TreeMap<>();

        for (int i = 0; i < numStudents; i++) {
            String name = scanner.nextLine();

            String[] scoresStr = scanner.nextLine().split(" ");
            double[] scores = new double[scoresStr.length];

            for (int j = 0; j < scoresStr.length; j++) {
                scores[j] = Double.parseDouble(scoresStr[j]);
            }

            studentsData.put(name, scores);
        }

        for (Map.Entry<String, double[]> entry : studentsData.entrySet()) {
            String name = entry.getKey();
            double[] scores = entry.getValue();
            double averageScore = calculateAverage(scores);

            System.out.printf("%s is graduated with %f\n", name, averageScore);
        }
    }

    private static double calculateAverage(double[] scores) {
        double total = 0;

        for (double score : scores) {
            total += score;
        }

        return total / scores.length;
    }
}
