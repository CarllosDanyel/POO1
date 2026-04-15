import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public Conta buscarPorNumero(String numero) {
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numero)) return c;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("\n=== Banco Simples ===");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Exibir extrato (por número da conta)");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            String linha = sc.nextLine();
            int opcao = -1;
            try {
                opcao = Integer.parseInt(linha);
            } catch (Exception e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1: // Criar nova conta
                    System.out.print("Nome do titular: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF/CNPJ do titular: ");
                    String cpf = sc.nextLine();
                    System.out.print("Data de nascimento (ddmmaaaa): ");
                    String data = sc.nextLine();
                    Pessoa p = new Pessoa(nome, cpf, data);
                    System.out.print("Número da agência: ");
                    String agencia = sc.nextLine();
                    System.out.print("Número da conta: ");
                    String numero = sc.nextLine();
                    Conta nova = new Conta(p, agencia, numero);
                    banco.adicionarConta(nova);
                    System.out.println("Conta criada com sucesso: " + nova.getNumeroConta());
                    break;
                case 2: // Exibir extrato
                    System.out.print("Digite o número da conta: ");
                    String numEx = sc.nextLine();
                    Conta cEx = banco.buscarPorNumero(numEx);
                    if (cEx != null) {
                        System.out.println(cEx.extrato());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3: // Sacar
                    System.out.print("Número da conta: ");
                    String numS = sc.nextLine();
                    Conta cS = banco.buscarPorNumero(numS);
                    if (cS == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }
                    System.out.print("Valor a sacar: ");
                    try {
                        double v = Double.parseDouble(sc.nextLine());
                        if (cS.sacar(v)) System.out.println("Saque efetuado com sucesso.");
                        else System.out.println("Saque não efetuado. Saldo insuficiente ou valor inválido.");
                    } catch (Exception e) {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 4: // Depositar
                    System.out.print("Número da conta: ");
                    String numD = sc.nextLine();
                    Conta cD = banco.buscarPorNumero(numD);
                    if (cD == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }
                    System.out.print("Valor a depositar: ");
                    try {
                        double v2 = Double.parseDouble(sc.nextLine());
                        if (cD.depositar(v2)) System.out.println("Depósito efetuado com sucesso.");
                        else System.out.println("Depósito não efetuado. Valor inválido.");
                    } catch (Exception e) {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 5: // Transferir
                    System.out.print("Número da conta origem: ");
                    String origem = sc.nextLine();
                    Conta cOrig = banco.buscarPorNumero(origem);
                    if (cOrig == null) {
                        System.out.println("Conta origem não encontrada.");
                        break;
                    }
                    System.out.print("Número da conta destino: ");
                    String destino = sc.nextLine();
                    Conta cDest = banco.buscarPorNumero(destino);
                    if (cDest == null) {
                        System.out.println("Conta destino não encontrada.");
                        break;
                    }
                    System.out.print("Valor a transferir: ");
                    try {
                        double vt = Double.parseDouble(sc.nextLine());
                        if (cOrig.transferir(vt, cDest)) System.out.println("Transferência efetuada com sucesso.");
                        else System.out.println("Transferência não efetuada. Saldo insuficiente ou valor inválido.");
                    } catch (Exception e) {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
