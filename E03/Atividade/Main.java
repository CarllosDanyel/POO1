import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta();
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome do titular da conta:");
        p1.setNome(scanner.nextLine());
        System.out.println("Digite o CPF/CNPJ do titular da conta:");
        p1.setCpfCnpj(scanner.nextLine());
        System.out.println("Digite a data de nascimento do titular da conta (formato: ddmmaaaa):");
        p1.setDataNascimento(scanner.nextLine());
        conta1.setTitular(p1);
        System.out.println("Digite o número da agência:");
        conta1.setAgencia(scanner.nextLine());
        System.out.println("Digite o número da conta:");
        conta1.setNumeroConta(scanner.nextLine());

        Conta conta2 = new Conta();
        Pessoa p2 = new Pessoa();
        System.out.println("\n--- Dados da segunda conta ---");
        System.out.println("Digite o nome do titular da conta:");
        p2.setNome(scanner.nextLine());
        System.out.println("Digite o CPF/CNPJ do titular da conta:");
        p2.setCpfCnpj(scanner.nextLine());
        System.out.println("Digite a data de nascimento do titular da conta (formato: ddmmaaaa):");
        p2.setDataNascimento(scanner.nextLine());
        conta2.setTitular(p2);
        System.out.println("Digite o número da agência:");
        conta2.setAgencia(scanner.nextLine());
        System.out.println("Digite o número da conta:");
        conta2.setNumeroConta(scanner.nextLine());

        conta1.depositar(1000);
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        conta1.sacar(200);
        System.out.println("Saldo da conta 1 após saque: " + conta1.getSaldo());
        conta1.transferir(300, conta2);
        System.out.println("Saldo da conta 1 após transferência: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 após receber transferência: " + conta2.getSaldo());
        scanner.close();

    }
}

