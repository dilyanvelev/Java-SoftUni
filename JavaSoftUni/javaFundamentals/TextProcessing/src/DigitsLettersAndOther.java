import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] characters = scanner.nextLine().toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherSymbols = new StringBuilder();
        for (char el : characters){
            if (Character.isDigit(el)){
                digits.append(el);
            } else if (Character.isLetter(el)) {
                letters.append(el);
            }else{
                otherSymbols.append(el);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherSymbols);

    }
}
