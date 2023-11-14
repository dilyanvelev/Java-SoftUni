import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> intNums = new ArrayList<>();

        for (String num : numbers) {
            intNums.add(Integer.parseInt(num));
        }
        List<String> command = Arrays.asList(scanner.nextLine().split(" "));

        while (!command.get(0).equals("end")) {
            if (command.get(0).equals("Contains")) {
                int num = Integer.parseInt(command.get(1));
                if (intNums.contains(num)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.get(0).equals("Print")) {
                if (command.get(1).equals("even")) {
                    for (int num : intNums) {
                        if (num % 2 == 0) {
                            System.out.print(num + " ");

                        }
                    }
                    System.out.println();
                } else if (command.get(1).equals("odd")) {
                    for (int num : intNums) {
                        if (num % 2 != 0) {
                            System.out.print(num + " ");

                        }
                    }
                    System.out.println();
                }

            } else if (command.get(0).equals("Get")) {
                System.out.println(intNums.stream().mapToInt(Integer::intValue).sum());
            } else if (command.get(0).equals("Filter")) {
                if (command.get(1).equals("<")) {
                    int number = Integer.parseInt(command.get(2));
                    for (int num : intNums) {
                        if (num < number){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();

                } else if (command.get(1).equals(">")) {
                    int number = Integer.parseInt(command.get(2));
                    for (int num : intNums) {
                        if (num > number){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                } else if (command.get(1).equals(">=")) {
                    int number = Integer.parseInt(command.get(2));
                    for (int num : intNums) {
                        if (num >= number){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();

                } else if (command.get(1).equals("<=")) {
                    int number = Integer.parseInt(command.get(2));
                    for (int num : intNums) {
                        if (num <= number){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();

                }

            }

            command = Arrays.asList(scanner.nextLine().split(" "));
        }


    }
}
