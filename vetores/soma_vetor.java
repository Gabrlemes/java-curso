package vetores;

import java.util.Locale;
import java.util.Scanner;
public class soma_vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int n;
        double soma, media;

        System.out.println("quantos número você irá somar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<n; i++) {
            System.out.println("digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for(int i=0; i<n; i++) {
            soma += vetor[i];
        }

        media = soma/n;

        System.out.print("valores = ");

        for(int i=0; i<n; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nsoma = %.2f\n", soma);
        System.out.printf("media = %.2f\n", media);
    }
}
