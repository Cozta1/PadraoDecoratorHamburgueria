package main.java.hamburguerBasico;

import main.java.Hamburguer;
import main.java.hamburguerBasico.carne.Carne;
import main.java.hamburguerBasico.pao.Pao;

public class HamburguerBasico implements Hamburguer {

    private float valorHamburguer;
    private Pao pao;
    private Carne carne;

    public HamburguerBasico() {}

    public HamburguerBasico(float valorHamburguer) {
        this.valorHamburguer = valorHamburguer;
    }

    public HamburguerBasico(FabricaAbstrata fabrica) {
        this.pao = fabrica.criarPao();
        this.carne = fabrica.criarCarne();
    }

    public float getValor() {
        return this.pao.getValorPao() + this.carne.getValorCarne();
    }

    public String getNome() {
        return "Hamburguer Basico de " + this.carne.getNomeCarne() + " no " + this.pao.getNomePao();
    }
}
