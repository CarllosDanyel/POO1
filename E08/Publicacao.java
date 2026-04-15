import java.util.ArrayList;
import java.util.List;

public abstract class Publicacao {
    protected String titulo;
    protected String dataPublicacao;
    protected List<Publicacao> referencias = new ArrayList<>();
    protected List<Autor> autores = new ArrayList<>();
    protected double valorMultaPorRenovacao;

    public Publicacao(String titulo, String dataPublicacao, double valorMultaPorRenovacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.valorMultaPorRenovacao = valorMultaPorRenovacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public double getValorMultaPorRenovacao() {
        return valorMultaPorRenovacao;
    }

    public void adicionarReferencia(Publicacao p) {
        referencias.add(p);
    }

    public void adicionarAutor(Autor a) {
        autores.add(a);
    }

    // Calcula a multa total considerando que as primeiras 3 renovações são grátis.
    public double calcularMulta(int numeroRenovacoes) {
        int acima = Math.max(0, numeroRenovacoes - 3);
        return acima * valorMultaPorRenovacao;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + titulo + " (" + dataPublicacao + ")";
    }
}
