package main.java.complementos;

import main.java.Hamburguer;
import main.java.HamburguerDecorator;

public class Bacon extends HamburguerDecorator {
    public Bacon(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 5.0f;
    }

    public String getNomeExtra(){
        return "Bacon extra";
    }
}
