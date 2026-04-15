public class Conta {
    protected String numero;
    public Conta(String numero) { this.numero = numero; }
    public String getNumero() { return numero; }
    @Override
    public String toString() { return "Conta: " + numero; }
}
