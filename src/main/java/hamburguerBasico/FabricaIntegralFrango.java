package main.java.hamburguerBasico;

import main.java.hamburguerBasico.carne.Carne;
import main.java.hamburguerBasico.carne.CarneFrango;
import main.java.hamburguerBasico.carne.CarneFrango;
import main.java.hamburguerBasico.pao.Pao;
import main.java.hamburguerBasico.pao.PaoIntegral;

public class FabricaIntegralFrango implements FabricaAbstrata {

    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Carne criarCarne() {
        return new CarneFrango();
    }
}
