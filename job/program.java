import java.util.Locale;
import java.util.Scanner;
import entities.rent;

public class program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rent[] vect = new rent[10];

        System.out.println("quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("alugado #" + i + ":");
            System.out.print("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("quarto: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new rent(name, email);
        }

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}
