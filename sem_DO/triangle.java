package sem_DO;

import java.util.Scanner;
import java.util.Locale;

import entities.triangulo;
public class triangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("entre com as medidas do triângulo x: ");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("entre com as medidas do triângulo y: ");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triangulo x é: %.4f%n", areaX);
        System.out.printf("Área do triangulo y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área X é maior.");
        } else {
            System.out.println("Área Y é maior.");
        }

        sc.close();

    }
}

