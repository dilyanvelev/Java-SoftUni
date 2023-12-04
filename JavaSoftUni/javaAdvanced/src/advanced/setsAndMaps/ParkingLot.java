package advanced.setsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Set<String> carsPlate = new LinkedHashSet<>();

        while (!input[0].equals("END")) {
            String direction = input[0];
            String carNumber = input[1];
            if (direction.equals("IN")) {
                carsPlate.add(carNumber);
            } else if (direction.equals("OUT")) {
                if (carsPlate.contains(carNumber)) {
                    carsPlate.remove(carNumber);
                }
            }
            input = scanner.nextLine().split(", ");
        }

        if (carsPlate.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carPlate : carsPlate) {
                System.out.println(carPlate);
            }
        }


    }
}
