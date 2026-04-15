import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacao> acervo = new ArrayList<>();
    public void adicionarPublicacao(Publicacao p) { acervo.add(p); }
    public List<Publicacao> getAcervo() { return acervo; }
}
