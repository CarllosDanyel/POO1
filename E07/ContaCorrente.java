public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        if (!(cliente instanceof PessoaFisica)) {
            throw new IllegalArgumentException("ContaCorrente destina-se a Pessoa Fisica");
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        if (saldo - valor < 0) return false;
        saldo -= valor;
        return true;
    }
}
