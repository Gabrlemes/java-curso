package entities;

public class doces extends Produto{

    private String marca;

    public doces(int codigo, String nome) {
        super(codigo, nome);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
