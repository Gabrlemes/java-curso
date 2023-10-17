package sem_DO;

import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class divisores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}