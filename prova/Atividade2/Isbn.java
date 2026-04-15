package Atividade2;

public class Isbn {
    public int d1 = 1;
    public int d2 = 1;
    public int d3 = 1;
    public int d4 = 1;
    public int d5 = 1;
    public int d6 = 1;
    public int d7 = 1;
    public int d8 = 1;
    public int d9 = 1;
    public int d10 = 1;
    public double resultado = (d1 * 10 + d2 * 9 + d3 * 8 + d4 * 7 + d5 * 6 + d6 * 5 + d7 * 4 + d8 * 3 + d9 * 2 + d10 * 1);
public static void main(String[] args) {
    System.out.println(resultado);
    if(resultado = 0){
        System.out.println("Codigo valido");
    }else{
        System.out.println("Codigo invalido");
    }
}
}
    
