import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) return c;
        }
        return null;
    }

    public void listarContas() {
        for (Conta c : contas) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        PessoaFisica pf = new PessoaFisica("Joao Silva", "Rua A, 123", "111.222.333-44");
        ContaCorrente cc = new ContaCorrente(pf);
        cc.depositar(1000);
        banco.adicionarConta(cc);

        ContaEspecial ce = new ContaEspecial(pf, 2000);
        ce.depositar(1000);
        banco.adicionarConta(ce);

        ContaPoupanca cp = new ContaPoupanca(pf);
        cp.depositar(500);
        cp.rendimento();
        banco.adicionarConta(cp);

        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. B, 456", "12.345.678/0001-99");
        ContaEmpresarial ceEmp = new ContaEmpresarial(pj, 5000);
        ceEmp.depositar(2000);
        banco.adicionarConta(ceEmp);

        System.out.println("--- Contas no banco ---");
        banco.listarContas();

        System.out.println();
        System.out.println("Tentando sacar R$3000 da Conta Especial (limite 2000):");
        boolean sacou = ce.sacar(3000);
        System.out.println("Saque realizado: " + sacou + " - Saldo: " + ce.getSaldo());
    }
}
