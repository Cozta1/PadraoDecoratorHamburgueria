package main.java.hamburguerBasico;

import main.java.hamburguerBasico.carne.Carne;
import main.java.hamburguerBasico.carne.CarneBoi;
import main.java.hamburguerBasico.pao.Pao;
import main.java.hamburguerBasico.pao.PaoComum;

public class FabricaComumBoi implements FabricaAbstrata {

    @Override
    public Pao criarPao() {
        return new PaoComum();
    }

    @Override
    public Carne criarCarne() {
        return new CarneBoi();
    }
}
