    import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R;
        double A;

        System.out.println("digite um número para calcular o raio de um circulo:");
        R = sc.nextDouble();
        A = 3.14159 * (R * R);
        System.out.println("o valor do raio é " + A);

        sc.close();


         }
    }