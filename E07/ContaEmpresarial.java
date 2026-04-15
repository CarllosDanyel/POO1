public class ContaEmpresarial extends Conta {
    public ContaEmpresarial(String numero) { super(numero); }
    @Override
    public String toString() { return "ContaEmpresarial: " + getNumero(); }
}
