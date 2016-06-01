package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.util.Vector;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Cobrar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;
 
/**
 * Representa el tablero del Monopoly. Tiene un array de 40 casillas, otro de 8 barrios,
 * otro de jugadores, un entero que representa la posici�n del jugador con el turno dentro del
 * vector de jugadores, un campo que representa si la partida ya ha comenzado, un vector con las tarjetas
 * de suerte, otro con las de caja de comunidad y un campo de tipo Jugador que apunta al ganador, cuando
 * �ste ya se ha decidido.
 *
 */
public class Tablero {
	protected Casilla[] casillas;
	protected Barrio[] barrios;
	protected Jugador[] jugadores;
	private int jugadorConElTurno;
	private boolean partidaEmpezada;
	private Vector tarjetasDeSuerte;
	private Vector tarjetasDeCaja;
	private Jugador ganador;
	
	/**
	 * Construye un Tablero de Monopoly (edici�n de Barcelona) con sus 40 casillas
	 * adecuadamente distribuidas y creadas.
	 */
	public Tablero() {
		this.casillas=new Casilla[40];
		this.casillas[0]=new Salida(0);
		this.barrios=new Barrio[8];
		crearBarrioNegro(this.barrios[0]);
		crearBarrioAzulClaro(this.barrios[1]);
		crearBarrioRosa(this.barrios[2]);
		crearBarrioNaranja(this.barrios[3]);
		crearBarrioRojo(this.barrios[4]);
		crearBarrioAmarillo(this.barrios[5]);
		crearBarrioVerde(this.barrios[6]);
		crearBarrioAzulOscuro(this.barrios[7]);
		this.casillas[2]=new CajaDeComunidad(2);
		this.casillas[4]=new Impuesto("Impuesto sobre el capital", 200.0, 4);
		this.casillas[5]=new Estacion("Estaci� FF.CC.", 200.0, 5);
		this.casillas[7]=new Suerte(7);
		this.casillas[10]=new Carcel(10);
		this.casillas[12]=new Compania("Compa��a de Electricidad", 150.0, 12);
		this.casillas[15]=new Estacion("Baixador del Passeig de Gracia", 200.0, 15);
		this.casillas[17]=new CajaDeComunidad(17);
		this.casillas[20]=new Parking(20);
		this.casillas[22]=new Suerte(22);
		this.casillas[25]=new Estacion("Estaci� de Fran�a", 200.0, 25);
		this.casillas[28]=new Compania("Compa��a de Aguas", 150.0, 28);
		this.casillas[30]=new VayaALaCarcel(30);
		this.casillas[33]=new CajaDeComunidad(33);
		this.casillas[35]=new Estacion("Estaci� de Sants", 200.0, 35);
		this.casillas[36]=new Suerte(36);
		this.casillas[38]=new Impuesto("Impuesto de lujo", 100.0, 38);
		for (int i=0; i<40; i++)
			this.casillas[i].setTablero(this);
		this.jugadores=new Jugador[6];
		this.jugadorConElTurno=-1;
		this.partidaEmpezada=false;
		this.tarjetasDeSuerte=new Vector();
		this.tarjetasDeCaja=new Vector();
	}
	
	/**
	 * A�ade al tablero 6 tarjetas de suerte y 6 de caja de comunidad al tablero.
	 */
	public void addTarjetasPorDefecto() {
		this.add(new Pagar("Pague una multa", 250), ICtes.Suerte);
		this.add(new Cobrar("Recibe intereses de su cuenta corriente: 150 euros", 150), ICtes.Suerte);
		this.add(new QuedaLibreDeLaCarcel(), ICtes.Suerte);
		this.add(new Pagar("Pague la factura del m�dido: 100 euros", 100), ICtes.Suerte);
		this.add(new Cobrar("Cobra el segundo premio de belleza: 50 euros", 50), ICtes.Suerte);
		this.add(new Pagar("Multa por embriaguez", 20), ICtes.Suerte);

		this.add(new Pagar("Pague una multa", 250), ICtes.CajaDeComunidad);
		this.add(new Cobrar("Recibe intereses de su cuenta corriente: 150 euros", 150), ICtes.CajaDeComunidad);
		this.add(new QuedaLibreDeLaCarcel(), ICtes.CajaDeComunidad);		
		this.add(new Pagar("Pague la factura del m�dido: 100 euros", 100), ICtes.CajaDeComunidad);
		this.add(new Cobrar("Cobra el primer premio de belleza: 50 euros", 50), ICtes.CajaDeComunidad);
		this.add(new Pagar("Multa por embriaguez", 20), ICtes.CajaDeComunidad);
		
	}
	
