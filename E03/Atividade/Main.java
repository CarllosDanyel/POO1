import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta();
        System.out.println("--- Dados do titular da conta 1 ---");
        System.out.println("Digite o nome do titular da conta 1:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o CPF/CNPJ do titular da conta 1:");
        String cpf1 = scanner.nextLine();
        System.out.println("Digite a data de nascimento do titular da conta 1 (formato: ddmmaaaa):");
        String data1 = scanner.nextLine();
        conta1.setTitular(new Pessoa(nome1, cpf1, data1));
        System.out.println("Digite o número da agência:");
        conta1.setAgencia(scanner.nextLine());
        System.out.println("Digite o número da conta:");
        conta1.setNumeroConta(scanner.nextLine());

        Conta conta2 = new Conta();
        System.out.println("--- Dados do titular da conta 2 ---");
        System.out.println("Digite o nome do titular da conta 2:");
        String nome2 = scanner.nextLine();
        System.out.println("Digite o CPF/CNPJ do titular da conta 2:");
        String cpf2 = scanner.nextLine();
        System.out.println("Digite a data de nascimento do titular da conta 2 (formato: ddmmaaaa):");
        String data2 = scanner.nextLine();
        conta2.setTitular(new Pessoa(nome2, cpf2, data2));
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

        // Usar ArrayList para armazenar contas
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);

        // Menu principal do banco (laço infinito até escolher sair)
        while (true) {
            System.out.println("\n=== Banco Simples ===");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Exibir extrato (por número da conta)");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            String opc = scanner.nextLine();
            int opcao;
            if opcao = 0;

            arraylist<Pessoa>