public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    public Emprestimo(Publicacao publicacao, Usuario usuario) { this.publicacao = publicacao; this.usuario = usuario; }
    @Override
    public String toString() { return publicacao.toString() + " -> " + usuario.toString(); }
}
