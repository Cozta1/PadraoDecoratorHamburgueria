package main.java;

public class HamburguerBasico implements Hamburguer{

    public float valorHamburguer;

    public HamburguerBasico(){
    }

    public HamburguerBasico(float valorHamburguer){
        this.valorHamburguer = valorHamburguer;
    }

    public float getValor() {
        return valorHamburguer;
    }

    public String getNome() {
        return "Hamburguer Basico";
    }
}
