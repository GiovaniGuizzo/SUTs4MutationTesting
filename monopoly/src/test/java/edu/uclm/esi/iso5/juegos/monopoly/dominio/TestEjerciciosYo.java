package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.HayMenosCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoPoseeTodoElBarrioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException;
import junit.framework.TestCase;

public class TestEjerciciosYo extends TestCase {
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
	
	public void test1() {
		try {
			a.setDados(2, 2);
			a.setDados(1, 1);
			a.desecharOpcionDeCompra();
			a.setDados(1, 1);
			assertTrue(a.getCasilla().getPosicion()==10);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio2() {
		try {
			a.setDados(2, 1);
			double capitalPreA=a.getCapital();
			a.comprar();
			assertTrue(a.getCapital()==capitalPreA-60);
			b.setDados(2, 1);
			try {
				b.comprar();
				fail("NoTieneOpcionDeCompraException expected");
			}
			catch (NoTieneOpcionDeCompraException e) { }
			catch (Exception e) { fail("NoTieneOpcionDeCompraException e"); }
			a.setDados(2, 2);
			try { 
				a.comprar();
				fail("CasillaNoVendibleException expected");
			}
			catch (NoTieneOpcionDeCompraException e) {}
			catch (Exception e) { fail("NoTieneOpcionDeCompraException expected"); }
			a.decrementarCapital(a.getCapital());
			a.setDados(3, 1);
			try {
				a.comprar();
				fail("CapitalInsuficienteException expected");
			}
			catch (CapitalInsuficienteException e) {}
			catch (Exception e) { fail("CapitalInsuficienteException expected"); }
		}
		catch (Exception ex) {
			fail(ex.toString());
		}
	}
	
	public void testEjercicio3() {
		try {
			double capitalPreA=a.getCapital();
			a.setDados(1, 0);
			a.comprar();
			assertTrue(a.getCapital()==capitalPreA-60);
			try {
				capitalPreA=a.getCapital();
				a.edificar(1, 1);
				assertTrue(a.getCapital()==capitalPreA-50);
			}
			catch (NoPoseeTodoElBarrioException e) {
			}
			catch (Exception e) {
				fail(e.toString());
			}
			t.setJugadorConElTurno(0);
			a.setDados(2, 0);
			capitalPreA=a.getCapital();
			a.comprar();
			assertTrue(a.getCapital()==capitalPreA-60);
			capitalPreA=a.getCapital();
			a.edificar(1, 4);
			assertTrue(a.getCapital()==capitalPreA-200);
		}
		catch (Exception ex) {
			fail(ex.toString());
		}
	}
	
	public void testEjercicio4() {
		this.testEjercicio3();
		try {
			double capitalPreA=a.getCapital();
			a.devolverEdificaciones(1, 3);
			assertTrue(a.getCapital()==capitalPreA+50*3/2);
		}
		catch (Exception e) {
			fail(e.toString());
		}
		try {
			a.devolverEdificaciones(1, 2);
		} catch (HayMenosCasasException e) {
		} catch (Exception e) {
			fail(e.toString());
		}
		try {
			b.devolverEdificaciones(1, 1);
		}
		catch (NoEsElPropietarioException e) {}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio5() {
		this.testEjercicio4();
		try {
			a.edificar(3, 5);
			double capitalPreA=a.getCapital();
			double capitalPreB=b.getCapital();
			b.setDados(0, 1);
			assertTrue(a.getCapital()==capitalPreA+((CasillaConPrecio) this.t.getCasilla(1)).getTasaPorCaer());
			assertTrue(b.getCapital()==capitalPreB-((CasillaConPrecio) this.t.getCasilla(1)).getTasaPorCaer());
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio6() {
		this.testEjercicio4();
		try {
			double capitalPreA=a.getCapital();
			double capitalPreB=b.getCapital();
			b.setDados(3, 2);
			b.comprar();
			assertTrue(b.getCapital()==capitalPreB-200);
			capitalPreB=b.getCapital();
			a.setDados(1, 1);
			assertTrue(a.getCapital()==capitalPreA-((CasillaConPrecio) this.t.getCasilla(5)).getTasaPorCaer());
			assertTrue(b.getCapital()==capitalPreB+((CasillaConPrecio) this.t.getCasilla(5)).getTasaPorCaer());
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio7() {
		try {
			a.setDados(6, 6);
			a.comprar();
			a.setDados(4, 4);
			a.setDados(3, 2);
			a.comprar();
			double capitalPreA=a.getCapital();
			double capitalPreB=b.getCapital();
			b.setDados(6, 6);
			assertTrue(a.getCapital()==capitalPreA+48);
			assertTrue(b.getCapital()==capitalPreB-48);
			b.setDados(6, 5);
			b.desecharOpcionDeCompra();
			a.setDados(2, 1);
			a.comprar();
			capitalPreA=a.getCapital();
			capitalPreB=b.getCapital();
			b.setDados(3, 2);
			assertTrue(a.getCapital()==capitalPreA+40);
			assertTrue(b.getCapital()==capitalPreB-40);
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio8() {
		try {
			double capitalPreA=a.getCapital();
			a.setDados(1, 1);
			assertTrue(a.getCapital()==capitalPreA-20);
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio9() {
		try {
			a.setDados(6, 6);
			a.desecharOpcionDeCompra();
			a.setDados(6, 6);
			a.desecharOpcionDeCompra();
			a.setDados(6, 5);
			a.desecharOpcionDeCompra();
			b.setDados(2, 1);
			b.desecharOpcionDeCompra();
			double capitalPreA=a.getCapital();
			a.setDados(5, 3);
			assertTrue(a.getCapital()==capitalPreA+200);
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testEjercicio10() {
		try {
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