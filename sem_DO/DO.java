package sem_DO;
import java.util.Scanner;
public class DO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("entre com as medidas do triângulo x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("entre com as medidas do triângulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triangulo x é: %.4f%n", areaX);
        System.out.printf("Área do triangulo y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área X é maior.");
        }
        else{
            System.out.println("Área Y é maior.");
        }

        sc.close();
    }

}
