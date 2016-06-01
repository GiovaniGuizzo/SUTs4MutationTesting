package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import junit.framework.TestCase;

public class TestEjerciciosMuchasTarjetas extends TestCase {
	Tablero t;
	Jugador a;
	Jugador b;

	public void setUp() {
		Dados.debug = true;
		t=new Tablero();
		t.addTarjetasPorDefecto();
		a=new Jugador("a");
		b=new Jugador("b");
		try {
			t.add(a);
			t.add(b);
			t.setJugadorConElTurno(0);	
		} catch (Exception e) {
			fail(e.toString());
		}
	
	}
	
	protected void tearDown(){
		Dados.debug = false;
	}
	
	public void testAddTarjeta() {
		try {
			a.addTarjeta(new Pagar("",1), ICtes.Suerte);
			assertTrue(!a.tieneTarjetaDeSalirDeLaCarcel());
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio10() {
		try {
			a.addTarjeta(new Pagar("",1), ICtes.Suerte);
			a.addTarjeta(new Pagar("",1), ICtes.Suerte);
			a.addTarjeta(new Pagar("",1), ICtes.Suerte);
			assertTrue(!a.tieneTarjetaDeSalirDeLaCarcel());
			a.addTarjeta(new Pagar("",1), ICtes.CajaDeComunidad);
			a.addTarjeta(new Pagar("",1), ICtes.CajaDeComunidad);
			a.addTarjeta(new Pagar("",1), ICtes.CajaDeComunidad);
			assertTrue(!a.tieneTarjetaDeSalirDeLaCarcel());
			a.setDados(2, 0);
			b.setDados(2, 1);
			b.desecharOpcionDeCompra();
			a.setDados(8, 7);
			b.setDados(3, 1);
			a.setDados(8, 8);
			a.setDados(5, 4);
			assertTrue(a.tieneTarjetaDeSalirDeLaCarcel());
			b.setDados(2, 1);
			a.setDados(14, 14);
			assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());
			assertTrue(a.getCasilla().getPosicion()==30);
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
}
