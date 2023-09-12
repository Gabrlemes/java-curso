    import java.util.Scanner;

public class tt {
    //horas do dia.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("que horas são? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("bom dia!");
        } else if (hora < 18) {
            System.out.println("boa tarde!");
        } else {
            System.out.println("boa noite!");
        }

        //número negativo ou positivo

        int num;

        System.out.println("digite um número: ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("número positivo: " + num);
        } else {
            System.out.println("número negativo: " + num);
        }

        //par ou ímpar.

        int n;

        System.out.println("digite um número: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("número par.");
        } else {
            System.out.println("número ímpar.");
        }

        //números multiplos.

        int numero1;
        int numero2;

        System.out.println("digite um número: ");
        numero1 = sc.nextInt();

        System.out.println("digite outro número: ");
        numero2 = sc.nextInt();

        if (numero2 % numero1 == 0) {
            System.out.println("números multiplos.");
        } else {
            System.out.println("número não multiplo.");
        }


        int hrComeco;
        int hrFim;

        System.out.println("hora início de jogo: ");
        hrComeco = sc.nextInt();

        System.out.println("hora final de jogo: ");
        hrFim = sc.nextInt();

        int duracao;
        if (hrComeco < hrFim) {
            duracao = hrFim - hrComeco;
        } else {
            duracao = 24 - hrComeco + hrFim;
        }
        System.out.println("o jogo durou " + duracao + "hora(s)");

        sc.close();

    }

}