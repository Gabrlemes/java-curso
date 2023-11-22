package diversos;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class conta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("entre com o número da conta:\nconta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("insira o titular da conta: ");
        String nameAccount = sc.nextLine();

        System.out.println("depósito inicial? (s/n)");
        char response = sc.next().charAt(0);
        if (response == 's') {
            System.out.println("insira o valor para depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, nameAccount, initialDeposit);
        }
        else {
            account = new Account(number, nameAccount);
        }

        System.out.println();
        System.out.println("dados da conta: ");
        System.out.println(account);

        System.out.println();
        System.out.println("valor de depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("atualização de dados na conta: ");
        System.out.println(account);

        System.out.println();
        System.out.println("valor de saque: ");
        double  withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("atualização de dados na conta: ");
        System.out.println(account);

        sc.close();

    }
}
