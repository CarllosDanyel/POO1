public class Pessoa {
    private String nome;
    private String cpfCnpj;
    private String dataNascimento;

    public Pessoa(String nome, String cpfCnpj, String dataNascimento) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
