public class ContaEspecial extends Conta {
    public ContaEspecial(String numero) { super(numero); }
    @Override
    public String toString() { return "ContaEspecial: " + getNumero(); }
}
