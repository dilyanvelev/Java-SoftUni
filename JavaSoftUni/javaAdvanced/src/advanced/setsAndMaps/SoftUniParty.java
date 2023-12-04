package advanced.setsAndMaps;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> vipList = new TreeSet<>();
        Set<String> nonVipList = new TreeSet<>();


        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipList.add(input);
            } else {
                nonVipList.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                vipList.remove(input);
            } else {
                nonVipList.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(vipList.size() + nonVipList.size());
        for (String guest : vipList) {
            System.out.println(guest);
        }
        for (String guest : nonVipList) {
            System.out.println(guest);
        }
    }
}
