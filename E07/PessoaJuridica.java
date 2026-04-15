public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}
