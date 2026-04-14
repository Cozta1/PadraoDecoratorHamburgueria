package main.java.hamburguerBasico;

import main.java.hamburguerBasico.carne.Carne;
import main.java.hamburguerBasico.pao.Pao;

public interface FabricaAbstrata {
    Pao criarPao();
    Carne criarCarne();
}
