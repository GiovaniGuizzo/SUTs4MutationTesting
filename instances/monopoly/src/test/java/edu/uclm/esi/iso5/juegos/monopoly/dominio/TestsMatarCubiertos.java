package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.awt.Color;
import java.lang.reflect.Method;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.BarrioConHipotecaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DebeSaldarLaDeudaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaEnLaCarcelException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaHipotecadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.YaEstaHipotecadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Cobrar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.TVayaALaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;
import junit.framework.TestCase;

public class TestsMatarCubiertos extends TestCase {

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

    public void testDTSDLC() {
        try {

            tablero.setJugadorConElTurno(0);
            a.addTarjeta(new Pagar("", 100), 1);
            a.addTarjeta(new Pagar("", 100), 1);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel() == false);

            a.addTarjeta(new Pagar("", 100), 2);
            a.addTarjeta(new Pagar("", 100), 2);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 2);
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel() == false);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception inexpected");
        }
    }

    public void testDTSDLCsinTarjeta() {
        try {

            tablero.setJugadorConElTurno(0);
            a.addTarjeta(new Pagar("", 100), 1);
            a.addTarjeta(new Pagar("", 100), 1);
            a.addTarjeta(new Pagar("", 100), 1);
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel() == false);
            assertTrue(tablero.getTarjetas(1).size() == 0);

            a.addTarjeta(new Pagar("", 100), 2);
            a.addTarjeta(new Pagar("", 100), 2);
            a.addTarjeta(new Pagar("", 100), 2);
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel() == false);
            assertTrue(tablero.getTarjetas(2).size() == 0);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception inexpected");
        }
    }

    public void testLevantarHipotecaDeCasillaConPrecioNegativo() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            double capitalPreA = a.getCapital();
            double capitalPreB = b.getCapital();

            CasillaConPrecio ccp = (CasillaConPrecio) tablero.getCasilla(3);
            Calle c = new Calle("miCalle", -16000, new Barrio(new Color(1, 1, 1)), 0, 5, 10, 15, 20, 25, 30, 35);
            a.addPosesion(c);
            a.hipoteca(c);
            //assertTrue(a.getCapital()==capitalPreA+ccp.getPrecio()/2);
            a.levantarHipoteca(c);
            //assertTrue(a.getCapital()==capitalPreA+ccp.getPrecio()/2 - 1.10*ccp.getPrecio()/2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testAddToParkingNegativo() {
        try {
            tablero.addToParking(-2000);
            assertTrue(((Parking) tablero.getCasilla(20)).getCapital() == -2000);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testTarjetasImporteNegativo() {
        try {
            Cobrar c = new Cobrar("cobrarNegativo", -100);
            double ca = a.getCapital();
            c.operaciones(a, 1);
            assertTrue(ca == a.getCapital() + 100);

            Pagar p = new Pagar("pagarNegativo", -100);
            tablero.add(p, 1);
            ca = a.getCapital();
            p.operaciones(a, 1);
            assertTrue(ca == a.getCapital() - 100);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testCasillaIrAlaCarcel() {
        try {
            tablero.setJugadorConElTurno(0);
            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);
            a.setDados(20, 10);
            b.setDados(30, 0);
            assertTrue(tablero.getCasilla(30).contains(a));
            assertTrue(tablero.getCasilla(10).contains(b));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDeudaImporteNegativo() {
        try {
            Deuda d = new Deuda(a, -1000);
            //a.pagarDeuda();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPopTarjeta() {
        try {
            tablero.addTarjetasPorDefecto();
            Tarjeta t;

            Class[] args1 = new Class[1];
            args1[0] = Integer.TYPE;
            Method m = tablero.getClass().getDeclaredMethod("popTarjeta", args1);
            m.setAccessible(true);
            t = (Tarjeta) m.invoke(tablero, 1);
            assertTrue(t != null);
            t = (Tarjeta) m.invoke(tablero, 2);
            assertTrue(t != null);
            t = (Tarjeta) m.invoke(tablero, 0);
            assertTrue(t == null);
            t = (Tarjeta) m.invoke(tablero, -1);
            assertTrue(t == null);
            t = (Tarjeta) m.invoke(tablero, -2);
            assertTrue(t == null);
            t = (Tarjeta) m.invoke(tablero, 3);
            assertTrue(t == null);
            t = (Tarjeta) m.invoke(tablero, -3);
            assertTrue(t == null);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testCojerTarjeta() {
        try {
            tablero.addTarjetasPorDefecto();
            int nTarjetasSuerte = tablero.getTarjetas(1).size();
            int nTarjetasCaja = tablero.getTarjetas(2).size();
            Class[] args1 = new Class[1];
            args1[0] = Integer.TYPE;
            Method m = tablero.getClass().getDeclaredMethod("cogerTarjeta", args1);
            m.setAccessible(true);
            m.invoke(tablero, 1);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            m.invoke(tablero, 2);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);
            m.invoke(tablero, 0);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);
            m.invoke(tablero, -1);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);
            m.invoke(tablero, -2);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);
            m.invoke(tablero, 3);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);
            m.invoke(tablero, -3);
            assertTrue(tablero.getTarjetas(1).size() + 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() + 1 == nTarjetasCaja);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDevolverTarjeta() {
        try {
            tablero.addTarjetasPorDefecto();
            Tarjeta t = new QuedaLibreDeLaCarcel();
            int nTarjetasSuerte = tablero.getTarjetas(1).size();
            int nTarjetasCaja = tablero.getTarjetas(2).size();
            Class[] args1 = new Class[2];
            args1[0] = Tarjeta.class;
            args1[1] = Integer.TYPE;
            Method m = tablero.getClass().getDeclaredMethod("devolverTarjeta", args1);
            m.setAccessible(true);
            m.invoke(tablero, t, 1);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            m.invoke(tablero, t, 2);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);
            m.invoke(tablero, t, 0);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);
            m.invoke(tablero, t, -1);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);
            m.invoke(tablero, t, -2);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);
            m.invoke(tablero, t, 3);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);
            m.invoke(tablero, t, -3);
            assertTrue(tablero.getTarjetas(1).size() - 1 == nTarjetasSuerte);
            assertTrue(tablero.getTarjetas(2).size() - 1 == nTarjetasCaja);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPierdeJugador() {
        try {
            //Jugador c = new Jugador("c");
            //tablero.add(c);
            a.decrementarCapital(1500);
            //c.decrementarCapital(1500);

            tablero.setJugadorConElTurno(1);
            b.setDados(1, 0);
            b.comprar();
            a.setDados(1, 0);
            int cont = 0;
            for (Jugador j : tablero.getJugadores()) {
                if (j != null) {
                    cont++;
                }
            }
            assertTrue(cont == 1);

            /*c.setDados(1, 0);
			cont = 0;
			for(Jugador j: tablero.getJugadores()){
				if(j!= null){
					cont++;
				}
			}
			assertTrue(cont == 1);
             */
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPierdeJugador3Jugadores() {
        try {
            Jugador c = new Jugador("c");
            tablero.add(c);
            a.decrementarCapital(1500);
            c.decrementarCapital(1500);

            tablero.setJugadorConElTurno(1);
            b.setDados(1, 0);
            b.comprar();
            c.setDados(1, 0);
            int cont = 0;
            for (Jugador j : tablero.getJugadores()) {
                if (j != null) {
                    cont++;
                }
            }
            assertTrue(cont == 2);

            /*c.setDados(1, 0);
			cont = 0;
			for(Jugador j: tablero.getJugadores()){
				if(j!= null){
					cont++;
				}
			}
			assertTrue(cont == 1);
             */
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarNumeroNegativo() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            double capitalPreA = a.getCapital();

            a.edificar(1, -3);

            assertTrue(a.getCapital() > capitalPreA);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testQuitarCasaNumeroNegativo() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            double capitalPreA = a.getCapital();

            a.edificar(1, 3);

            assertTrue(a.getCapital() < capitalPreA);

            capitalPreA = a.getCapital();
            a.devolverEdificaciones(1, -2);
            assertTrue(a.getCapital() < capitalPreA);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testBarrioNumeroCasasNegativo() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            double capitalPreA = a.getCapital();

            a.edificar(1, -3);

            assertTrue(a.getCapital() > capitalPreA);

            capitalPreA = a.getCapital();
            try {
                a.hipoteca((CasillaConPrecio) tablero.getCasilla(1));
                fail("Exception expected");
            } catch (EstaEdificadaException e) {
                assertTrue(a.getCapital() == capitalPreA);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarConCalleHipotecada() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            a.hipoteca((CasillaConPrecio) tablero.getCasilla(1));

            double capitalPreA = a.getCapital();
            try {
                a.edificar(1, 3);
                fail("Exception expected");
            } catch (BarrioConHipotecaException e) {
                assertTrue(a.getCapital() == capitalPreA);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testTarjetaVayaALaCarcel() {
        try {
            tablero.add(new TVayaALaCarcel(), 1);
            tablero.add(new TVayaALaCarcel(), 1);

            tablero.add(new TVayaALaCarcel(), 2);
            tablero.add(new TVayaALaCarcel(), 2);

            a.addTarjeta(new QuedaLibreDeLaCarcel(), 1);

            tablero.setJugadorConElTurno(0);
            a.setDados(2, 0);
            b.setDados(2, 0);

            Carcel c = ((Carcel) tablero.getCasilla(10));
            assertFalse(c.contains(a));
            assertTrue(c.contains(b));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGetTasasNegativas() {
        try {

            tablero.getCasillas()[5] = new Estacion("Estaci� FF.CC.", -200.0, 5);
            b.decrementarCapital(1600);
            b.addPosesion(new Calle("miCalle", 1000, new Barrio(new Color(1, 1, 1)), 0, 10, 10, 20, 30, 40, 50, 60));
            tablero.setJugadorConElTurno(0);

            double ca = a.getCapital();
            double cb = b.getCapital();
            //posee una estaci�n
            a.setDados(0, 5);
            a.comprar();
            b.setDados(0, 5);
            assertTrue(a.getPosesiones().size() == 1);
            assertTrue(b.tieneDeudaCon(a));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGetTasasNegativasPierde() {
        try {

            tablero.getCasillas()[5] = new Estacion("Estaci� FF.CC.", -200.0, 5);
            b.decrementarCapital(3000);
            //b.addPosesion(new Calle("miCalle",10,new Barrio(new Color(1,1,1)),0,10,10,20,30,40,50,60));
            tablero.setJugadorConElTurno(0);

            double ca = a.getCapital();
            double cb = b.getCapital();
            //posee una estaci�n
            a.setDados(0, 5);
            a.comprar();
            b.setDados(0, 5);
            assertTrue(a.getPosesiones().size() == 1);
            int cont = 0;
            for (Jugador j : tablero.getJugadores()) {
                if (j != null) {
                    cont++;
                }
            }
            assertTrue(cont == 1);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testOperacionesQuedaLibre() {
        try {

            a.addTarjeta(new Cobrar("hola", 100), 1);
            a.addTarjeta(new Cobrar("adios", 200), 1);
            a.addTarjeta(new Cobrar("jeje", 50), 2);
            a.addTarjeta(new Cobrar("jaja", 60), 2);

            QuedaLibreDeLaCarcel qlc = new QuedaLibreDeLaCarcel();
            qlc.operaciones(a, 1);
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel());
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());

            qlc.operaciones(a, 2);
            assertTrue(a.tieneTarjetaDeSalirDeLaCarcel());
            a.devolverTarjetaDeSalirDeLaCarcel();
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());

            qlc.operaciones(a, 3);
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());

            qlc.operaciones(a, -1);
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());
            qlc.operaciones(a, -2);
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());
            qlc.operaciones(a, -3);
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());
            qlc.operaciones(a, 0);
            assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testSuspenderTurnosNegativo() {
        try {

            tablero.addTarjetasPorDefecto();
            tablero.setJugadorConElTurno(0);

            Class[] args1 = new Class[1];
            args1[0] = Integer.TYPE;
            Method m = b.getClass().getDeclaredMethod("suspenderTurnos", args1);
            m.setAccessible(true);
            m.invoke(b, -1);
            a.setDados(1, 0);
            a.comprar();
            assertTrue(tablero.getJugadorConElTurno() == 1);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testTarjetaPagarMismoCapital() {
        try {

            Pagar p = new Pagar("mismoImporte", 1500);
            p.operaciones(a, 1);
            //assertTrue(a.getCapital()==0);
            assertTrue(a.getCapital() == 1500);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testTarjetaPagarMenorCapital() {
        try {

            Pagar p = new Pagar("mismoImporte", 1520);
            int result = p.operaciones(a, 1);
            //assertTrue(result==14);
            assertTrue(a.getCapital() == 1500);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPuedeHipotecarCapitalNegativo() {
        try {

            a.addPosesion((CasillaConPrecio) tablero.getCasilla(1));
            a.decrementarCapital(3000);
            boolean r = a.puedeHipotecarHasta(100);
            assertFalse(r);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPuedeHipotecarCantidadNegativa() {
        try {

            a.addPosesion((CasillaConPrecio) tablero.getCasilla(1));
            boolean r = a.puedeHipotecarHasta(-3000);
            assertTrue(r);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testSetDeudaConBancaNegativa() {
        try {

            a.setDeudaConBanca(-100);
            assertTrue(a.getDeudaConBanca() == -100);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarPosCasillaNegativo() {
        try {

            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            double capitalPreA = a.getCapital();
            double capitalPreB = b.getCapital();

            try {
                a.edificar(-1, 3);
                fail("Expected Exception");
            } catch (Exception e) {
                assertTrue(e instanceof ArrayIndexOutOfBoundsException);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarNCasasNegativo() {
        try {

            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            double capitalPreA = a.getCapital();

            a.edificar(1, -6);
            assertTrue(capitalPreA < a.getCapital());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarNCasasNegativoPocoCapital() {
        try {

            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            a.decrementarCapital(1499);
            double capitalPreA = a.getCapital();

            a.edificar(1, -6);
            assertTrue(capitalPreA < a.getCapital());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDevolverEdificacionPosCasillaNegativo() {
        try {

            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            double capitalPreA = a.getCapital();
            double capitalPreB = b.getCapital();
            a.edificar(1, 3);
            try {
                a.devolverEdificaciones(-1, 3);
                fail("Expected Exception");
            } catch (Exception e) {
                assertTrue(e instanceof ArrayIndexOutOfBoundsException);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testDevolverEdificacionNCasasNegativo() {
        try {

            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            a.edificar(1, 3);
            double capitalPreA = a.getCapital();
            a.devolverEdificaciones(1, -4);
            assertTrue(capitalPreA > a.getCapital());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPuedeHipotecarJusto() {
        try {

            a.addPosesion((CasillaConPrecio) tablero.getCasilla(1));
            boolean r = a.puedeHipotecarHasta(1531);
            assertFalse(r);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testHipotecarCalleHipotecada() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();

            a.hipoteca((CasillaConPrecio) tablero.getCasilla(1));

            try {
                a.hipoteca((CasillaConPrecio) tablero.getCasilla(1));
                fail("Execption Expected");
            } catch (Exception e) {
                assertTrue(e instanceof YaEstaHipotecadaException);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPagarDeuda() {
        try {
            tablero.setJugadorConElTurno(0);
            b.decrementarCapital(1500);
            b.addPosesion((CasillaConPrecio) tablero.getCasilla(3));
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);

            assertTrue(b.tieneDeudaCon(a));
            b.incrementarCapital(2);
            b.pagarDeuda();
            assertTrue(b.getCapital() == 0);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPagarDeudaConBanca() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(3, 0);
            b.setDeudaConBanca(1500);
            b.saldarDeudaConBanca();
            assertTrue(b.getCapital() == 0);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPagarPorSalirDELaCarcelSinEstar() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(11, 0);
            try {
                a.pagaPorSalirDeLaCarcel();
                fail("Expected Exception");
            } catch (Exception e) {
                assertTrue(e instanceof NoEstaEnLaCarcelException);
            }
            a.comprar();

            b.setDados(3, 0);
            try {
                b.pagaPorSalirDeLaCarcel();
                fail("Expected Exception");
            } catch (Exception e) {
                assertTrue(e instanceof NoEstaEnLaCarcelException);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testPagarPorSalirDELaCarcelPocoCapital() {
        try {
            tablero.setJugadorConElTurno(0);
            a.decrementarCapital(1450);
            a.setDados(10, 0);
            a.pagaPorSalirDeLaCarcel();
            assertTrue(a.getCapital() == 0);

            b.decrementarCapital(1460);
            b.setDados(10, 0);
            b.pagaPorSalirDeLaCarcel();
            assertTrue(b.getCapital() == 40);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testEdificarCapitalJusto() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(6, 0);
            b.comprar();
            a.setDados(1, 1);
            a.comprar();

            a.decrementarCapital(1330);
            a.edificar(1, 1);
            assertTrue(a.getCapital() == 0);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testLevantarHipotecaDeCasillaNoHipotecada() {
        try {
            tablero.setJugadorConElTurno(0);
            a.setDados(1, 0);
            a.comprar();
            b.setDados(1, 0);
            a.setDados(1, 1);
            a.comprar();
            CasillaConPrecio ccp = (CasillaConPrecio) tablero.getCasilla(1);
            //assertTrue(a.getCapital()==capitalPreA+ccp.getPrecio()/2);
            try {
                a.levantarHipoteca(ccp);
                fail("Expected Exception");
            } catch (Exception e) {
                assertTrue(e instanceof NoEstaHipotecadaException);
            }
            //assertTrue(a.getCapital()==capitalPreA+ccp.getPrecio()/2 - 1.10*ccp.getPrecio()/2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testLevantarHipotecaSinCapital() {
        try {

            tablero.addTarjetasPorDefecto();
            tablero.setJugadorConElTurno(0);

            a.setDados(1, 0);
            a.comprar();
            b.setDados(2, 0);
            a.setDados(1, 1);
            a.comprar();
            CasillaConPrecio ccp = (CasillaConPrecio) tablero.getCasilla(1);
            a.hipoteca(ccp);
            a.decrementarCapital(1410 - (1.1 * 60 / 2));
            //assertTrue(a.getCapital()==capitalPreA+ccp.getPrecio()/2);
            a.levantarHipoteca(ccp);
            assertTrue(a.getCapital() == 0);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGetTasasCompania() {
        try {

            tablero.getCasillas()[5] = new Estacion("Estaci� FF.CC.", -200.0, 5);
            b.decrementarCapital(1500);
            b.addPosesion((CasillaConPrecio) tablero.getCasilla(6));
            //b.addPosesion(new Calle("miCalle",10,new Barrio(new Color(1,1,1)),0,10,10,20,30,40,50,60));
            tablero.setJugadorConElTurno(0);

            double ca = a.getCapital();
            double cb = b.getCapital();
            //posee una estaci�n
            a.setDados(0, 12);
            a.comprar();
            b.setDados(0, 12);

            assertTrue(b.tieneDeudaCon(a));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testGetTasasCalle() {
        try {

            tablero.getCasillas()[5] = new Estacion("Estaci� FF.CC.", -200.0, 5);
            b.decrementarCapital(1500);
            b.addPosesion((CasillaConPrecio) tablero.getCasilla(6));
            //b.addPosesion(new Calle("miCalle",10,new Barrio(new Color(1,1,1)),0,10,10,20,30,40,50,60));
            tablero.setJugadorConElTurno(0);

            double ca = a.getCapital();
            double cb = b.getCapital();
            //posee una estaci�n
            a.setDados(0, 1);
            a.comprar();
            b.setDados(0, 1);

            assertTrue(b.tieneDeudaCon(a));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testComprarCasilla() {
        try {

            tablero.addTarjetasPorDefecto();
            tablero.setJugadorConElTurno(0);

            a.setDados(0, 2);
            try {
                Method m = a.getClass().getDeclaredMethod("darOpcionDeCompra");
                m.setAccessible(true);
                m.invoke(a);
                a.comprar();
            } catch (Exception e) {
                assertTrue(e instanceof CasillaNoVendibleException);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("Exception no esperada");
        }

    }

    public void testSetDAdosConDEudaDeBanca() {

        tablero.addTarjetasPorDefecto();
        try {
            tablero.setJugadorConElTurno(0);
        } catch (PocosJugadoresException e) {
            fail();
        }

        try {
            a.setDeudaConBanca(10);
            a.setDados(0, 2);
            fail();
        } catch (NoTieneElTurnoException e1) {
            fail();
        } catch (DebeSaldarLaDeudaException e1) {

        }
    }

    public void testAddJugadorConPArtidaEmpezada() {

        try {
            tablero.setJugadorConElTurno(0);
        } catch (PocosJugadoresException e) {
            fail();
        }

        try {
            tablero.add(new Jugador("Pedro"));
            fail();
        } catch (DemasiadosJugadoresException e) {
            fail();
        } catch (PartidaYaEmpezadaException e) {
            assertTrue(tablero.getJugadores()[3] == null);
        }

    }

    public void testCalle() {

        try {
            tablero.setJugadorConElTurno(0);

            tablero.getJugadores()[0].addPosesion((CasillaConPrecio) tablero.getCasilla(1));
            tablero.getJugadores()[0].addPosesion((CasillaConPrecio) tablero.getCasilla(3));
            tablero.getJugadores()[0].setDados(0, 1);
            tablero.getJugadores()[0].edificar(1, 1);
            double tasa1 = ((Calle) tablero.getCasilla(1)).getTasaPorCaer();
            tablero.getJugadores()[0].edificar(1, 1);
            double tasa2 = ((Calle) tablero.getCasilla(1)).getTasaPorCaer();
            tablero.getJugadores()[0].edificar(1, 1);
            double tasa3 = ((Calle) tablero.getCasilla(1)).getTasaPorCaer();
            tablero.getJugadores()[0].edificar(1, 1);
            double tasa4 = ((Calle) tablero.getCasilla(1)).getTasaPorCaer();
            tablero.getJugadores()[0].edificar(1, 1);
            double tasa5 = ((Calle) tablero.getCasilla(1)).getTasaPorCaer();

            assertTrue(tasa1 < tasa2);
            assertTrue(tasa2 < tasa3);
            assertTrue(tasa3 < tasa4);
            assertTrue(tasa4 < tasa5);

        } catch (Exception e) {
            fail();
        }

    }

    public void testComprarJusto() {

        try {
            tablero.setJugadorConElTurno(0);

            tablero.getJugadores()[0].decrementarCapital(1440);
            tablero.getJugadores()[0].setDados(0, 1);
            tablero.getJugadores()[0].comprar();

            assertTrue(tablero.getJugadores()[0].getCapital() == 0);
            assertTrue(tablero.getJugadores()[0].getPosesiones().size() == 1);

        } catch (Exception e) {
            fail();
        }

    }

    public void testPagarAJusto() {

        try {
            tablero.setJugadorConElTurno(0);

            tablero.getJugadores()[1].decrementarCapital(1498);
            tablero.getJugadores()[0].setDados(0, 1);
            tablero.getJugadores()[0].comprar();
            tablero.getJugadores()[1].setDados(0, 1);

            assertTrue(tablero.getJugadores()[1].getCapital() == 0);
            assertTrue(tablero.getJugadores()[0].getPosesiones().size() == 1);
            assertTrue(tablero.getJugadores()[0].getCapital() == 1442);
        } catch (Exception e) {
            fail();
        }

    }
}
