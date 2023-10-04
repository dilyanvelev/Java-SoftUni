import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        double halfPokePower = pokePower * 0.50;
        int counter = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            counter++;
            if (pokePower == halfPokePower && exhaustionFactor != 0) {

                pokePower /= exhaustionFactor;


            }
        }
        System.out.println(pokePower);
        System.out.println(counter);
    }
}
