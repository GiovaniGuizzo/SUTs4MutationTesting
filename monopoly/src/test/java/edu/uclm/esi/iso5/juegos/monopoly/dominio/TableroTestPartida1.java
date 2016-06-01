package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import junit.framework.TestCase;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DebeSaldarLaDeudaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;

public class TableroTestPartida1 extends TestCase {
	Tablero tablero;
	Jugador a, b;

	protected void setUp() throws Exception {
		Dados.debug = true;
		
		this.tablero=new Tablero();
		this.a=new Jugador("a");
		this.b=new Jugador("b");
		this.tablero.add(a);
		this.tablero.add(b);
		
	}
	
	protected void tearDown(){
		Dados.debug = false;
	}
	
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
		assertTrue(this.tablero.getCasilla(1).getPropietario()==a && a.getPosesiones().contains(this.tablero.getCasilla(1)));
	}

	public void test1() {
		try {
			this.tablero.setJugadorConElTurno(0);
		} catch (PocosJugadoresException e1) {
			fail("");
		}
		asignarBanda1AJugadorA();
		this.tablero.add(new QuedaLibreDeLaCarcel(), ICtes.Suerte);
		this.tablero.add(new Pagar("Pague una gran multa", 2000), ICtes.CajaDeComunidad);
		this.tablero.add(new Pagar("Pague al m�dico", 100), ICtes.CajaDeComunidad);
		Calle casilla1=(Calle) this.tablero.getCasilla(1);
		try {
			a.edificar(1, 5);
			assertTrue(casilla1.getNumeroDeCasas()==5);
		} catch (Exception e) {
			fail("No esperaba excepci�n: " + e);
		}
		try {
			this.tablero.setJugadorConElTurno(1);
		} catch (PocosJugadoresException e1) {
			fail("");
		}
		try {
			b.setDados(1, 0);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		assertTrue(this.tablero.getTarjetas(ICtes.Suerte).size()==1);
		try {
			a.setDados(11, 11);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();
		assertTrue(a.tieneTarjetaDeSalirDeLaCarcel());
		assertTrue(this.tablero.getTarjetas(ICtes.Suerte).size()==0);
		try {
			b.setDados(1, 0);
			fail("Se esperaba NoTieneElTurnoException");
		} catch (NoTieneElTurnoException e) {			
		} catch (DebeSaldarLaDeudaException e) {
			fail("Se esperaba NoTieneElTurnoException");
		}
		try {
			a.setDados(4, 4);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();
		assertFalse(a.tieneTarjetaDeSalirDeLaCarcel());
		assertTrue(this.tablero.getTarjetas(ICtes.Suerte).size()==1);
		try {
			a.setDados(6, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();	// a est� en 37
		try {
			a.comprar();
		} catch (Exception e) {
			fail("Se ha producido Exception al comprar: " + e.toString());
		}
		try {
			b.setDados(1, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//b.avanzar();
		try {
			b.setDados(1, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//b.avanzar();
		try {
			b.setDados(1, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//b.avanzar();
		assertTrue(this.tablero.getCasilla(10).contains(b));
		assertTrue(b.getTurnosSinJugar()==3);
		try {
			a.setDados(1, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();	// a en 39
		assertTrue(b.getTurnosSinJugar()==3);
		try {
			a.comprar();
		} catch (Exception e) {
			fail("Se ha producido Exception al comprar: " + e.toString());
		}
		try {
			b.edificar(39, 1);
			fail("Esperaba NoEsElPropietarioException");
		} catch (NoEsElPropietarioException e) {
		} catch (Exception e) {
			fail("Esperaba NoEsElPropietarioException");
		}
		try {
			a.edificar(39, 2);
			a.edificar(37, 0);
		} catch (Exception e) {
			fail("Se ha lanzado " + e.toString());
		}
		double capitalPre = a.getCapital();
		try {
			a.setDados(1, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();	// a en 1
		assertTrue(a.getCasilla().getPosicion()==1);
		assertTrue(a.getCapital()==capitalPre+200);
		try {
			a.setDados(3, 3);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();	// a hacia 7, pero va a la c�rcel
		assertTrue(this.tablero.getCasilla(10).contains(a));
		assertTrue(a.getTurnosSinJugar()==1);
		assertTrue(b.getTurnosSinJugar()==0);
	}
	
	public void test2() {
		// a en la 10
		// b est� en la casilla 10 (c�rcel)
		this.test1();
		double capitalPreB = b.getCapital();
		try {
			b.setDados(6, 1);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//b.avanzar();
		assertTrue(b.getCapital()==capitalPreB-100);
		double capitalPreA = a.getCapital();
		double dineroEnParking=((Parking) this.tablero.getCasilla(20)).getCapital();
		try {
			a.setDados(6, 4);
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		assertTrue(a.getCapital()==capitalPreA+dineroEnParking);
	}
	
	public void test3() {
		// a en la 20 (P�rking)
		// b est� en la casilla 17 (Caja de comunidad)
		this.test2();
		this.asignarBarrioAmarilloAJugadorB();
		double capitalPreB = b.getCapital();
		try {
			b.setDados(4, 4);	// b en 25 (Estaci�n)
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		assertTrue(b.getCapital()==capitalPreB-200);
		capitalPreB = b.getCapital();
		try {
			b.setDados(5, 5);	// b en 35 (Estaci�n)
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		assertTrue(b.getCapital()==capitalPreB-200);
		capitalPreB = b.getCapital();
		try {
			b.setDados(3, 1);	// b en 39  (Passeig de Gracia, con 2 casas)
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		try {
			b.hipoteca((CasillaConPrecio) b.getPosesiones().get(0));
			b.pagarDeuda();
		} catch (Exception e) {
			fail(e.toString());
		}
		try {
			a.setDados(1, 0);	// a en 21 
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		try {
			a.edificar(3, 5);
			a.comprar();
		} catch (Exception e) {
			fail(e.toString());
		}
		try {
			b.setDados(1, 1);	// b en 1 
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(31));
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(32));
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(34));
		try {
			b.setDados(1, 1);	// b en 3 
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		try {
			b.setDados(1, 2);
		} catch (NoTieneElTurnoException e2) {
			fail("Se esperaba NoTieneElTurnoException");
		} catch (DebeSaldarLaDeudaException e2) {
		}
		try {
			b.pagarDeuda();
			fail("Se esperaba CapitalInsuficienteException");
		} catch (CapitalInsuficienteException e1) {
		}
		try {
			b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(31));
			b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(32));
			b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(34));
			b.pagarDeuda();
		} catch (Exception e) {
			fail("No se esperaba ninguna excepci�n");
		}
		try {
			b.setDados(2, 0);	// b en 5 
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		try {
			b.comprar();
			fail("Esperaba excepci�n");
		} catch (Exception e) {
		}
		try {
			b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(27));
			b.hipoteca((CasillaConPrecio) this.tablero.getCasilla(29));
		} catch (Exception e) {
			fail("No se esperaba excepci�n");
		}
		assertTrue(this.tablero.getJugadorConElTurno()==1);
		try {
			b.pagarDeuda();
		} catch (CapitalInsuficienteException e) {
			fail(e.toString());
		}
		assertTrue(this.tablero.getJugadorConElTurno()==0);
	}
	
	public void test4() {
		this.test3();
		double capitalPre=a.getCapital();
		try {
			a.setDados(3, 3);	// a en 27 
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		//a.avanzar();
		assertTrue(a.getCapital()==capitalPre-((Calle) this.tablero.getCasilla(27)).getTasaPorCaer());
		try {
			a.comprar();
			fail("Esperaba excepcion");
		} catch (Exception e) {
		}
		try {
			a.setDados(3, 3);	// a en 33 (Caja de Comunidad)
		} catch (Exception e) {
			fail("Se ha producido " + e.toString());
		}
		capitalPre=a.getCapital();
		try {
			CasillaConPrecio c5=(CasillaConPrecio) this.tablero.getCasilla(5);
			CasillaConPrecio c15=(CasillaConPrecio) this.tablero.getCasilla(15);
			CasillaConPrecio c25=(CasillaConPrecio) this.tablero.getCasilla(25);
			CasillaConPrecio c35=(CasillaConPrecio) this.tablero.getCasilla(35);
			a.hipoteca(c5);
			a.hipoteca(c15);
			assertTrue(a.getCapital()==capitalPre+c5.getPrecio()/2+c15.getPrecio()/2);
			try {
				a.saldarDeudaConBanca();
			}
			catch (CapitalInsuficienteException e) {
			}
			a.hipoteca(c25);
			a.hipoteca(c35);
			assertTrue(this.tablero.getJugadorConElTurno()==0);
			capitalPre=a.getCapital();
			double deuda=a.getDeudaConBanca();
			Parking parking = (Parking) this.tablero.getCasilla(20);
			double capitalEnParkingPre=parking.getCapital();
			a.saldarDeudaConBanca();
			assertTrue(this.tablero.getJugadorConElTurno()==0);
			assertTrue(parking.getCapital()==capitalEnParkingPre+deuda);
			assertTrue(a.getDeudaConBanca()==0);
			capitalPre=a.getCapital();
			a.setDados(5, 2);	// a en 0 (salida)
			//a.avanzar();
			assertTrue(a.getCapital()==capitalPre+200);
			assertTrue(this.tablero.getJugadorConElTurno()==1);
		} catch (Exception e) {
			fail("Se ha producido " + e);
		}
		Calle casilla26 = (Calle) this.tablero.getCasilla(26);
		try {
			a.hipoteca(casilla26);
			fail("Esperaba NoEsElPropietarioException");
		} catch (NoEsElPropietarioException e) {
		}
		catch (Exception e) {
			fail("Se ha producido " + e);
		}
		try {
			b.edificar(26, 1);
		} catch (CapitalInsuficienteException e) {
		} catch (Exception e) {
			fail(e.toString());
		}
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
	
	protected void asignarBarrioAmarilloAJugadorB() {
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(26));
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(27));
		b.addPosesion((CasillaConPrecio) this.tablero.getCasilla(29));
	}
	
	public void testPruebaDeDeudaConParking() {
		this.asignarBanda1AJugadorA();
		this.tablero.add(new Pagar("Pague una gran multa", 1500), ICtes.CajaDeComunidad);
		try {
			this.tablero.setJugadorConElTurno(0);
			a.setDados(1, 1);
			assertTrue(a.getDeudaConBanca()>0);
			a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(1));
			a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(3));
			a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(6));
			a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(8));
			a.hipoteca((CasillaConPrecio) this.tablero.getCasilla(9));
			a.saldarDeudaConBanca();
			a.setDados(2, 1);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testToStrings(){
		this.asignarBanda1AJugadorA();
		this.test1();
		String s = a.toString();
		String s2 = b.toString();
		String t = tablero.toString();
		assertTrue(t.equals(s+"\n"+s2+"\n"));
		
	}
}
