package entities;

public class produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValueStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }
}
