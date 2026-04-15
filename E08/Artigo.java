public class Artigo extends Publicacao {
    public Artigo(String titulo) { super(titulo); }
    @Override
    public String toString() { return "Artigo: " + getTitulo(); }
}
