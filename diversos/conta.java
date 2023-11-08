package diversos;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class account {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        account account;

        System.out.println("entre com o número da conta:\nconta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("insira o titular da conta: ");
        String nameAccount = sc.nextLine();

        System.out.println("depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.println("insira o valor para depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            account = new account(conta, nameAccount, depositoInicial);
        }
        else {
            account = new account(conta, nameAccount);
        }

        System.out.println();
        System.out.println("dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("valor de depósito: ");
        double  depositValue = sc.nextDouble();
        account.deposito(depositValue);
        System.out.println("atualização de dados na conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("valor de saque: ");
        double  withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("atualização de dados na conta: ");
        System.out.println(conta);

        sc.close();

    }
}
