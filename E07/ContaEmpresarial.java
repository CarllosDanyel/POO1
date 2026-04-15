public class ContaEmpresarial extends ContaEspecial {

    public ContaEmpresarial(Cliente cliente, double limiteChequeEspecial) {
        super(cliente, limiteChequeEspecial);
        if (!(cliente instanceof PessoaJuridica)) {
            throw new IllegalArgumentException("ContaEmpresarial destina-se a Pessoa Juridica");
        }
    }
}
