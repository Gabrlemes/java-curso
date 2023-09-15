package comidas;
import java.util.Scanner;
import java.util.ArrayList;

public class comidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p1 = "1- x-salada R$ 6.0\n ";
        String p2 = "2- coca R$ 4.5\n ";
        String p3 = "3- misto R$ 2.0\n ";
        String p4 = "4- hot-dog R$ 4.0\n ";


        System.out.println("escolha seu pedido:\n " + p1 + p2 + p3 + p4);

        int codigo = sc.nextInt();
        System.out.println("quantia ");
        int quantidade = sc.nextInt();
        double total = 0.0;

        switch (codigo){
            case 1:
                total = quantidade * 6.0;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 2.0;
            case 4:
                total = quantidade * 4.0;
            default:
                System.out.println("escolha um valor válido.");
        };
        System.out.println("seu pedido ficou R$ " + total);

        sc.close();

        }
    }