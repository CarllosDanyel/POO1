public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1001");
        ContaEspecial ce = new ContaEspecial("1002");
        ContaPoupanca cp = new ContaPoupanca("1003");
        ContaEmpresarial ceEmp = new ContaEmpresarial("2001");
        System.out.println(cc);
        System.out.println(ce);
        System.out.println(cp);
        System.out.println(ceEmp);
    }
}
