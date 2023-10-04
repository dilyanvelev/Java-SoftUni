import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        //Inputs
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int numberStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        //Calculations

        double saberCount = Math.ceil(numberStudents * 1.10);
        int beltsCount = numberStudents - numberStudents / 6;
        double totalPrice = saberCount * priceLightsabers + priceRobes * numberStudents + priceBelt * beltsCount;
        if (amountMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - amountMoney);
        }
    }
}
