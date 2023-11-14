import java.util.*;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNums = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String num : strNums){
            numbers.add(Integer.parseInt(num));
        }


        int index = 0;
        while (index < numbers.size()){
            if(numbers.get(index) < 0){
                numbers.remove(index);
            }else{
                index++;
            }
        }
        if (numbers.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(numbers);
            for(int num : numbers){
                System.out.print(num + " ");
            }
        }



    }
}
