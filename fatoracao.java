import java.util.Scanner;

public class fatoracao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //divisão
        System.out.println("quantas divisões quer fazer? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("digite os números para divisão: ");

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        //.

        System.out.println("digite um número: ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }


}
