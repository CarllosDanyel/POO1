public class Tese extends Publicacao {
    public Tese(String titulo) { super(titulo); }
    @Override
    public String toString() { return "Tese: " + getTitulo(); }
}
