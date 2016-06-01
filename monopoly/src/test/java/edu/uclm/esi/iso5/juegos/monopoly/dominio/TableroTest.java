package edu.uclm.esi.iso5.juegos.monopoly.dominio;


import junit.framework.TestCase;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;

public class TableroTest extends TestCase {

    protected void setUp() {
        Dados.debug = true;
    }

    protected void tearDown() {
        Dados.debug = false;
    }

    /**
     * Comprobamos con n�meor de jugadores incremental veces que, al crear un
     * tablero y a�adirle un n� aleatorio de jugadores: 1) Cada jugador se queda
     * en la casilla 0. 2) Dicha casilla es la de salida. 3) La casilla contiene
     * al jugador. 4) Tras comenzar la partida, el jugador con el turno es el
     * que saca m�s en los dados.
     */
    public void testComenzarPartida() {
        for (int i = 2; i < 7; i++) {
            Tablero t = new Tablero();
            int nj = i;
            Jugador[] jj = new Jugador[nj];
            for (int j = 0; j < nj; j++) {
                jj[j] = new Jugador("" + (char) (j + 65));
                try {
                    t.add(jj[j]);
                } catch (DemasiadosJugadoresException e) {
                    fail("No se esperaba ninguna excepci�n");
                } catch (PartidaYaEmpezadaException e) {
                    fail("");
                }
            }
            for (int j = 0; j < nj; j++) {
                assertSame(jj[j].getCasilla(), t.getCasilla(0));
                assertTrue(jj[j].getCasilla() instanceof Salida);
                assertTrue(t.getCasilla(0).contains(jj[j]));
            }
            try {
                t.comenzarPartida();
            } catch (Exception e) {
                fail("Excepci�n inesperada");

            }
            int max = -1;
            int tiradaMax = Integer.MIN_VALUE;
            for (int j = 0; j < nj; j++) {
                if (jj[j].getSumaDados() > tiradaMax) {
                    max = j;
                    tiradaMax = jj[j].getSumaDados();
                }
            }
            assertTrue(t.getJugadorConElTurno() == max);
        }
    }

    /**
     * Comprobamos con n�meor de jugadores bajo, al crear un tablero y a�adirle
     * un n� aleatorio de jugadores: 1) Cada jugador se queda en la casilla 0.
     * 2) Dicha casilla es la de salida. 3) La casilla contiene al jugador. 4)
     * Tras comenzar la partida, el jugador con el turno es el que saca m�s en
     * los dados.
     */
    public void testComenzarPartidaMuchosJugadores() {

        Tablero t = new Tablero();
        int nj = 7;
        Jugador[] jj = new Jugador[nj];
        for (int j = 0; j < nj; j++) {
            jj[j] = new Jugador("" + (char) (j + 65));
            try {
                t.add(jj[j]);
                if (j == 6) {
                    fail("Excepcion esperada");
                }
            } catch (DemasiadosJugadoresException e) {
                if (j != 6) {
                    fail("Excepci�n inesperada");
                }
            } catch (PartidaYaEmpezadaException e) {
                fail("Tipo de excepci�n no esperado");
            }
        }
    }

    /**
     * Comprobamos con n�meor de jugadores bajo, al crear un tablero y a�adirle
     * un n� aleatorio de jugadores: 1) Cada jugador se queda en la casilla 0.
     * 2) Dicha casilla es la de salida. 3) La casilla contiene al jugador. 4)
     * Tras comenzar la partida, el jugador con el turno es el que saca m�s en
     * los dados.
     */
    public void testComenzarPartidaPocosJugadores() {
        for (int i = 0; i < 2; i++) {
            Tablero t = new Tablero();
            int nj = i;
            Jugador[] jj = new Jugador[nj];
            for (int j = 0; j < nj; j++) {
                jj[j] = new Jugador("" + (char) (j + 65));
                try {
                    t.add(jj[j]);
                } catch (DemasiadosJugadoresException e) {
                    fail("No se esperaba ninguna excepci�n");
                } catch (PartidaYaEmpezadaException e) {
                    fail("");
                }
            }
            for (int j = 0; j < nj; j++) {
                assertSame(jj[j].getCasilla(), t.getCasilla(0));
                assertTrue(jj[j].getCasilla() instanceof Salida);
                assertTrue(t.getCasilla(0).contains(jj[j]));
            }
            try {
                t.comenzarPartida();
                fail("Excepci�n esperada");
            } catch (Exception e) {
                assertTrue(e instanceof PocosJugadoresException);

            }
        }
    }

