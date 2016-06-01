package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import junit.framework.TestCase;

public class TestTablero1 extends TestCase {

    @Override
    protected void setUp() {
        Dados.debug = true;
    }

    @Override
    protected void tearDown() {
        Dados.debug = false;
    }

    public TestTablero1() {
        super();
    }

    public void test1TS_2_1() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) -3;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test2TS_2_2() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) -2;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test3TS_2_3() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) -1;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test4TS_2_4() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) 0;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test5TS_2_5() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) 1;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test6TS_2_6() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) 2;
        {
            obtained.add(arg1, arg2);
        }
    }

    public void test7TS_2_7() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }
        edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta arg1 = new Pagar("Pague una multa", 250);
        int arg2 = (int) 3;
        {
            obtained.add(arg1, arg2);
        }
    }

}
