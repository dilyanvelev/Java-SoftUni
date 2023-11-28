package advanced.classes.bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String command = input[0];
        Map<Integer, BankAccount> accounts = new HashMap<>();
        while (!command.equals("End")) {
            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    break;
                case "Deposit":
                    int accountId = Integer.parseInt(input[1]);
                    double money = Double.parseDouble(input[2]);
                    if (accounts.containsKey(accountId)) {
                        accounts.get(accountId).deposit(money);
                        System.out.println(String.format(
                                "Deposited %.0f to ID%d", money, accountId
                        ));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":

                    int currentId = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (accounts.containsKey(currentId)) {
                        System.out.println(accounts.get(currentId).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }


                    break;

            }


            input = scanner.nextLine().split(" ");
            command = input[0];
        }

    }
}
