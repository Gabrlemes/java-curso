package notas;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class notas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("digite seu nome: ");
        student.nome = sc.nextLine();

        System.out.println("digite sua primeira nota: ");
        student.nota1 = sc.nextDouble();
        System.out.println("digite sua segunda nota: ");
        student.nota2 = sc.nextDouble();
        System.out.println("digite sua terceira nota: ");
        student.nota3 = sc.nextDouble();

        System.out.printf("nota final: %.2f%n", student.notaFinal() );

        if (student.notaFinal() < 60.0) {
            System.out.println("você reprovou " + student.nome + ", faltaram " + student.faltaPonto());
        }
        else {
            System.out.println("parabéns "+ student.nome + "! você passou.");
        }

        sc.close();
    }

}
