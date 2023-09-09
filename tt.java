    import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int diferenca;

        System.out.println("digite um números para calcular a diferença entre os grupos:");
        a = sc.nextInt();
        System.out.println("mais um número:");
        b = sc.nextInt();
        System.out.println("mais um:");
        c = sc.nextInt();
        System.out.println("ultimo número:");
        d = sc.nextInt();
        diferenca = (a*b - c*d);

        System.out.println("o valor da diferença é " + diferenca);

        sc.close();


         }
    }