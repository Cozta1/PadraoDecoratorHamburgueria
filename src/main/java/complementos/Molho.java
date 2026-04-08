package main.java.complementos;

import main.java.Hamburguer;
import main.java.HamburguerDecorator;

public class Molho extends HamburguerDecorator {
    public Molho(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 2.0f;
    }

    public String getNomeExtra(){
        return "Molho extra";
    }
}
