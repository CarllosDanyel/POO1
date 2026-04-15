public class Livro extends Publicacao {
    public Livro(String titulo) { super(titulo); }
    @Override
    public String toString() { return "Livro: " + getTitulo(); }
}
