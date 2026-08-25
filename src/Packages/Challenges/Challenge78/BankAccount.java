package Packages.Challenges.Challenge78;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private float balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        float money = input.nextFloat();
        if (money > 200000)
            System.out.println("High deposit amount\nPlease give proof of the money.");
        else if (money<=0) {
            System.out.println("Invalid deposite amount.");
        }
        else {
            balance += money;
            System.out.println("Your available balance is: " + balance);
        }
    }

    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to Withdraw: ");
        float amount = input.nextFloat();
        if (balance < amount)
            System.out.println("Insufficient balance...\nplease try lower amount");
        else if (amount<=0) {
            System.out.println("No withdraw will done with this amount.");
        } else {
            balance -= amount;
            System.out.println("Your available balance is: " + balance);
        }
    }

    public float getBalance(){
        return balance;
    }
}