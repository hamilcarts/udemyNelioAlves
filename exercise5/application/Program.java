package exercise5.application;

import exercise5.entities.BankAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount bankAccount1;
        System.out.println("Enter account number: ");
        String accountNumber = scan.nextLine();
        System.out.println("Enter account holder: ");
        String accountHolder = scan.nextLine();
        System.out.println("Is there na initial deposit (y/n)");
        String initialDeposit = scan.nextLine();
        double balance = 0;
        if (initialDeposit.equals("y")){
            System.out.println("Enter initial deposit value: ");
            balance = scan.nextDouble();
            bankAccount1 = new BankAccount(accountNumber, accountHolder, balance);
            System.out.println(bankAccount1.openAccount());
        } else {
            bankAccount1 = new BankAccount(accountNumber, accountHolder);
            System.out.println(bankAccount1.openAccount());
        }



        System.out.println("Enter a deposit value: ");
        bankAccount1.deposit(scan.nextDouble());
        System.out.println(bankAccount1.updatedAccount());

        System.out.println("Enter a withdraw value: ");
        bankAccount1.withdraw(scan.nextDouble());
        System.out.println(bankAccount1.updatedAccount());
    }
}
