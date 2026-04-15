package Atividade3;

public class Biblioteca {
    private String nomeDoAutor;
    private String dataDelançamento;
    private String titulo;
    private double valor;
    private String isbn;
    private boolean status;

    public Biblioteca(String dataDelançamento, String nomeDoAutor, String titulo, double valor, String isbn) {
        this.dataDelançamento = dataDelançamento;
        this.nomeDoAutor = nomeDoAutor;
        this.status = false;
        this.titulo = titulo;
        this.valor = valor;
        this.isbn = isbn;
    }

    public void cadastrar(){
        
    }
    public boolean emprestar(){
        if (status = true){
            return true;
        }else{
            return false;
        }
    }
    public boolean devolver(){
        if (status = false){
            this.status = true;
            return true;
        }else{
            return false;
        }
    }


    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getDataDelançamento() {
        return dataDelançamento;
    }

    public void setDataDelançamento(String dataDelançamento) {
        this.dataDelançamento = dataDelançamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isStatus() {
        return status;
    }

}
