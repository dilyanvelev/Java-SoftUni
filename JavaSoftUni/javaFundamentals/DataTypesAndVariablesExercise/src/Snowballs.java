import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(sc.nextLine());

        double maxSnowBallValue = 0;
        int totalSnowBallSnow = 0;
        int totalSnowBallTime = 0;
        int totalSnowBallQuantity = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {

            int snowBallSnow = Integer.parseInt(sc.nextLine());
            int snowBallTime = Integer.parseInt(sc.nextLine());
            int snowBallQuality = Integer.parseInt(sc.nextLine());
            double snowBallValue = Math.pow(snowBallSnow / snowBallTime, snowBallQuality);

            if (snowBallValue > maxSnowBallValue) {
                maxSnowBallValue = snowBallValue;
                totalSnowBallSnow = snowBallSnow;
                totalSnowBallQuantity = snowBallQuality;
                totalSnowBallTime = snowBallTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", totalSnowBallSnow, totalSnowBallTime, maxSnowBallValue, totalSnowBallQuantity);
    }
}
