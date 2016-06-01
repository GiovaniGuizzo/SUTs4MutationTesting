package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.lang.reflect.Field;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;
import junit.framework.TestCase;

public class TestCubrirTodos extends TestCase {

    Tablero tablero;
    Jugador a, b;

    protected void setUp() throws Exception {
        Dados.debug = true;
        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        this.tablero.add(a);
        this.tablero.add(b);

    }

    protected void tearDown() {
        Dados.debug = false;
    }

    public void testToStringJugador() {

        Tablero t = new Tablero();
        t.addTarjetasPorDefecto();

        Jugador j = new Jugador("Pepe");
        try {
            t.add(j);
        } catch (DemasiadosJugadoresException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PartidaYaEmpezadaException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        j.addPosesion((CasillaConPrecio) t.getCasilla(1));
        j.addPosesion((CasillaConPrecio) t.getCasilla(3));
        j.addTarjeta((Tarjeta) t.getTarjetas(ICtes.Suerte).get(0), ICtes.Suerte);
        j.addTarjeta((Tarjeta) t.getTarjetas(ICtes.Suerte).get(1), ICtes.Suerte);
        j.addTarjeta((Tarjeta) t.getTarjetas(ICtes.CajaDeComunidad).get(0), ICtes.CajaDeComunidad);
        j.addTarjeta((Tarjeta) t.getTarjetas(ICtes.CajaDeComunidad).get(1), ICtes.CajaDeComunidad);
        String res = j.toString();
    }

    public void testPierdeJugador() {

        try {

            Jugador c = new Jugador("c");
            tablero.add(c);

            tablero.setJugadorConElTurno(0);
            b.decrementarCapital(1500);
            c.decrementarCapital(1500);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            tablero.setJugadorConElTurno(2);
            c.setDados(1, 0);

            Jugador[] js = tablero.getJugadores();
            for (Jugador j : js) {
                assertTrue(j == a || j == null);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDeudaImporteNegativo2() {
        try {
            Deuda d = new Deuda(a, -568464963);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testMoverJugadorNoIncidencias() {

        try {

            Jugador c = new Jugador("c");
            tablero.add(c);
            tablero.addTarjetasPorDefecto();
            tablero.setJugadorConElTurno(0);
            a.setDados(2, 0);

            assertTrue(tablero.getJugadorConElTurno() == 1);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testHipotecarParaPArking() {

        try {

            Jugador c = new Jugador("c");
            tablero.add(c);
            tablero.addTarjetasPorDefecto();
            a.addPosesion((Calle) tablero.getCasilla(1));
            a.decrementarCapital(1500);
            tablero.setJugadorConElTurno(0);

            a.setDados(2, 0);

            assertTrue(tablero.getJugadorConElTurno() == 0);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testTirarDadosException() {

        try {

            tablero.setJugadorConElTurno(0);

            tablero.comenzarPartida();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testCP6Jugadores() {

        try {
            Jugador c = new Jugador("c");
            tablero.add(c);
            Jugador d = new Jugador("d");
            tablero.add(d);
            Jugador e = new Jugador("e");
            tablero.add(e);
            Jugador f = new Jugador("f");
            tablero.add(f);

            tablero.comenzarPartida();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testComprarCarcel() {

        try {

            Jugador c = new Jugador("c");
            tablero.add(c);
            tablero.addTarjetasPorDefecto();
            tablero.setJugadorConElTurno(0);
            a.setDados(5, 5);
            a.comprar();
            fail();

        } catch (NoTieneOpcionDeCompraException ex) {

        } catch (Exception e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testQuitar2CasasTeniendo4() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            double capitalPreA = a.getCapital();

            a.edificar(1, 4);

            assertTrue(a.getCapital() < capitalPreA);

            capitalPreA = a.getCapital();
            a.devolverEdificaciones(1, 2);
            assertTrue(a.getCapital() > capitalPreA);

            assertTrue(((Calle) tablero.getCasilla(1)).getNumeroDeCasas() == 2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testQuitar2CasasTeniendo4Neg() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            double capitalPreA = a.getCapital();

            a.edificar(1, 4);

            assertTrue(a.getCapital() < capitalPreA);

            capitalPreA = a.getCapital();
            a.devolverEdificaciones(1, -2);
            assertTrue(a.getCapital() < capitalPreA);

            assertTrue(((Calle) tablero.getCasilla(1)).getNumeroDeCasas() == 6);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGanaJugador() {

        try {

            Jugador c = new Jugador("c");
            tablero.add(c);

            tablero.setJugadorConElTurno(0);
            b.decrementarCapital(1500);
            c.decrementarCapital(1500);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);

            Field f = Tablero.class.getDeclaredField("ganador");
            f.setAccessible(true);
            Jugador ganador = (Jugador) f.get(tablero);
            assertTrue(ganador == null);

            /*tablero.setJugadorConElTurno(2);
			c.setDados(1, 0);
			
			Field f = Tablero.class.getDeclaredField("ganador");
			f.setAccessible(true);
			Jugador ganador = (Jugador)f.get(tablero);
			assertTrue(ganador == a);*/
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }
}
