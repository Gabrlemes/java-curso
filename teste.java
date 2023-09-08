//package PacoteJava;
    import java.util.Scanner;
public class teste {
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
        System.out.println("a soma dos valores é:"+resultado);

        sc.close();


        }

    }


