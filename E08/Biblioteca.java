import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacao> acervo = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarPublicacao(Publicacao p) {
        acervo.add(p);
    }

    public List<Publicacao> getAcervo() {
        return acervo;
    }

    // Tenta emprestar uma publicação para um usuário. Retorna o Emprestimo criado ou null se não for possível.
    public Emprestimo emprestar(Usuario usuario, Publicacao publicacao) {
        // Verifica se a publicação já está emprestada
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo() && e.getPublicacao().equals(publicacao)) {
                return null; // já emprestada
            }
        }

        if (!usuario.podePegarEmprestimo(emprestimos)) {
            return null; // usuário não pode pegar outro empréstimo
        }

        Emprestimo novo = new Emprestimo(publicacao, usuario);
        emprestimos.add(novo);
        return novo;
    }

    // Devolve pelo empréstimo e retorna a multa
    public double devolver(Emprestimo emprestimo) {
        if (emprestimo == null) return 0.0;
        double multa = emprestimo.devolver();
        return multa;
    }

    public Emprestimo buscarEmprestimoAtivoPorPublicacao(Publicacao publicacao) {
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo() && e.getPublicacao().equals(publicacao)) return e;
        }
        return null;
    }

    public void listarAcervo() {
        System.out.println("Acervo da biblioteca: " + nome + " - " + endereco);
        for (Publicacao p : acervo) {
            System.out.println(" - " + p);
        }
    }

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca("Biblioteca Central", "Rua da Faculdade, 100");

        Autor autor1 = new Autor("Maria Silva", "Dra.");
        Autor autor2 = new Autor("Carlos Pereira", "Mestre");

        Livro livro = new Livro("Java Avançado", "2020-05-01", 2.0, 3, "Editora X", "978-1-23456-789-7");
        livro.adicionarAutor(autor1);

        Artigo artigo = new Artigo("Padrões de Projeto", "2019-11-10", 1.5, "Um artigo sobre padrões.");
        artigo.adicionarAutor(autor2);

        Tese tese = new Tese("Tese em Computação", "2018-08-20", 3.0, autor1, 200, "Resumo da tese", "2018-08-15", "Universidade Y");

        bib.adicionarPublicacao(livro);
        bib.adicionarPublicacao(artigo);
        bib.adicionarPublicacao(tese);

        bib.listarAcervo();

        UsuarioComum u1 = new UsuarioComum("Ana", "9999-0000", "ana@mail.com", "123.456.789-00");
        UsuarioEspecial u2 = new UsuarioEspecial("Empresa Z", "3333-4444", "contato@empresa.com", "00.000.000/0001-00");

        System.out.println();
        System.out.println("Tentando emprestar 'Java Avançado' para Ana:");
        Emprestimo e1 = bib.emprestar(u1, livro);
        System.out.println(e1 != null ? "Empréstimo criado: " + e1 : "Não foi possível emprestar");

        System.out.println("Tentando emprestar 'Padrões de Projeto' para Ana (deveria falhar - já possui 1):");
        Emprestimo e2 = bib.emprestar(u1, artigo);
        System.out.println(e2 != null ? "Empréstimo criado: " + e2 : "Não foi possível emprestar");

        System.out.println("Emprestando 'Padrões de Projeto' para usuário especial:");
        Emprestimo e3 = bib.emprestar(u2, artigo);
        System.out.println(e3 != null ? "Empréstimo criado: " + e3 : "Não foi possível emprestar");

        System.out.println();
        System.out.println("Renovando empréstimo de Ana 5 vezes:");
        for (int i = 0; i < 5; i++) e1.renovar();
        System.out.println("Renovações: " + e1.getRenovacoes());

        System.out.println("Devolvendo empréstimo de Ana e calculando multa:");
        double multa = bib.devolver(e1);
        System.out.println("Multa calculada: R$ " + String.format("%.2f", multa));
    }
}
