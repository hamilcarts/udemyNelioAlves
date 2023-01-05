package exercise5.entities;

public class BankAccount {
    private final String accountNumber;
    private String holder;
    private double balance;

    public BankAccount(String accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public BankAccount(String accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        if (balance >= (value + 5)) {
            this.balance -= (value + 5);
            updatedAccount();
        } else {
            System.out.println("insufficient funds");
        }
    }

    public String updatedAccount() {
        return "Account data:\n" +
                "Account " + accountNumber +
                ", Holder: '" + holder +
                ", Balance: $ " + balance;
    }
    public String openAccount() {
        return "Account data:\n" +
                "Account " + accountNumber +
                ", Holder: '" + holder +
                ", Balance: $ " + balance;
    }
}
