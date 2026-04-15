public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        if (!(cliente instanceof PessoaFisica)) {
            throw new IllegalArgumentException("ContaPoupanca destina-se a Pessoa Fisica");
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        if (saldo - valor < 0) return false;
        saldo -= valor;
        return true;
    }

    public void rendimento() {
        saldo += saldo * 0.005; // 0,5%
    }
}
