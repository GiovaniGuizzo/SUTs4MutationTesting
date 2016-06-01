package edu.uclm.esi.iso5.juegos.monopoly.dominio.grupos;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.CasillaConPrecio;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DebeSaldarLaDeudaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadasCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoPoseeTodoElBarrioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;
import junit.framework.TestCase;

public class GrupoATests extends TestCase {

    protected void setUp() {
        Dados.debug = true;
    }

    protected void tearDown() {
        Dados.debug = false;
    }

    public void test1() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        t.addTarjetasPorDefecto();
        a = new Jugador("a");
        b = new Jugador("b");

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(1, 1);
            a.setDados(1, 1);
            a.setDados(1, 1);
            assertTrue(a.getCasilla().getPosicion() == 10);
        } catch (Exception e) {
            fail();
        }
    }

    public void test2() {
        test2a();
        test2b();
        test2c();
    }

    public void test2a() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        t.addTarjetasPorDefecto();
        a = new Jugador("a");
        b = new Jugador("b");
        CasillaConPrecio c1 = (CasillaConPrecio) t.getCasilla(1);

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            double capitalA = a.getCapital();
            a.comprar();
            assertTrue(a.getCapital() == capitalA - c1.getPrecio());
        } catch (Exception e) {
            fail();
        }
    }

    public void test2b() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        t.addTarjetasPorDefecto();
        a = new Jugador("a");
        b = new Jugador("b");
        CasillaConPrecio c1 = (CasillaConPrecio) t.getCasilla(1);

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            double capitalA = a.getCapital();
            a.comprar();
            assertTrue(a.getCapital() == capitalA - c1.getPrecio());
        } catch (Exception e) {
            fail();
        }
        try {
            b.setDados(0, 1);
            b.comprar();
            fail();
        } catch (NoTieneOpcionDeCompraException e) {
        } catch (Exception e) {
            fail();
        }
        try {
            b.setDados(0, 1);
            b.comprar();
            fail();
        } catch (NoTieneElTurnoException e) {
        } catch (Exception e) {
            fail();
        }
    }

    public void test2c() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        t.addTarjetasPorDefecto();
        a = new Jugador("a");
        b = new Jugador("b");
        CasillaConPrecio c1 = (CasillaConPrecio) t.getCasilla(1);

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            double capitalA = a.getCapital();
            a.comprar();
            assertTrue(a.getCapital() == capitalA - c1.getPrecio());
        } catch (Exception e) {
            fail();
        }
        try {
            b.setDados(0, 1);
            b.comprar();
            fail();
        } catch (NoTieneOpcionDeCompraException e) {
        } catch (Exception e) {
            fail();
        }
        try {
            b.setDados(0, 1);
            b.comprar();
            fail();
        } catch (NoTieneElTurnoException e) {
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            a.comprar();
            fail();
        } catch (NoTieneOpcionDeCompraException e) {
        } catch (Exception e) {
            fail();
        }
        try {
            b.decrementarCapital(1500);
            b.setDados(37, 1);
            b.comprar();
            fail();
        } catch (CapitalInsuficienteException e) {
        } catch (Exception e) {
            fail();
        }
    }

    public void test3() {
        test3a();
        test3b();
    }

    public void test3a() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        a = new Jugador("a");
        b = new Jugador("b");
        t.addTarjetasPorDefecto();

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            a.comprar();
            a.edificar(1, 1);
            fail();
        } catch (NoPoseeTodoElBarrioException e) {
        } catch (Exception e) {
            fail();
        }
    }

    public void test3b() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        a = new Jugador("a");
        b = new Jugador("b");
        t.addTarjetasPorDefecto();

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            a.comprar();
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }

        try {
            a.edificar(1, 1);
            fail();
        } catch (Exception e) {
        }
        try {
            a.edificar(3, 1);
            fail();
        } catch (NoEsElPropietarioException e) {
        } catch (Exception e) {
            fail(e.toString());
        }
        try {
            a.edificar(2, 1);
            fail();
        } catch (Exception e) {
        }
        CasillaConPrecio c3 = (CasillaConPrecio) t.getCasilla(3);

        try {
            a.setDados(1, 1);
            a.comprar();
            a.edificar(1, 1);
            a.hipoteca(c3);
            fail();
        } catch (Exception e) {
        }
        try {
            a.devolverEdificaciones(1, 1);
            a.hipoteca(c3);
        } catch (Exception e) {
            fail();
        }
        try {
            a.edificar(1, 6);
            fail();
        } catch (DemasiadasCasasException e) {
        } catch (Exception e) {
        }
        try {
            a.decrementarCapital(a.getCapital());
            a.edificar(3, 5);
            fail();
        } catch (CapitalInsuficienteException e) {
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    public void test4a() {
        Tablero t = null;
        Jugador a = null;
        Jugador b = null;
        t = new Tablero();
        a = new Jugador("a");
        b = new Jugador("b");
        t.addTarjetasPorDefecto();

        try {
            t.add(a);
            t.add(b);
            t.setJugadorConElTurno(0);
        } catch (Exception e) {
            fail();
        }
        try {
            a.setDados(0, 1);
            a.comprar();
            t.setJugadorConElTurno(0);
            a.setDados(1, 1);
            a.comprar();
            a.edificar(1, 1);
            a.devolverEdificaciones(1, 1);
        } catch (Exception e) {
            fail(e.toString());
        }
        try {
            a.setDados(1, 1);
            a.comprar();
            a.edificar(1, 3);
            a.devolverEdificaciones(1, 1);
        } catch (Exception e) {
            fail(e.toString());
        }
        try {
            t.setJugadorConElTurno(1);
            b.devolverEdificaciones(1, 1);
            fail();
        } catch (NoEsElPropietarioException e) {
        } catch (Exception e) {
            fail(e.toString());
        }
    }
}
