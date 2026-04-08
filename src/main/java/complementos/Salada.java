package main.java.complementos;

import main.java.Hamburguer;
import main.java.HamburguerDecorator;

public class Salada extends HamburguerDecorator {
    public Salada(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 3.5f;
    }

    public String getNomeExtra(){
        return "Salada extra";
    }
}
