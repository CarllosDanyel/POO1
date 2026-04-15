public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Java Basico");
        Autor a = new Autor("Autor X");
        UsuarioComum u = new UsuarioComum("Ana");
        Emprestimo e = new Emprestimo(l, u);
        System.out.println(l);
        System.out.println(a);
        System.out.println(e);
    }
}
