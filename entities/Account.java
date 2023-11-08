package entities;

public class contas {

    private int conta;
    private String nameAccount;
    private double saldo;

    public contas(int conta, String nameAccount) {
        this.conta = conta;
        this.nameAccount = nameAccount;
    }

    public contas(int conta, String nameAccount, double depositoInicial) {
        this.conta = conta;
        this.nameAccount = nameAccount;
        deposito(depositoInicial);
    }

    public int getConta() {
        return conta;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {
        saldo -= amount + 5.0;
    }

    public String toString() {
        return "conta "
                + conta
                + ", nome destinatário: "
                + nameAccount
                + ", saldo: $ "
                + String.format("%.2f", saldo);
    }
}

