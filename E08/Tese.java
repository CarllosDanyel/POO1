public class Tese extends Publicacao {
    private Autor autor; // Uma tese tem um autor principal
    private int numeroPaginas;
    private String resumo;
    private String dataDefesa;
    private String instituicao;

    public Tese(String titulo, String dataPublicacao, double valorMultaPorRenovacao,
                Autor autor, int numeroPaginas, String resumo, String dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, valorMultaPorRenovacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
        this.autores.add(autor);
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autor: " + autor.getNome() + ", Páginas: " + numeroPaginas + ", Defesa: " + dataDefesa + ", Instituição: " + instituicao;
    }
}
