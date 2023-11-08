package diversos;

import java.util.Scanner;

public class retur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite quantos números quer que o programa leia: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        System.out.println("insira os números para serem lidos: ");
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        System.out.println("legenda: in -> entre 10 e 20.\nout -> menor que 10 ou maior que 20.");

        sc.close();
    }
}