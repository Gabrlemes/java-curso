    import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double valorHora, salario;

        System.out.println("digite sua numeração de funcionário: ");
        numero = sc.nextInt();
        System.out.println("horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("quanto ganha por hora? ");
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("funcionário = " + numero);
        System.out.printf("recebe = R$ %.2f%n", salario);

        sc.close();
    }
}