	/**
	 * A�ade un jugador al tablero.
	 * @param j	El jugador que se a�ade
	 * @throws DemasiadosJugadoresException	Cuando se pretenden a�adir 7 jugadores o m�s	
	 * @throws PartidaYaEmpezadaException 
	 */
	public void add(Jugador j) throws DemasiadosJugadoresException, PartidaYaEmpezadaException {
		if (this.numeroDeJugadores()==6)
			throw new DemasiadosJugadoresException();
		if (this.partidaEmpezada())
			throw new PartidaYaEmpezadaException();
		int cont=0;
		while (this.jugadores[cont]!=null)
			cont++;
		this.jugadores[cont]=j;
		this.casillas[0].add(j);
		j.setTablero(this);
	}
	
	private int numeroDeJugadores() {
		int cont=0;
		for (int i=0; i<6; i++)
			if (this.jugadores[i]!=null)
				cont++;
		return cont;
	}
	
	/**
	 * Lanza el dado para determinar cu�l es el jugador que comienza la partida
	 * @throws PocosJugadoresException	Cuando hay uno o ning�n jugador en la partida
	 */
	public void comenzarPartida() throws PocosJugadoresException {
		if (this.numeroDeJugadores()<=1)
			throw new PocosJugadoresException();
		while (this.jugadorConElTurno==-1) {
			for (int i=0; i<this.jugadores.length; i++) {
				Jugador j=this.jugadores[i];
				if (j!=null) {
					try {
						j.tirarDados();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			Vector maximosTiradores=new Vector();
			int tiradaMaxima=Integer.MIN_VALUE;
			maximosTiradores.clear();
			for (int i=0; i<this.numeroDeJugadores(); i++) {
				Jugador j=this.jugadores[i];
				if (j.getSumaDados()>tiradaMaxima) {
					maximosTiradores.clear();
					maximosTiradores.add(new Integer(i));
					tiradaMaxima=j.getSumaDados();
				} else if (j.getSumaDados()==tiradaMaxima) {
					maximosTiradores.add(new Integer(i));
				}
			}
			if (maximosTiradores.size()==1)
				this.jugadorConElTurno=((Integer) maximosTiradores.get(0)).intValue();
		}
	}

	private void crearBarrioAzulOscuro(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.BLUE);
		this.casillas[37]=new Calle("Carrer de Balmes", 350.0, barrio, 37, 200.0, 35.0, 175.0, 500.0, 1100.0, 1300.0, 1500.0);
		this.casillas[39]=new Calle("Passeig de Gracia", 400.0, barrio, 39, 200, 50, 200, 600, 1400, 1700, 2000);
	}

	private void crearBarrioVerde(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.GREEN);
		this.casillas[31]=new Calle("Avinguda Portal de l'Angel", 300.0, barrio, 31, 200, 26, 130, 390, 900, 1100, 1275);
		this.casillas[32]=new Calle("Carrer de Pelai", 300.0, barrio, 32, 200, 26, 130, 390, 900, 1100, 1275);
		this.casillas[34]=new Calle("V�a Augusta", 320.0, barrio, 34, 200, 28, 150, 450, 1000, 1200, 1400);
	}

	private void crearBarrioAmarillo(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.YELLOW);
		this.casillas[26]=new Calle("Les Rambles", 260.0, barrio, 26, 150, 22, 110, 330, 800, 975, 1150);
		this.casillas[27]=new Calle("Carrer de Pau Claris", 260.0, barrio, 27, 150, 22, 110, 330, 800, 975, 1150);
		this.casillas[29]=new Calle("Pla�a de Catalunya", 280.0, barrio, 29, 150, 24, 120, 360, 850, 1025, 1200);
	}

