package Packages.Challenges.Challenge78;
import java.util.Scanner;
public class UserTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        String accountNumber = input.next();
        input.nextLine();
        System.out.print("Enter the name of account holder: ");
        String accountHolder = input.nextLine();
        BankAccount ob = new BankAccount(accountNumber, accountHolder);
        boolean i = true;
        while (i) {
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Enter the choice of operation to do: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ob.deposit();
                    break;
                case 2:
                    ob.withdraw();
                    break;
                case 3:
                    System.out.println("Your current balance is: "+ob.getBalance());
                    break;
                case 4:
                    i = false;
                    break;
                default:
                    System.out.println("Invalid operation choice...");
            }
        }
    }
}
