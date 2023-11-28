package advanced.classes.carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String[] info = scanner.nextLine().split(" ");
            String brand = null;
            if (info.length < 2) {
                brand = info[0];
                Car car = new Car(brand);
                cars.add(car);
            } else {
                brand = info[0];
                String model = info[1];
                int horsePower = Integer.parseInt(info[2]);
                Car car = new Car(brand, model, horsePower);
                cars.add(car);
            }


        }
        for (Car car : cars) {
            car.carInfo();
        }

    }
}
