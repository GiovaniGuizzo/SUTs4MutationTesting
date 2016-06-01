package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;

public class TestPartida3 extends TestCase {

    Tablero tablero;
    Jugador a, b;

    protected void setUp() throws Exception {
        Dados.debug = true;
        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        this.tablero.add(a);
        this.tablero.add(b);
        this.tablero.addTarjetasPorDefecto();

    }

    protected void tearDown() {
        Dados.debug = false;
    }

    public void testPruebaDeDeudaConParking() {
        try {
            this.tablero.setJugadorConElTurno(0);
            double capitalAPre = a.getCapital();
            a.setDados(1, 1);
            assertTrue(a.getCapital() == capitalAPre - 20);
            capitalAPre = a.getCapital();
            a.setDados(7, 8);
            assertTrue(a.getCapital() == capitalAPre + 50);
            this.tablero.setJugadorConElTurno(0);
            capitalAPre = a.getCapital();
            a.setDados(8, 8);
            assertTrue(a.getCapital() == capitalAPre - 100);
            capitalAPre = a.getCapital();
            a.setDados(5, 4);
            assertTrue(a.getCapital() == capitalAPre + 200);
            this.tablero.setJugadorConElTurno(0);
            capitalAPre = a.getCapital();
            a.setDados(7, 8);
            assertTrue(a.getCapital() == capitalAPre + 150);
            this.tablero.setJugadorConElTurno(0);
            capitalAPre = a.getCapital();
            a.setDados(8, 8);
            assertTrue(a.getCapital() == capitalAPre - 250);
            this.tablero.setJugadorConElTurno(0);
            capitalAPre = a.getCapital();
            a.setDados(5, 4);
            assertTrue(a.getCapital() == capitalAPre + 200 - 20);
        } catch (Exception e) {
            fail(e.toString());
        }
    }
}
