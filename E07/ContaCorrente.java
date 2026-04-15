public class ContaCorrente extends Conta {
    public ContaCorrente(String numero) { super(numero); }
    @Override
    public String toString() { return "ContaCorrente: " + getNumero(); }
}
