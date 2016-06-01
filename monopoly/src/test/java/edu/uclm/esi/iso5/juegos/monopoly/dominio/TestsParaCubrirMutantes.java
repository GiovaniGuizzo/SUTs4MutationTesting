package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.HayMenosCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsEdificableException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;

public class TestsParaCubrirMutantes extends TestCase {

    Jugador a, b;
    Tablero tablero;

    protected void asignarBanda1AJugadorA() {
        try {
            this.tablero.setJugadorConElTurno(0);
        } catch (PocosJugadoresException e) {
            fail("");
        } // Turno para a
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(1));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(3));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(5));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(6));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(8));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(9));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(15));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(25));
        a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(35));
        assertTrue(this.tablero.getCasilla(1).getPropietario() == a && a.getPosesiones().contains(this.tablero.getCasilla(1)));
    }

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

    public void testComprarCasillaNoComprable() {
        try {
            tablero.setJugadorConElTurno(0);
            tablero.addTarjetasPorDefecto();
            a.setDados(1, 1);

            try {
                java.lang.reflect.Method m = a.getClass().getDeclaredMethod("darOpcionDeCompra");
                m.setAccessible(true);
                m.invoke(a);
            } catch (Exception e) {
                fail("Exception no expected");
            }

            try {
                a.comprar();
            } catch (CasillaNoVendibleException e) {
                assertTrue(a.getPosesiones().size() == 0);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDevolverEdficacionExceptions() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            a.edificar(1, 5);
            double capitalPreA = a.getCapital();
            double capitalPreB = b.getCapital();

            //No edificable
            try {
                a.devolverEdificaciones(0, 4);
                fail("Exception expected");
            } catch (NoEsEdificableException e) {
                assertTrue(a.getCapital() == capitalPreA);
            } catch (Exception e) {
                fail("Exception incorrecta");
            }

            //No propietario
            try {
                b.devolverEdificaciones(1, 4);
                fail("Exception expected");
            } catch (NoEsElPropietarioException e) {
                assertTrue(a.getCapital() == capitalPreA);
                assertTrue(b.getCapital() == capitalPreB);
            } catch (Exception e) {
                fail("Exception incorrecta");
            }

            //Menos casas
            try {
                a.devolverEdificaciones(1, 7);
                fail("Exception expected");
            } catch (HayMenosCasasException e) {
                assertTrue(a.getCapital() == capitalPreA);
            } catch (Exception e) {
                fail("Exception incorrecta");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGetTasasConMuchasEstaciones() {
        try {

            tablero.setJugadorConElTurno(0);
            double ca = a.getCapital();
            double cb = b.getCapital();
            //posee una estaci�n
            a.setDados(0, 5);
            a.comprar();
            b.setDados(0, 5);
            assertTrue(a.getPosesiones().size() == 1);
            assertTrue(a.getCapital() == ca - 200 + 200 / 8);
            assertTrue(b.getCapital() == cb - 200 / 8);

            //posee dos estaciones
            ca = a.getCapital();
            cb = b.getCapital();
            a.setDados(4, 6);
            a.comprar();
            b.setDados(4, 6);
            assertTrue(a.getPosesiones().size() == 2);
            assertTrue(a.getCapital() == ca - 200 + 200 / 4);
            assertTrue(b.getCapital() == cb - 200 / 4);

            //posee tres estaciones
            ca = a.getCapital();
            cb = b.getCapital();
            a.setDados(4, 6);
            a.comprar();
            b.setDados(4, 6);
            assertTrue(a.getPosesiones().size() == 3);
            assertTrue(a.getCapital() == ca - 200 + 200 / 2);
            assertTrue(b.getCapital() == cb - 200 / 2);

            //posee cuatro estaciones
            ca = a.getCapital();
            cb = b.getCapital();
            a.setDados(4, 6);
            a.comprar();
            b.setDados(4, 6);
            assertTrue(a.getPosesiones().size() == 4);
            assertTrue(a.getCapital() == ca);
            assertTrue(b.getCapital() == cb - 200);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testLevantarHipoteca() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            //a.edificar(1, 5);
            double capitalPreA = a.getCapital();
            double capitalPreB = b.getCapital();

            CasillaConPrecio ccp = (CasillaConPrecio) tablero.getCasilla(3);
            a.hipoteca(ccp);
            assertTrue(a.getCapital() == capitalPreA + ccp.getPrecio() / 2);
            a.levantarHipoteca(ccp);
            assertTrue(a.getCapital() == capitalPreA + ccp.getPrecio() / 2 - 1.10 * ccp.getPrecio() / 2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testSaltarExceptionCapitalInsuficiente() {
        try {
            tablero.setJugadorConElTurno(1);
            b.decrementarCapital(1500);
            Compania com = new Compania("Mi Compa�ia", 0, 5);
            a.addPosesion((CasillaConPrecio) this.tablero.getCasilla(12));
            b.setDados(6, 6);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            fail("Exception no esperada");
            e.printStackTrace();
        }

    }

    public void testTieneDeuda() {
        try {
            tablero.setJugadorConElTurno(0);
            b.decrementarCapital(1500);
            b.addPosesion((CasillaConPrecio) tablero.getCasilla(3));
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);

            assertTrue(b.tieneDeudaCon(a));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

//    public void testTirarDados() {
//        try {
//
//            tablero.setJugadorConElTurno(0);
//
//            java.lang.reflect.Method m = a.getClass().getDeclaredMethod("tirarDados");
//            m.setAccessible(true);
//            m.invoke(a);
//
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            assertTrue(e.getCause() instanceof NoTieneElTurnoException);
//
//        }
//    }

    public void testTirarDadosConException() {
        try {

            tablero.setJugadorConElTurno(0);

            java.lang.reflect.Method m = a.getClass().getDeclaredMethod("tirarDados");
            m.setAccessible(true);
            m.invoke(b);

        } catch (Exception e) {
            // TODO Auto-generated catch block

            assertTrue(e.getCause() instanceof NoTieneElTurnoException);

        }
    }

    public void testToStringJugadorConMuchasTarjetas() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 2);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 2);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 2);
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel());
            String s = a.toString();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

}
