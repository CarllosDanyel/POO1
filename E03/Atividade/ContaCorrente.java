

public class ContaCorrente {
    String nome;
    String cpf_Cnpj;
    int rg;
    int dataNascimento;
    int agencia;
    int numeroConta;
    private double saldo = 0;

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void transferir (double valor, ContaCorrente contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}