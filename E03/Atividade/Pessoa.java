public class Pessoa {
    private String nome;
    private String cpfCnpj;
    private String dataNascimento; 
    public Pessoa() {}

    public Pessoa(String nome, String cpfCnpj, String dataNascimento) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', cpfCnpj='" + cpfCnpj + "', dataNascimento='" + dataNascimento + "'}";
    }
}
