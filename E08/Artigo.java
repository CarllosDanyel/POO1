public class Artigo extends Publicacao {
    private String resumo;

    public Artigo(String titulo, String dataPublicacao, double valorMultaPorRenovacao, String resumo) {
        super(titulo, dataPublicacao, valorMultaPorRenovacao);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Resumo: " + (resumo == null ? "" : resumo);
    }
}
