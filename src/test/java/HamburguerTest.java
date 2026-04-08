package test.java;

import main.java.*;
import main.java.complementos.Bacon;
import main.java.complementos.Molho;
import main.java.complementos.Queijo;
import main.java.complementos.Salada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarValorHamburguerBasico() {
        Hamburguer hamburguer = new HamburguerBasico(10.0f);

        assertEquals(10.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(10.0f));

        assertEquals(15.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerBasico(10.0f));

        assertEquals(12.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComSalada() {
        Hamburguer hamburguer = new Salada(new HamburguerBasico(10.0f));

        assertEquals(13.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComMolho() {
        Hamburguer hamburguer = new Molho(new HamburguerBasico(10.0f));

        assertEquals(12.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisQueijo() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerBasico(10.0f)));

        assertEquals(17.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisSalada() {
        Hamburguer hamburguer = new Bacon(new Salada(new HamburguerBasico(10.0f)));

        assertEquals(18.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Molho(new HamburguerBasico(10.0f)));

        assertEquals(17.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComQueijMaisSalada() {
        Hamburguer hamburguer = new Queijo(new Salada(new HamburguerBasico(10.0f)));

        assertEquals(16.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComQueijMaisMolho() {
        Hamburguer hamburguer = new Queijo(new Molho(new HamburguerBasico(10.0f)));

        assertEquals(14.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComSaladaMaisMolho() {
        Hamburguer hamburguer = new Salada(new Molho(new HamburguerBasico(10.0f)));

        assertEquals(15.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisQueijMaisSalada() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new HamburguerBasico(10.0f))));

        assertEquals(21.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisQueijMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Molho(new HamburguerBasico(10.0f))));

        assertEquals(19.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComBaconMaisSaladaMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Salada(new Molho(new HamburguerBasico(10.0f))));

        assertEquals(20.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComQueijMaisSaladaMaisMolho() {
        Hamburguer hamburguer = new Queijo(new Salada(new Molho(new HamburguerBasico(10.0f))));

        assertEquals(18.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(10.0f)))));

        assertEquals(23.0f, hamburguer.getValor());
    }


    @Test
    void deveRetornarNomeHamburguerBasico() {
        Hamburguer hamburguer = new HamburguerBasico();

        assertEquals("Hamburguer Basico", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico());

        assertEquals("Hamburguer Basico + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerBasico());

        assertEquals("Hamburguer Basico + Queijo extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComSalada() {
        Hamburguer hamburguer = new Salada(new HamburguerBasico());

        assertEquals("Hamburguer Basico + Salada extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComMolho() {
        Hamburguer hamburguer = new Molho(new HamburguerBasico());

        assertEquals("Hamburguer Basico + Molho extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisQueijo() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Queijo extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisSalada() {
        Hamburguer hamburguer = new Bacon(new Salada(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Salada extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Molho(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Molho extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComQueijMaisSalada() {
        Hamburguer hamburguer = new Queijo(new Salada(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Salada extra + Queijo extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComQueijMaisMolho() {
        Hamburguer hamburguer = new Queijo(new Molho(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Molho extra + Queijo extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComSaladaMaisMolho() {
        Hamburguer hamburguer = new Salada(new Molho(new HamburguerBasico()));

        assertEquals("Hamburguer Basico + Molho extra + Salada extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisQueijMaisSalada() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new HamburguerBasico())));

        assertEquals("Hamburguer Basico + Salada extra + Queijo extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisQueijMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Molho(new HamburguerBasico())));

        assertEquals("Hamburguer Basico + Molho extra + Queijo extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComBaconMaisSaladaMaisMolho() {
        Hamburguer hamburguer = new Bacon(new Salada(new Molho(new HamburguerBasico())));

        assertEquals("Hamburguer Basico + Molho extra + Salada extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComQueijMaisSaladaMaisMolho() {
        Hamburguer hamburguer = new Queijo(new Salada(new Molho(new HamburguerBasico())));

        assertEquals("Hamburguer Basico + Molho extra + Salada extra + Queijo extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico()))));

        assertEquals("Hamburguer Basico + Molho extra + Salada extra + Queijo extra + Bacon extra", hamburguer.getNome());
    }
}
