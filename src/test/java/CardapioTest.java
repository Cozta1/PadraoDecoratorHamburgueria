package test.java;

import main.java.*;
import main.java.complementos.Bacon;
import main.java.complementos.Molho;
import main.java.complementos.Queijo;
import main.java.complementos.Salada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @BeforeEach
    void limpaCardapio() {
        Cardapio.getInstance().getHamburguers().clear();
    }

    @Test
    void deveRetornarHamburguerBasico() {
        Cardapio.getInstance().novo(new HamburguerBasico(10.0f));
        assertEquals(1, Cardapio.getInstance().getHamburguers().size());
    }

    @Test
    void deveRetornarNomeHamburguer() {
        Cardapio.getInstance().novo(new HamburguerBasico(10.0f));

        assertEquals("Hamburguer Basico", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void deveRetornarVariosHamburguers() {
        Cardapio.getInstance().novo(new HamburguerBasico(10.0f));
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(10.0f)));
        Cardapio.getInstance().novo(new Queijo(new Bacon(new HamburguerBasico(10.0f))));
        Cardapio.getInstance().novo(new Molho(new Queijo(new Bacon(new HamburguerBasico(10.0f)))));
        assertEquals(4, Cardapio.getInstance().getHamburguers().size());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconQueijoMolho() {
        Cardapio.getInstance().novo(new Molho(new Queijo(new Bacon(new HamburguerBasico(10.0f)))));

        assertEquals("Hamburguer Basico + Bacon extra + Queijo extra + Molho extra", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }


    @Test
    void deveRetornarValorHamburguerComBaconNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(10.0f)));

        assertEquals(15.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorHamburguerCompletoNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(10.0f))))));

        assertEquals(23.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorVariosHamburguersNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(10.0f)));
        Cardapio.getInstance().novo(new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(10.0f))))));

        assertEquals(15.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
        assertEquals(23.0f, Cardapio.getInstance().getHamburguers().get(1).getValor());
    }

    @Test
    void deveRetornarNomesVariosHamburguersNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(10.0f)));
        Cardapio.getInstance().novo(new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(10.0f))))));

        assertEquals("Hamburguer Basico + Bacon extra", Cardapio.getInstance().getHamburguers().get(0).getNome());
        assertEquals("Hamburguer Basico + Molho extra + Salada extra + Queijo extra + Bacon extra", Cardapio.getInstance().getHamburguers().get(1).getNome());
    }

}
