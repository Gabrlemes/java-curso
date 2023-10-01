package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;
public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("entre com os dados do objeto:");
        System.out.print("nome: ");
        product.nome = sc.nextLine();

        System.out.print("preco: ");
        product.preco = sc.nextDouble();

        System.out.print("quantia:");
        product.quantidade = sc.nextInt();

        System.out.println("dados do produto: " + product);

        System.out.println("entre com o número de produtos para ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);

        System.out.println("dados atualizados : " + product);

        System.out.println("entre com o número de produtos para ser removidos do estoque: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);

        System.out.println("dados atualizados : " + product);

        sc.close();
    }
}
