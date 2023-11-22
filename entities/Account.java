package entities;

public class Account {

    private int number;
    private String nameAccount;
    private double balance;

    public Account(int number, String nameAccount) {
        this.number = number;
        this.nameAccount = nameAccount;
    }

    public Account(int number, String nameAccount, double initialDeposit) {
        this.number = number;
        this.nameAccount = nameAccount;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "conta "
                + number
                + ", nome destinatário: "
                + nameAccount
                + ", saldo: $ "
                + String.format("%.2f", balance);
    }
}

