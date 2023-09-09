//package PacoteJava;
    import java.util.Scanner;
public class teste {
    //calcular a soma de dois números
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1;
        int val2;
        int resultado;

        System.out.println("digite um número:");
        val1 = sc.nextInt();
        System.out.println("digite outro número:");
        val2 = sc.nextInt();
        resultado = val1 + val2;
        System.out.println("a soma dos valores é:" + resultado);

        //calcular raio

        double R;
        double A;

        System.out.println("Agora digite um número para calcular o raio de um circulo:");
        R = sc.nextDouble();
        A = 3.14159 * (R * R);
        System.out.println("o valor do raio é " + A);

        //calcular a diferença em grupos
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


