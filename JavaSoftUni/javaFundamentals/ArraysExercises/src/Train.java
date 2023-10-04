import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(sc.nextLine());
        int[] wholeTrain = new int[countOfWagons];
        int sum = 0;
        for (int i = 0; i < countOfWagons; i++) {
            int countOfPeople = Integer.parseInt(sc.nextLine());
            sum += countOfPeople;
            wholeTrain[i] = countOfPeople;

        }
        for (int numbers : wholeTrain){
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println(sum);


    }
}
