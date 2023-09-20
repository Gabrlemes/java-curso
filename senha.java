import java.util.Scanner;
    public class senha {

        //while exercise.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("digite a senha: ");

            int senha = sc.nextInt();

            while (senha != 2002) {
                System.out.println("senha incorreta!");
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

            sc.close();
        }

}
