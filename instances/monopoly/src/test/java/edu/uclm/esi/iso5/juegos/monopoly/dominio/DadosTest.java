package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;

public class DadosTest extends TestCase {

    @Override
    protected void setUp() {
        Dados.debug = true;
    }

    @Override
    protected void tearDown() {
        Dados.debug = false;
    }

    public void testTirarDados() {
        for (int i = 0; i < 100; i++) {
            Dados.tirarDados();
            assertTrue(Dados.suma() <= 12);
        }
    }
}
