package branch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
public class Comidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Exibir Produtos");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    produtos.add(new Produto(nome, preco));
                    break;
                case 2:
                    System.out.println("Produtos Disponíveis:");
                    for (Produto produto : produtos) {
                        System.out.println(produto.getNome() + " - R$" + produto.getPreco());
                    }
                    break;
                case 3:
                    List<Produto> pedido = new ArrayList<>();
                    double total = 0;

                    while (true) {
                        System.out.print("Digite o nome do produto que deseja (ou 'sair' para finalizar): ");
                        String produtoDesejado = scanner.nextLine();

                        if (produtoDesejado.equalsIgnoreCase("sair")) {
                            break;
                        }

                        boolean encontrado = false;

                        for (Produto produto : produtos) {
                            if (produto.getNome().equalsIgnoreCase(produtoDesejado)) {
                                System.out.print("Digite a quantidade desejada: ");
                                int quantidade = scanner.nextInt();
                                pedido.add(new Produto(produto.getNome(), produto.getPreco() * quantidade));
                                total += produto.getPreco() * quantidade;
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Produto não encontrado.");
                        }

                        scanner.nextLine();
                    }

                    System.out.println("Pedido:");
                    for (Produto produto : pedido) {
                        System.out.println(produto.getNome() + " - R$" + produto.getPreco());
                    }
                    System.out.println("Total: R$" + total);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o sistema de pedidos!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
