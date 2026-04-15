public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private int renovacoes;
    private boolean ativo;

    public Emprestimo(Publicacao publicacao, Usuario usuario) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.renovacoes = 0;
        this.ativo = true;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void renovar() {
        if (ativo) {
            renovacoes++;
        }
    }

    // Devolve e retorna a multa calculada
    public double devolver() {
        if (!ativo) return 0.0;
        ativo = false;
        return publicacao.calcularMulta(renovacoes);
    }

    @Override
    public String toString() {
        return "Emprestimo: " + publicacao.getTitulo() + " -> " + usuario.getNome() + " (renovações: " + renovacoes + ")";
    }
}
