package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.TVayaALaCarcel;

public class TableroTestPartida2 extends TestCase {

    Tablero tablero;
    Jugador a, b;
    double capitalAPre, capitalBPre;

    protected void setUp() throws Exception {
        Dados.debug = true;

        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        this.tablero.add(a);
        this.tablero.add(b);

        this.tablero.add(new QuedaLibreDeLaCarcel(), ICtes.Suerte);
        this.tablero.add(new TVayaALaCarcel(), ICtes.Suerte);

        this.tablero.add(new Pagar("Pague una gran multa", 2000), ICtes.CajaDeComunidad);
        this.tablero.add(new Pagar("Pague al m�dico", 100), ICtes.CajaDeComunidad);

    }

    protected void tearDown() {
        Dados.debug = false;
    }

    public void test0() {
        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        try {
            this.tablero.add(a);
            this.tablero.add(b);
            this.tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
        } catch (Exception e) {
            fail("");
        }
    }

    public void testDevolverEdificaciones() {
        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        try {
            this.tablero.add(a);
            this.tablero.add(b);
            this.tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            a.edificar(1, 5);
            double capitalPreA = a.getCapital();
            a.devolverEdificaciones(1, 4);
            assertTrue(a.getCapital() == capitalPreA + 100);
        } catch (Exception e) {
            fail("");
        }
    }

    public void testCompania() {
        this.tablero = new Tablero();
        this.a = new Jugador("a");
        this.b = new Jugador("b");
        try {
            this.tablero.add(a);
            this.tablero.add(b);
            this.tablero.setJugadorConElTurno(0);
            double capitalPreA = a.getCapital();
            a.setDados(12, 0);
            a.comprar();
            assertTrue(a.getCapital() == capitalPreA - 150);
            double capitalPreB = b.getCapital();
            b.setDados(12, 0);
            assertTrue(b.getCapital() == capitalPreB - 48);
            a.setDados(1, 0);
            a.desecharOpcionDeCompra();
            a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(28));
            capitalPreB = b.getCapital();
            b.setDados(16, 0);
            assertTrue(b.getCapital() == capitalPreB - 16 * 8);
        } catch (Exception e) {
            fail("");
        }
    }

   /* public void test1() {
        try {
            this.tablero.setJugadorConElTurno(0);
            a.setDados(6, 1);	// a en 7, saca tarjeta y a la c�rcel (10)
            assertTrue(this.tablero.getCasilla(10).contains(a));
            a.pagaPorSalirDeLaCarcel();
            b.setDados(0, 1); // b en 1
            b.comprar();
            a.setDados(1, 1);	// a en 12
            capitalAPre = a.getCapital();
            a.comprar();
            assertTrue(a.getCapital() == capitalAPre - ((CasillaConPrecio) this.tablero.getCasilla(12)).getPrecio());
            a.setDados(1, 1);	// a en 14
            a.comprar();
            try {
                a.edificar(12, 1);
                fail("");
            } catch (NoEsEdificableException e) {
            }
            a.setDados(2, 1); // a en 17
            try {
                a.edificar(14, 1);
                fail("");
            } catch (NoPoseeTodoElBarrioException a) {
            }
            try {
                b.edificar(1, 5);
                fail("");
            } catch (NoPoseeTodoElBarrioException e) {
            }
            b.setDados(1, 1);	// b en 3
            b.comprar();
            try {
                a.edificar(3, 1);
                fail("");
            } catch (NoEsElPropietarioException e) {
            }
            b.edificar(3, 5);
            try {
                b.edificar(3, 1);
                fail("");
            } catch (DemasiadasCasasException e) {
            }
            b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(1));
            try {
                b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(1));
                fail("");
            } catch (YaEstaHipotecadaException e) {
            }
            try {
                a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(1));
                fail("");
            } catch (NoEsElPropietarioException e) {
            }
            capitalBPre = b.getCapital();
            CasillaConPrecio casilla1 = (CasillaConPrecio) this.tablero.getCasilla(1);
            b.levantarHipoteca(casilla1);
            assertFalse(casilla1.estaHipotecada());
            assertTrue(b.getCapital() == capitalBPre - casilla1.getPrecio() / 2 * 1.10);
            b.edificar(1, 5);
            b.setDados(6, 1);
            a.setDados(23, 1);
            System.out.println(a.toString());
            System.out.println(b.toString());
        } catch (PocosJugadoresException | NoTieneElTurnoException | DebeSaldarLaDeudaException | NoEstaEnLaCarcelException | NoTieneOpcionDeCompraException | CasillaNoVendibleException | CapitalInsuficienteException | DemasiadasCasasException | NoEsElPropietarioException | NoPoseeTodoElBarrioException | BarrioConHipotecaException | NoEsEdificableException | YaEstaHipotecadaException | EstaEdificadaException | NoEstaHipotecadaException e) {
            
            fail("No esperaba ninguna excepci�n: " + e.toString());
        }
    }*/
}