	private void crearBarrioRojo(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.RED);
		this.casillas[21]=new Calle("Pla�a D'Urquinaona", 220.0, barrio, 21, 150, 18, 90, 250, 700, 875, 1050);
		this.casillas[23]=new Calle("Carrer de Fontanella", 220.0, barrio, 23, 150, 18, 90, 250, 700, 875, 1050);
		this.casillas[24]=new Calle("Ronda de Sant Pere", 240.0, barrio, 24, 150, 20, 100, 300, 750, 925, 1100);
	}

	private void crearBarrioNaranja(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.ORANGE);
		this.casillas[16]=new Calle("Passeig de Sant Joan", 180.0, barrio, 16, 100, 14, 70, 200, 550, 750, 950);
		this.casillas[18]=new Calle("Carrer de la Diputaci�", 180.0, barrio, 18, 100, 14, 70, 200, 550, 750, 950);
		this.casillas[19]=new Calle("Carrer D'Arag�", 200.0, barrio, 19, 100, 16, 80, 220, 600, 800, 1000);
	}

	private void crearBarrioRosa(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.PINK);
		this.casillas[11]=new Calle("Carrer de Muntaner", 140.0, barrio, 11, 140, 10, 50, 150, 450, 625, 750);
		this.casillas[13]=new Calle("Carrer D'Aribau", 140.0, barrio, 13, 100, 10, 50, 150, 450, 625, 750);
		this.casillas[14]=new Calle("Avinguda Josep Tarradellas", 160.0, barrio, 14, 100, 12, 60, 180, 500, 700, 900);
	}

	private void crearBarrioAzulClaro(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.CYAN);
		this.casillas[6]=new Calle("Carrer de la Marina", 100.0, barrio, 6, 50.0, 6, 30, 90, 270, 400, 550);
		this.casillas[8]=new Calle("Carrer Comte D'Urgell", 100.0, barrio, 8, 50.0, 6, 30, 90, 270, 400, 550);
		this.casillas[9]=new Calle("Carrer del Consell de Cent", 120.0, barrio, 9, 50.0, 8, 40, 100, 300, 450, 600);
	}

	private void crearBarrioNegro(Barrio barrio) {
		barrio=new Barrio(java.awt.Color.BLACK);
		this.casillas[1]=new Calle("Carrer de Roger de Lluria", 60.0, barrio, 1, 50.0, 2, 10, 30, 90, 160, 250);
		this.casillas[3]=new Calle("Carrer del Rosell�", 60.0, barrio, 3, 50.0, 4, 20, 60, 180, 320, 450);
	}

	/**
	 * Devuelve la lista de casillas del tablero
	 * @return	la lista de casillas del tablero
	 */
	public Casilla[] getCasillas() {
		return casillas;
	}

	/**
	 * Devuelve la posici�n del jugador que tiene el turno (entre 0 y 5, seg�n haya de 1 a 6 jugadores)
	 * @return	la posici�n del jugador
	 */
	public int getJugadorConElTurno() {
		return jugadorConElTurno;
	}

	/**
	 * Devuelve la lista de jugadores de la partida
	 * @return	la lista de jugadores de la partida
	 */
	public Jugador[] getJugadores() {
		return this.jugadores;
	}

	/**
	 * Asigna el turno de tirar los dados al jugador situado en la posici�n pasada como par�metro
	 * @param pos	La posici�n del jugador al que se desea asignar el turno
	 * @throws PocosJugadoresException Si hay menos de dos jugadores en la partida
	 */
	public void setJugadorConElTurno(int pos) throws PocosJugadoresException {
		if (this.numeroDeJugadores()<2)
			throw new PocosJugadoresException();
		this.empezarPartida();
		this.jugadorConElTurno=pos;
	}

	/**
	 * Devuelve el objeto Casilla situado en la posici�n pos
	 * @param	index el n�mero de casilla
	 * @return	la casilla correspondiente al par�metro pos
	 */
	public Casilla getCasilla(int index) {
		return this.casillas[index];
	}

	void cambiarTurno() {
		boolean encontrado=false;
		while (!encontrado) {
			this.jugadorConElTurno=(this.jugadorConElTurno+1)%this.numeroDeJugadores();
			Jugador j=this.jugadores[jugadorConElTurno];
			if (j.getTurnosSinJugar()>0) {
				j.suspenderTurnos(j.getTurnosSinJugar()-1);
				if (j.getTurnosSinJugar()==0) {
					encontrado=true;
				}
			} else encontrado=true;
		}
	}
	
	/**
	 * Devuelve true si la partida ya ha empezado (es decir, ya hay un jugador con el turno) y false en otro caso
	 * @return	true si la partida ya ha empezado (es decir, ya hay un jugador con el turno) y false en otro caso
	 */
	public boolean partidaEmpezada() {
		return this.partidaEmpezada;
	}

	void empezarPartida() {
		this.partidaEmpezada = true;
	}

	/**
	 * Suma el importe pasado como par�metro al capital guardado en el p�rking gratuito
	 * @param importe	el importe pasado como par�metro, que se suma al capital guardado en el p�rking gratuito
	 */
	public void addToParking(double importe) {
		Parking parking=(Parking) this.casillas[20];
		parking.incrementaCapital(importe);
	}

	/**
	 * A�ade una tarjeta (de suerte o de caja de comunidad) a la lista de tarjetas del tablero.
	 * @param tarjeta	La tarjeta que se quiere a�adir
	 * @param tipo	El tipo de tarjeta (definido en {@link ICtes})
	 * @see ICtes
	 */
	public void add(Tarjeta tarjeta, int tipo) {
		tarjeta.setTablero(this);
		if (tipo==ICtes.Suerte)
			this.tarjetasDeSuerte.add(tarjeta);
		else if (tipo==ICtes.CajaDeComunidad)
			this.tarjetasDeCaja.add(tarjeta);
	}

	Tarjeta popTarjeta(int tipo) {
		if (tipo==ICtes.Suerte) {
			int ultima=this.tarjetasDeSuerte.size()-1;
			Tarjeta t=(Tarjeta) this.tarjetasDeSuerte.get(ultima);
			return t;
		} else if (tipo==ICtes.CajaDeComunidad) {
			int ultima=this.tarjetasDeCaja.size()-1;
			Tarjeta t=(Tarjeta) this.tarjetasDeCaja.get(ultima);
			return t;
		} else return null;
	}

	void cogerTarjeta(int tipo) {
		if (tipo==ICtes.Suerte) {
			int ultima=this.tarjetasDeSuerte.size()-1;
			this.tarjetasDeSuerte.remove(ultima);
		} else if (tipo==ICtes.CajaDeComunidad) {
			int ultima=this.tarjetasDeCaja.size()-1;
			this.tarjetasDeCaja.remove(ultima);
		}
	}

	void devolverTarjeta(Tarjeta t, int tipo) {
		if (tipo==ICtes.Suerte)
			this.tarjetasDeSuerte.insertElementAt(t, 0);
		else if (tipo==ICtes.CajaDeComunidad)
			this.tarjetasDeCaja.insertElementAt(t, 0);
	}
	
	/**
	 * Devuelve la lista de tarjetas del tipo que se pasa como par�metro (Suerte o Caja de comunidad)
	 * @param tipo	El tipo de tarjeta (definido en {@link ICtes})
	 * @return	la lista de tarjetas
	 */
	public Vector getTarjetas(int tipo) {
		if (tipo==ICtes.Suerte)
			return this.tarjetasDeSuerte;
		else if (tipo==ICtes.CajaDeComunidad)
			return this.tarjetasDeCaja;
		else return null;
	}

	void pierde(Jugador jugador) {
		int cont=0;
		while (this.jugadores[cont]!=jugador)
			cont++;
		this.jugadores[cont]=null;
		if (this.numeroDeJugadores()==1) {
			cont=0;
			while (this.jugadores[cont]==null)
				cont++;
			this.ganador=this.jugadores[cont];
		}
	}
	
	public String toString(){
		String retorno = "";
		for(Jugador j:this.jugadores){
			if(j!=null){
				retorno+=j.toString()+"\n";
			}
		}
		
		return retorno;
	}

}
