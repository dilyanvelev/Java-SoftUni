package advanced.classes.bankAccount;

import java.util.Scanner;

public class BankAccount {


    public static int accountCount = 0;
    private static double interestRate = 0.02;
    private int id;
    private double balance;


    BankAccount() {
        accountCount++;
        this.id = accountCount;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }


    public static void setInterestRate(double interestRateInput) {
        interestRate = interestRateInput;

    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getInterest(int years) {
        double result = BankAccount.interestRate * years * this.balance;
        return String.format("%.2f", result);
    }


}
