public class Livro extends Publicacao {
    private int numeroEdicao;
    private String editora;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, double valorMultaPorRenovacao,
                 int numeroEdicao, String editora, String isbn) {
        super(titulo, dataPublicacao, valorMultaPorRenovacao);
        this.numeroEdicao = numeroEdicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString() + " - Edição: " + numeroEdicao + ", Editora: " + editora + ", ISBN: " + isbn;
    }
}
