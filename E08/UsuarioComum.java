import java.util.List;

public class UsuarioComum extends Usuario {
    public UsuarioComum(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }

    @Override
    public boolean podePegarEmprestimo(List<Emprestimo> emprestimos) {
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo() && e.getUsuario().equals(this)) {
                return false; // já tem um empréstimo ativo
            }
        }
        return true;
    }
}
