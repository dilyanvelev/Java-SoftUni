import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> intNums = new ArrayList<>();

        for (String num : numbers) {
            intNums.add(Integer.parseInt(num));
        }
        List<String> command = Arrays.asList(scanner.nextLine().split(" "));

        while(!command.get(0).equals("end")){

            switch (command.get(0)){
                case "Add":
                    intNums.add(Integer.parseInt(command.get(1)));
                    break;
                case "Remove":
                    Integer num = Integer.parseInt(command.get(1));
                    intNums.remove(num);
                    break;
                case "RemoveAt":
                    intNums.remove(Integer.parseInt(command.get(1)));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command.get(2));
                    int element = Integer.parseInt(command.get(1));
                    intNums.add(index,element);
                    break;
            }
            command = Arrays.asList(scanner.nextLine().split(" "));
        }
        for (int num : intNums){
            System.out.print(num + " ");
        }


    }
}
