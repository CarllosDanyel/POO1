
import java.util.Scanner;

public class ContaCorrente {
    String nome;
    String cpf_Cnpj;
    int dataNascimento;
    int agencia;
    int numeroConta;
    private float saldo = 0;

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
    }
    public void sacar (float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void transferir (float valor, ContaCorrente contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.err.println("Transferência para " + contaDestino.nome + " realizada com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
    void mostrardados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF/CNPJ: " + cpf_Cnpj);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println("Digite o nome do titular da conta:");
        conta1.nome = scanner.nextLine();
        System.out.println("Digite o CPF/CNPJ do titular da conta:");
        conta1.cpf_Cnpj = scanner.nextLine();
        System.out.println("Digite a data de nascimento do titular da conta (formato: ddmmaaaa):");
        conta1.dataNascimento = scanner.nextInt();
        System.out.println("Digite o número da agência:");
        conta1.agencia = scanner.nextInt();
        System.out.println("Digite o número da conta:");
        conta1.numeroConta = scanner.nextInt();
        conta1.mostrardados();
    }
}