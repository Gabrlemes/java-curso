import entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;

public class prog {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("quantos funcionários serão registrados? ");
        int N = sc.nextInt();

        for(int i=0; i<=N; i++) {
            System.out.println("funcionário #" + (i+1) + ":");
            System.out.print("id: ");
            Integer id = sc.nextInt();
            System.out.println("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("salário: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("entre com o ID do funcionário que terá aumento: ");
        int idsalary = sc.nextInt();

        sc.close();
    }
}
