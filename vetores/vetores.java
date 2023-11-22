import java.util.Locale;
import java.util.Scanner;

public class vetores {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos números irá digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for ( int i = 0; i < n; i++) {
            System.out.println("digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("números negativos:");
        for (int i = 0; i < n; i++) {
            if(vet[i] < 0 ){
                System.out.println(vet[i]);
            }
        }

        //soma vetores

        

        sc.close();
    }
}

