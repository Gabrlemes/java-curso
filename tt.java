    import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        Scanner sc -new Scanner(System.in);
        double valo1;
        double Resultado;

        System.out.println("digite um número para calcular o raio de um circulo");
        valo1 = sc.nextDouble();
        Resultado = 3.14159 * (valo1 * valo1);
        System.out.println("o valor do raio é" + Resultado);

        sc.close();

         }
    }