package func;

import java.util.Scanner;
import java.util.Locale;
import entities.impo;

public class funcionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        impo emp = new impo();

        System.out.print("nome: ");
        emp.name = sc.nextLine();

        System.out.print("salário bruto: ");
        emp.salary = sc.nextDouble();

        System.out.print("imposto: ");
        emp.impost = sc.nextDouble();

        System.out.println();
        System.out.println("funcionário: " + emp);
        System.out.println();
        System.out.print("quantos % será o aumento salárial? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.print("atualização dos dados: " + emp);

        sc.close();

    }
}
