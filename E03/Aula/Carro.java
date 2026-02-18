package Aula;
public class Carro {
    String cor;
    String modelo;
    String marca;
    String ano;
    String potencia;
    int roda;
    char motor;
    boolean ligado = false;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    
}