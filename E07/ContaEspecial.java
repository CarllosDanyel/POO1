public class ContaEspecial extends Conta {
    protected double limiteChequeEspecial;

    public ContaEspecial(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        if (!(cliente instanceof PessoaFisica)) {
            throw new IllegalArgumentException("ContaEspecial destina-se a Pessoa Fisica");
        }
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        if (saldo - valor < -limiteChequeEspecial) return false;
        saldo -= valor;
        return true;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
