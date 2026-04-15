public abstract class Publicacao {
    protected String titulo;
    public Publicacao(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
    @Override
    public String toString() { return titulo; }
}
