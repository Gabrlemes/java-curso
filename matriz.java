import java.util.Scanner;
import java.util.Locale;

public class matriz {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("de que ordem será a matriz? ");
        int n = sc.nextInt();
        int[][] mat = new int [n][n];

        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("main diagonal: ");
        for (int i=0; i<n; i++) {
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("números negativos: ");

        sc.close();
    }
}
