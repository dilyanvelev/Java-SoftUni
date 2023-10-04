import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String modelKeg1 = "";
        double maxVolume = 0;

        for (int i = 0; i < n; i++) {

            String modelKeg2 = scanner.nextLine();
            double radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * (Math.pow(radius, 2)) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                modelKeg1 = modelKeg2;

            }
        }
        System.out.println(modelKeg1);

    }
}
