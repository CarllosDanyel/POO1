public class Conta {
    private Pessoa titular;
    private String agencia;
    private String numeroConta;
    private String banco;
    private double saldo = 0;

    public Conta() {}

    public Conta(Pessoa titular, String agencia, String numeroConta, String banco) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.banco = banco;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
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

    public boolean transferir(double valor, Conta destino){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}