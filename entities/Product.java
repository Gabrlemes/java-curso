package entities;

import javax.xml.namespace.QName;

public class Product {

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

    public String toString() {
        return nome
                + ", $ "
                +String.format("%.2f", preco)
                + ", "
                + quantidade
                +" unidades, total: $ "
                + String.format("%.2f", totalValueStock());
    }

}
