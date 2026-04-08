package main.java.complementos;

import main.java.Hamburguer;
import main.java.HamburguerDecorator;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 2.5f;
    }

    public String getNomeExtra(){
        return "Queijo extra";
    }
}
