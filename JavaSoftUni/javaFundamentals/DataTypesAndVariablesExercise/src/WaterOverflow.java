import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        int totalLiters = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int liters = Integer.parseInt(sc.nextLine());
            totalLiters += liters;

            if (totalLiters > 255) {
                System.out.println("Insufficient capacity!");
                totalLiters -= liters;

            }


        }
        System.out.println(totalLiters);
    }
}
