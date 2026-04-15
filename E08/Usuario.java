import java.util.Objects;

public abstract class Usuario {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String cpf;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    // Define se o usuário pode pegar mais um empréstimo no momento.
    public abstract boolean podePegarEmprestimo(java.util.List<Emprestimo> emprestimos);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf;
    }
}
