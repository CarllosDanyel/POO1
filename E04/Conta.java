public class Conta {
    private Pessoa titular;
    private String agencia;
    private String numeroConta;
    private double saldo;

    public Conta(Pessoa titular, String agencia, String numeroConta, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta(Pessoa titular, String agencia, String numeroConta) {
        this(titular, agencia, numeroConta, 0.0);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (valor > 0 && this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public String extrato() {
        return "Conta: " + numeroConta + " | Titular: " + titular.getNome() + " | Saldo: " + String.format("%.2f", saldo);
    }
}
