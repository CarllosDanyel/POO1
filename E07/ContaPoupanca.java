public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero) { super(numero); }
    @Override
    public String toString() { return "ContaPoupanca: " + getNumero(); }
}
