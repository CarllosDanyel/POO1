import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    public void adicionarConta(Conta conta) { contas.add(conta); }
    public Conta buscarConta(String numero) {
        for (Conta c : contas) if (c.getNumero().equals(numero)) return c;
        return null;
    }
    public void listarContas() { for (Conta c : contas) System.out.println(c); }
    public static void main(String[] args) {
        Banco banco = new Banco();
        ContaCorrente cc = new ContaCorrente("1001");
        ContaEspecial ce = new ContaEspecial("1002");
        ContaPoupanca cp = new ContaPoupanca("1003");
        ContaEmpresarial ceEmp = new ContaEmpresarial("2001");
        banco.adicionarConta(cc);
        banco.adicionarConta(ce);
        banco.adicionarConta(cp);
        banco.adicionarConta(ceEmp);
        banco.listarContas();
    }
}
