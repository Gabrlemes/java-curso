package contas;

import java.util.Scanner;
    public class senha {

        //while exercise.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("digite a contas.senha: ");

            int senha = sc.nextInt();

            while (senha != 2002) {
                System.out.println("contas.senha incorreta!");
                senha = sc.nextInt();
            }

            System.out.println("acesso liberado.");


            //plano cartesiano.
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                }
                else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                }
                else {
                    System.out.println("quarto");
                }
                x = sc.nextInt();
                y = sc.nextInt();
            }

            //do while
            char resp;
            do {
                System.out.println("Digite a temperatura em Celsius e devolverei em fahrenheit: ");
                double c = sc.nextDouble();
                double f = 9.0 * c / 5.0 + 32.0;
                System.out.printf("a temperatura em fahrenheit é de: %.1f%n", f);
                System.out.println("deseja repetir o processo? (s/n);?");
                resp = sc.next(). charAt(0);
            }while (resp != 'n');

            sc.close();
        }

}
