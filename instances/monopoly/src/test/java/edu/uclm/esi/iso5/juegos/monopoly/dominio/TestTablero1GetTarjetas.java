package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;

public class TestTablero1GetTarjetas extends TestCase {

    public TestTablero1GetTarjetas() {
        super();
    }

    @Override
    protected void setUp() {
        Dados.debug = true;
    }

    @Override
    protected void tearDown() {
        Dados.debug = false;
    }

    public void test1TS_2_1() {
        edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero obtained = null;
        {
            obtained = new edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero();
        }
        {
            obtained.addTarjetasPorDefecto();
        }

        int arg2 = (int) -3;
        {
            obtained.getTarjetas(arg2);
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

        int arg2 = (int) -2;
        {
            obtained.getTarjetas(arg2);
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

        int arg2 = (int) -1;
        {
            obtained.getTarjetas(arg2);
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

        int arg2 = (int) 0;
        {
            obtained.getTarjetas(arg2);
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

        int arg2 = (int) 1;
        {
            obtained.getTarjetas(arg2);
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

        int arg2 = (int) 2;
        {
            obtained.getTarjetas(arg2);
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
        int arg2 = (int) 3;
        {
            obtained.getTarjetas(arg2);
        }
    }

}
