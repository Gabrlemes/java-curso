import java.util.Scanner;

public class impar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número: ");
        int d = sc.nextInt();

        for (int i=1; i<=d; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //números entre 10 e 20 (in/out)

        System.out.println("quantos números deseja analisar? ");
        int n = sc.nextInt();

        System.out.println("quais números? ");
        int in = 0;
        int out = 0;

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


        sc.close();
    }
}