    public void testEjercicio3() {
        try {
            Tablero t = new Tablero();
            t.addTarjetasPorDefecto();
            Jugador a = new Jugador("a");
            Jugador b = new Jugador("b");
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);

            double capitalA = a.getCapital();	// Capital de "a" antes de tirar los dados
            a.setDados(1, 1);
            assertTrue(a.getCapital() == capitalA - 20);

            assertFalse(t.getJugadorConElTurno() == 1);
            assertTrue(t.getJugadorConElTurno() == 0);
            capitalA = a.getCapital();		// Vuelvo a leer el capital del jugador
            a.setDados(3, 1);
            a.comprar();
            assertTrue(a.getCapital() == capitalA - 100);
        } catch (Exception e) {
            fail("No esperaba ninguna excepci�n");
        }
    }

    public void testPartida1() {
        try {
            Tablero t = new Tablero();
            Jugador a = new Jugador("a");
            Jugador b = new Jugador("b");
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
            double capitalPre = a.getCapital();
            a.setDados(3, 1);
            //a.avanzar();
            Impuesto lujo = (Impuesto) a.getCasilla();
            assertTrue(a.getCapital() == capitalPre - lujo.getImporte());
            assertTrue(t.getCasilla(4).contains(a));
            assertTrue(t.getJugadorConElTurno() == 1);

            try {
                a.setDados(2, 2);
                fail("Se esperaba una NoTieneElTurnoException");
            } catch (NoTieneElTurnoException e) {
            }
            b.setDados(3, 3);
            //b.avanzar();
            capitalPre = b.getCapital();
            b.comprar();
            Calle casilla6 = (Calle) t.getCasilla(6);
            assertTrue(b.getPosesiones().contains(t.getCasilla(6)));
            assertTrue(b.getCapital() == capitalPre - casilla6.getPrecio());
            b.setDados(1, 1);
            //b.avanzar();
            capitalPre = b.getCapital();
            b.comprar();
            Calle casilla8 = (Calle) t.getCasilla(8);
            assertTrue(b.getPosesiones().contains(t.getCasilla(8)));
            assertTrue(b.getCapital() == capitalPre - casilla8.getPrecio());
            b.setDados(6, 6);
            //b.avanzar();
            assertTrue(t.getCasilla(10).contains(b));
            assertTrue(b.getTurnosSinJugar() == 3);
            double capitalAPre = a.getCapital();
            double capitalBPre = b.getCapital();
            a.setDados(1, 1);
            //a.avanzar();
            assertTrue(a.getCapital() == capitalAPre - casilla6.getTasaPorCaer());
            assertTrue(b.getCapital() == capitalBPre + casilla6.getTasaPorCaer());
            assertTrue(t.getJugadorConElTurno() == 0);
            a.setDados(3, 1);
            //a.avanzar();
            assertTrue(t.getJugadorConElTurno() == 0);
            assertTrue(t.getCasilla(10).contains(a));
            assertTrue(t.getCasilla(10).contains(b));
            assertTrue(b.getTurnosSinJugar() == 2);
            capitalAPre = a.getCapital();
            Parking parking = (Parking) t.getCasilla(20);
            double capitalEnElParking = parking.getCapital();
            a.setDados(5, 5);
            //a.avanzar();
            assertTrue(a.getCasilla().getPosicion() == 20);
            assertTrue(t.getCasilla(20).contains(a));
            assertTrue(b.getTurnosSinJugar() == 2);
            assertTrue(t.getJugadorConElTurno() == 0);
            assertTrue(a.getCapital() == capitalAPre + capitalEnElParking);
            capitalAPre = a.getCapital();
            a.setDados(3, 2);
            //a.avanzar();
            a.comprar();
            Estacion casilla25 = (Estacion) t.getCasilla(25);
            assertTrue(a.getCapital() == capitalAPre - casilla25.getPrecio());
            assertTrue(a.getPosesiones().contains(casilla25));
            assertTrue(casilla25.getPropietario() == a);
            assertTrue(b.getTurnosSinJugar() == 1);
            assertTrue(t.getJugadorConElTurno() == 0);
            capitalPre = a.getCapital();
            a.setDados(2, 1);
            //a.avanzar();
            a.comprar();
            Compania casilla28 = (Compania) t.getCasilla(28);
            assertTrue(a.getCapital() == capitalPre - casilla28.getPrecio());
            assertTrue(casilla28.getPropietario() == a);
            assertTrue(a.getPosesiones().contains(casilla28));
            assertTrue(b.getTurnosSinJugar() == 0);
            assertTrue(t.getJugadorConElTurno() == 1);
        } catch (Exception e) {
            fail("No se esperaba ninguna excepci�n");
        }

    }

    /**
     * Comprobamos que se pasa bien por la salida cuando la posici�n de destino
     * es mayor que 39.
     */
    public void testPasarPruebaDeSaltoPorLaSalida() {
        try {
            Tablero t = new Tablero();
            Jugador a = new Jugador("a");
            Jugador b = new Jugador("b");
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
            a.setDados(40, 0);
            //a.avanzar();
            assertTrue(t.getCasilla(0).contains(a));
            assertTrue(a.getCasilla().getPosicion() == 0);
            b.setDados(1, 2);
            b.desecharOpcionDeCompra();
            a.setDados(40, 1);
            //a.avanzar();
            assertFalse(t.getCasilla(0).contains(a));
            assertTrue(t.getCasilla(1).contains(a));
            assertTrue(a.getCasilla().getPosicion() == 1);
        } catch (Exception e) {
            fail("No se esperaba ninguna excepci�n");
        }
    }

    public void testPreciosDeCalles() {
        double precioAnterior = 0;
        Tablero t = new Tablero();
        for (int i = 0; i < t.getCasillas().length; i++) {
            Casilla c = t.getCasillas()[i];
            if (c instanceof Calle) {
                Calle calle = (Calle) c;
                assertTrue(calle.getPrecio() >= precioAnterior);
                precioAnterior = calle.getPrecio();
            }
        }
    }

    public void testTablero() {
        Tablero t = new Tablero();
        for (int i = 0; i < t.getCasillas().length; i++) {
            Casilla c = t.getCasilla(i);
            assertTrue(t.getCasilla(i).getPosicion() == i);
            assertTrue(c != null);
            assertSame(c.getTablero(), t);
        }
        assertTrue(t.getCasillas().length == 40);
    }

    /**
     * Comprobamos: 1) Que al construir el tablero hay 40 casillas no nulas. 2)
     * Que el precio de las calles es no decreciente.
     */
    public void testTableroNegativo() {
        Tablero t = new Tablero();
        for (int i = -1; -i < t.getCasillas().length; i--) {
            Casilla c = null;
            try {
                c = t.getCasilla(i);
                fail();
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            assertTrue(c == null);
        }
        assertTrue(t.getCasillas().length == 40);
    }

}
