package entities;

public class revista extends Produto{

    private String editora;

    public revista(int codigo, String nome, String editora) {
        super(codigo, nome);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
