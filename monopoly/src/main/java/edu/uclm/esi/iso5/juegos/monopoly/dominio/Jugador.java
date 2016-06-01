package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.util.Vector;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.BarrioConHipotecaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DebeSaldarLaDeudaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadasCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.HayMenosCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsEdificableException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaEnLaCarcelException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaHipotecadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoPoseeTodoElBarrioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.YaEstaHipotecadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;

/** 
 * Representa un jugador de los que juegan una partida del Monopoly.
 * 
 */
public class Jugador {
	private String nombre;
	private double capital;
	private int[] ultimaTirada;
	private Casilla casilla;
	private int numeroDeDobles;
	private Tablero tablero;
	private Vector posesiones;
	private int turnosSinJugar;
	private Vector tarjetasDeSuerte;
	private Vector tarjetasDeCaja;
	private boolean puedeComprar;
	private Deuda deuda;
	private double deudaConBanca;

	/**
	 * Construye un jugador con el nombre que se pasa como par�metro.
	 * Se le asignan 1500 euros de capital.
	 * @param nombre	El nombre que se asigna a este jugador
	 */
	public Jugador(String nombre) {
		this.nombre=nombre;
		this.capital=1500.0;
		this.ultimaTirada=new int[2];
		this.posesiones=new Vector();
		this.tarjetasDeSuerte=new Vector();
		this.tarjetasDeCaja=new Vector();
	}

	void tirarDados() throws NoTieneElTurnoException, DebeSaldarLaDeudaException {
		int jugadorConElTurno = this.tablero.getJugadorConElTurno();
		if (this.tablero.partidaEmpezada() && this.tablero.getJugadores()[jugadorConElTurno]!=this)
			throw new NoTieneElTurnoException();
		setDados(Dados.tirarDados()[0], Dados.tirarDados()[1]);
	}

	/**
	 * Devuelve la suma de los dados que a este jugador le ha salido en la �ltima tirada
	 * @return	la suma de los dados que a este jugador le ha salido en la �ltima tirada
	 */
	public int getSumaDados() {
		return this.ultimaTirada[0]+this.ultimaTirada[1];
	}
	
	/**
	 * Devuelve una cadena con el nombre del jugador, la posici�n de la casilla en la que se encuentra,
	 * el capital que posee, los �ltimos dados que le han salido, sus posesiones
	 * y las tarjetas de suerte y de caja de comunidad que posee (si es que tiene alguna).
	 */
	public String toString() {
		String r=this.nombre + " (en " + this.casilla.getPosicion() + ")\n\tCapital: " + this.capital + "\n\tDados: (" + this.ultimaTirada[0]+ ", " + this.ultimaTirada[1] + ")";
		r+="\n";
		for (int i=0; i<this.posesiones.size(); i++) {
			CasillaConPrecio c=(CasillaConPrecio) this.posesiones.get(i);
			r+=c.toString();
		}
		if (this.tarjetasDeSuerte.size()>0)
			r+="\n\tTarjetas de suerte:\n";
		for (int i=0; i<this.tarjetasDeSuerte.size(); i++) {
			Tarjeta t=(Tarjeta) this.tarjetasDeSuerte.get(i);
			r+=t.toString();
		}
		if (this.tarjetasDeCaja.size()>0)
			r+="\n\tTarjetas de Caja:\n";
		for (int i=0; i<this.tarjetasDeCaja.size(); i++) {
			Tarjeta t=(Tarjeta) this.tarjetasDeCaja.get(i);
			r+=t.toString();
		}
		return r;
	}

	/**
	 * Simula una tirada de dados del jugador. Se le pasa como par�metro los dos n�meros que queremos que le 
	 * salgan en los dados.
	 * @param dado1	El n�mero del primer dado
	 * @param dado2	El n�mero del segundo dado
	 * @throws NoTieneElTurnoException	Cuando el jugador no tiene el turno
	 * @throws DebeSaldarLaDeudaException Cuando jugador tira los dados pero tiene una deuda con otro jugador pendiente de saldar
	 */
	public void setDados(int dado1, int dado2) throws NoTieneElTurnoException, DebeSaldarLaDeudaException {
		int jugadorConElTurno = this.tablero.getJugadorConElTurno();
		if (this.tablero.partidaEmpezada() && this.tablero.getJugadores()[jugadorConElTurno]!=this) {
			throw new NoTieneElTurnoException();
		}
		if (this.deuda!=null || this.deudaConBanca>0) {
			throw new DebeSaldarLaDeudaException();
		}
		this.ultimaTirada[0] = dado1;
		this.ultimaTirada[1] = dado2;
		if (dado1==dado2)
			this.numeroDeDobles++;
		else this.numeroDeDobles=0;
		if (this.tablero.partidaEmpezada())
			this.avanzar();
	}

	void setCasilla(Casilla casilla) {
		this.casilla=casilla;
	}

	/***
	 * Devuelve una referencia a la casilla en la que est� situado este jugador
	 * @return	referencia a la casilla en la que est� situado este jugador
	 */
	public Casilla getCasilla() {
		return this.casilla;
	}

	/**
	 * Devuelve el capital que tiene este jugador
	 * @return	capital que tiene este jugador
	 */
	public double getCapital() {
		return this.capital;
	}

	/**
	 * Decrementa el capital del jugador en el importe que se pasa como par�metro
	 * @param importe	El importe que queremos restar al capital de este jugador
	 */
	public void decrementarCapital(double importe) {
		this.capital=this.capital-importe;
	}

	void setTablero(Tablero tablero) {
		this.tablero=tablero;
	}

	protected void avanzar() {
		Casilla origen=this.getCasilla();
		Casilla destino=null;
		if (this.numeroDeDobles==3) {
			destino=this.tablero.getCasilla(10);
			origen.quitar(this);
			destino.add(this);
			this.suspenderTurnos(3);
			this.tablero.cambiarTurno();
		} else {
			int posDestino=(origen.getPosicion()+this.getSumaDados())%40;
			destino=this.tablero.getCasilla(posDestino);
			if (origen.getPosicion()>destino.getPosicion()) {
				this.incrementarCapital(200.0);
			}
			origen.quitar(this);
			int resultadoMovimiento=destino.add(this);
			if (resultadoMovimiento==ICtes.VaALaCarcel) {
				this.tablero.getCasilla(10).add(this);
				this.suspenderTurnos(3);
				this.tablero.cambiarTurno();
				return;
			} else if (resultadoMovimiento==ICtes.PuedeComprar) {
				this.darOpcionDeCompra();
				return;
			} else if (resultadoMovimiento==ICtes.JugadorPierde) {
				this.tablero.pierde(this);
				return;
			} else if (resultadoMovimiento==ICtes.DebeHipotecar) {
				this.deuda=new Deuda(destino.getPropietario(), ((CasillaConPrecio) casilla).getTasaPorCaer());
				return;
			} else if (resultadoMovimiento==ICtes.DebeHipotecarParaParking) {
				return;
			} 
			if (this.numeroDeDobles==0)
				this.tablero.cambiarTurno();
		}
	}

	private void darOpcionDeCompra() {
		this.puedeComprar=true;
	}

	void suspenderTurnos(int turnosSinJugar) {
		this.turnosSinJugar=turnosSinJugar;
	}

	/**
	 * Esta operaci�n se ejecuta cuando este jugador quiere comprar la casilla en la que se encuentra.
	 * @throws NoTieneOpcionDeCompraException	Si el jugador no tiene opci�n de compra (se le pas� el turno, p.ej.)
	 * @throws CapitalInsuficienteException 	Si el jugador no tiene capital suficiente para comprar esta casilla
	 * @throws CasillaNoVendibleException 	Si la casilla no se vende (p. ej., es una Caja de Comunidad)
	 */
	public void comprar() throws NoTieneOpcionDeCompraException, CasillaNoVendibleException, CapitalInsuficienteException {
		if (!this.puedeComprar)
			throw new NoTieneOpcionDeCompraException();
		this.casilla.comprar(this);
		this.puedeComprar=false;
		if (this.numeroDeDobles==0)
			this.tablero.cambiarTurno();
	}

	/**
	 * A�ade la casilla que se pasa como par�metro a la lista de posesiones de este jugador
	 * @param casilla	La casilla que se a�ade a la lista de posesiones de este jugador
	 */
	public void addPosesion(CasillaConPrecio casilla) {
		this.posesiones.add(casilla);
		casilla.setPropietario(this);
	}

	/**
	 * Devuelve la lista de posesiones de este jugador
	 * @return	la lista de posesiones de este jugador
	 */
	public Vector getPosesiones() {
		return posesiones;
	}

	/**
	 * Devuelve el n�mero de turnos sin jugar de este jugador
	 * @return	el n�mero de turnos sin jugar de este jugador
	 */
	public int getTurnosSinJugar() {
		return turnosSinJugar;
	}

	void pagarA(Jugador propietario, double importe) throws CapitalInsuficienteException {
		if (this.getCapital()<importe)
			throw new CapitalInsuficienteException();
		this.decrementarCapital(importe);
		propietario.incrementarCapital(importe);
	}

	/**
	 * Incrementa el capital del jugador en el importe pasado como par�metro.
	 * @param importe	El importe que se suma al capital del jugador.
	 */
	public void incrementarCapital(double importe) {
		this.capital+=importe;
	}

	/**
	 * Devuelve true si el jugador tiene alguna tarjeta (ya sea de Suerte o de Caja de Comunidad)
	 * que le permite salir de la c�rcel, y false en otro caso
	 * @return	true o false, seg�n tenga o no tarjeta para salir de la c�rcel
	 */
	public boolean tieneTarjetaDeSalirDeLaCarcel() {
		for (int i=0; i<this.tarjetasDeSuerte.size(); i++) {
			Tarjeta t=(Tarjeta) this.tarjetasDeSuerte.get(i);
			if (t instanceof QuedaLibreDeLaCarcel)
				return true;
		}
		for (int i=0; i<this.tarjetasDeCaja.size(); i++) {
			Tarjeta t=(Tarjeta) this.tarjetasDeCaja.get(i);
			if (t instanceof QuedaLibreDeLaCarcel)
				return true;
		}
		return false;
	}

	/**
	 * A�ade la tarjeta que se pasa como par�metro al conjunto de tarjetas de este jugador
	 * @param tarjeta	La tarjeta que se le a�ade al jugador
	 * @param tipoDeTarjeta	El tipo de tarjeta 
	 */
	public void addTarjeta(Tarjeta tarjeta, int tipoDeTarjeta) {
		if (tipoDeTarjeta==ICtes.Suerte)
			this.tarjetasDeSuerte.add(tarjeta);
		else if (tipoDeTarjeta==ICtes.CajaDeComunidad)
			this.tarjetasDeCaja.add(tarjeta);
	}

	/**
	 * Devuelve la tarjeta de salir de la c�rcel que ten�a este jugador.
	 * Esta operaci�n se ejecuta cuando el jugador cae en la casilla de ir a la c�rcel o cuando
	 * saca una tarjeta que le manda a la c�rcel.
	 */
	public void devolverTarjetaDeSalirDeLaCarcel() {
		for (int i=0; i<this.tarjetasDeSuerte.size(); i++) {
			Tarjeta t = (Tarjeta) this.tarjetasDeSuerte.get(i);
			if (t instanceof QuedaLibreDeLaCarcel) {
				this.tarjetasDeSuerte.remove(i);
				this.tablero.devolverTarjeta(t, ICtes.Suerte);
				return;
			}
		}
		for (int i=0; i<this.tarjetasDeCaja.size(); i++) {
			Tarjeta t = (Tarjeta) this.tarjetasDeCaja.get(i);
			if (t instanceof QuedaLibreDeLaCarcel) {
				this.tarjetasDeCaja.remove(i);
				this.tablero.devolverTarjeta(t, ICtes.CajaDeComunidad);
				return;
			}
		}
	}

	int getNumeroDeEstaciones() {
		int r=0;
		for (int i=0; i<this.posesiones.size(); i++) {
			CasillaConPrecio c=(CasillaConPrecio) this.posesiones.get(i);
			if (c instanceof Estacion)
				r++;
		}
		return r;
	}

	/**
	 * Devuelve true si el jugador tiene capital y posesiones suficientes para hipotecar hasta la cantidad
	 * que se pasa como par�metro, y false en caso contrario. 
	 * @param cantidad	La cantidad que se quiere poder satisfacer mediante el capital del jugador y sus posibles hipotecas
	 * @return	true si puede, o false en otro caso
	 */
	public boolean puedeHipotecarHasta(double cantidad) {
		double r=this.capital;
		for (int i=0; i<this.posesiones.size(); i++) {
			CasillaConPrecio c=(CasillaConPrecio) this.posesiones.get(i);
			if (!c.estaHipotecada())
				r+=(c.getPrecio()/2);
		}
		return r>=cantidad;
	}

	/**
	 * Se ejecuta cuando el jugador desea hipotecar la casilla que se pasa como par�metro.
	 * @param casilla	La casilla que se desea hipotecar
	 * @throws YaEstaHipotecadaException	Si la casilla ya est� hipotecada
	 * @throws NoEsElPropietarioException	Si el jugador no es el propietario de esta casilla
	 * @throws EstaEdificadaException	Si la casilla tiene edificaciones
	 */
	public void hipoteca(CasillaConPrecio casilla) throws YaEstaHipotecadaException, NoEsElPropietarioException, EstaEdificadaException {
		if (casilla.getPropietario()!=this)
			throw new NoEsElPropietarioException();
		if (casilla.estaHipotecada())
			throw new YaEstaHipotecadaException();
		casilla.hipotecar();
	}

	/**
	 * Devuelve true si este jugador tiene una deuda con el acreedor (Jugador que se pasa como par�metro)
	 * @param acreedor	El jugador con el que esta instancia puede tener una deuda
	 * @return	true si este jugador tiene una deuda con el acreedor (Jugador que se pasa como par�metro)
	 */
	public boolean tieneDeudaCon(Jugador acreedor) {
		return (this.deuda!=null && this.deuda.getAcreedor()==acreedor);
	}

	/**
	 * Paga la deuda de este jugador
	 * @throws CapitalInsuficienteException Si el jugador no tiene dinero suficiente para pagar la deuda.
	 */
	public void pagarDeuda() throws CapitalInsuficienteException {
		if (this.getCapital()<this.deuda.getImporteDeuda())
			throw new CapitalInsuficienteException();
		this.decrementarCapital(this.deuda.getImporteDeuda());
		this.deuda.pagar();
		this.deuda=null;
		if (this.numeroDeDobles==0)
			this.tablero.cambiarTurno();
	}

	/**
	 * Crea una deuda con la banca. Se ejecuta cuando el jugador saca una tarjeta que le obliga a pagar,
	 * no tiene dinero pero s� tiene bienes que puede hipotecar para saldar la deuda. 
	 * @param importe	El importe de la deuda
	 */
	public void setDeudaConBanca(double importe) {
		this.deudaConBanca=importe;
	}

	/**
	 * Devuelve el importe de la deuda que este jugador tiene con la banca
	 * @return	El importe de la deuda que este jugador tiene con la banca
	 */
	public double getDeudaConBanca() {
		return deudaConBanca;
	}

	/**
	 * Se ejecuta para que este jugador salde la deuda que tiene con la banca
	 * @throws CapitalInsuficienteException	Cuando el jugador no tiene capital suficiente para pagar la deuda
	 */
	public void saldarDeudaConBanca() throws CapitalInsuficienteException {
		if (this.capital<this.deudaConBanca)
			throw new CapitalInsuficienteException();
		this.decrementarCapital(this.deudaConBanca);
		this.tablero.addToParking(this.deudaConBanca);
		this.deudaConBanca=0;
		if (this.numeroDeDobles==0)
			this.tablero.cambiarTurno();
	}

	/**
	 * Se ejecuta cuando este jugador est� en la C�rcel y quiere pagar para salir de ella.
	 * Se le restan 50 euros al capital del jugador, que pasan a formar parte del premio por caer
	 * en la casilla del P�rking.
	 * Adem�s, se le permite tirar los dados en su siguiente turno.
	 * @throws NoEstaEnLaCarcelException	Si el jugador no est� en la C�rcel
	 */
	public void pagaPorSalirDeLaCarcel() throws NoEstaEnLaCarcelException {
		if (this.getCasilla().getPosicion()!=10)
			throw new NoEstaEnLaCarcelException();
		if (this.getCapital()>=50)
			this.decrementarCapital(50);
		this.turnosSinJugar=0;
	}

	/**
	 * Se ejecuta para que este jugador pueda edificar en la casilla cuya posici�n se pasa como par�metro.
	 * @param posCasilla	La posici�n de la casilla en la que se quiere edificar
	 * @param numeroDeCasas	El n�mero de casas que se quiere edificar (el n�mero de casas tras ejecutar 
	 * 						esta operaci�n estar� entre 1 y 5)
	 * @throws NoEsEdificableException	Si no se puede edificar en esta casilla
	 * @throws DemasiadasCasasException	Si el n� de casas total es superior a 5
	 * @throws CapitalInsuficienteException	Si el jugador no tiene capital suficiente para construir las casas
	 * @throws NoEsElPropietarioException	Si el jugador no es el propietario de de la casilla
	 * @throws NoPoseeTodoElBarrioException	Si el jugador no posee todo el barrio
	 * @throws BarrioConHipotecaException	Si alguna de las casillas del barrio est� hipotecada
	 */
	public void edificar(int posCasilla, int numeroDeCasas) throws NoEsEdificableException, DemasiadasCasasException, CapitalInsuficienteException, NoEsElPropietarioException, NoPoseeTodoElBarrioException, BarrioConHipotecaException {
		if (!(this.tablero.getCasilla(posCasilla) instanceof Calle))
			throw new NoEsEdificableException();
		Calle calle=(Calle) this.tablero.getCasilla(posCasilla);
		if (calle.getNumeroDeCasas()+numeroDeCasas>5)
			throw new DemasiadasCasasException();
		if (calle.getPrecioDeCadaCasa()*numeroDeCasas>this.getCapital())
			throw new CapitalInsuficienteException();
		if (calle.getPropietario()==null || calle.getPropietario()!=this)
			throw new NoEsElPropietarioException();
		if (!calle.getBarrio().todasLasCallesPertenecenAlMismo())
			throw new NoPoseeTodoElBarrioException();
		if (calle.getBarrio().algunaCasillaEstaHipotecada())
			throw new BarrioConHipotecaException();
		calle.edificar(numeroDeCasas);
		this.decrementarCapital(calle.getPrecioDeCadaCasa()*numeroDeCasas);	
	}

	/**
	 * Se ejecuta para levantar la hipoteca sobre la casilla que se pasa como par�metro.
	 * El coste del levantamiento de la hipoteca es la mitad del precio de adquisici�n de la casilla
	 * m�s un 10% de esta mitad.
	 * @param casilla	La casilla sobre la que se quiere levantar la hipoteca.
	 * @throws NoEstaHipotecadaException	Si la casilla no est� hipotecada
	 * @throws NoEsElPropietarioException	Si el jugador no es el propietario
	 * @throws CapitalInsuficienteException	Si el jugador no tiene capital suficiente para levantar la hipoteca
	 */
	public void levantarHipoteca(CasillaConPrecio casilla) throws NoEstaHipotecadaException, NoEsElPropietarioException, CapitalInsuficienteException {
		if (!casilla.estaHipotecada())
			throw new NoEstaHipotecadaException();
		if (casilla.getPropietario()!=this)
			throw new NoEsElPropietarioException();
		double importe=1.10*casilla.getPrecio()/2;
		if (this.getCapital()<importe)
			throw new CapitalInsuficienteException();
		this.decrementarCapital(importe);
		casilla.levantarHipoteca();
	}

	/**
	 * Se ejecuta cuando el jugador ha ca�do en una casilla que puede comprar, pero prefiere no comprarla.
	 * Cuando se ejecuta esta operaci�n, se pasa el turno al siguiente jugador.
	 */
	public void desecharOpcionDeCompra() {
		this.puedeComprar=false;
		if (this.numeroDeDobles==0)
			this.tablero.cambiarTurno();
	}

	int getNumeroDeCompanias() {
		int r=0;
		for (int i=0; i<this.posesiones.size(); i++) {
			CasillaConPrecio c=(CasillaConPrecio) this.posesiones.get(i);
			if (c instanceof Compania)
				r++;
		}
		return r;
	}

	/**
	 * Esta operaci�n la ejecuta eljugador cuando desea devolver edificaciones que posee en una calle.
	 * La banca le paga la mitad de lo que le han costado las edificaciones que devuelve.
	 * @param posicion	Posici�n de la casilla con edificaciones 
	 * @param numeroDeCasas	N�mero de casas que se quieren devolver
	 * @throws NoEsElPropietarioException	Si el jugador no es el propietario de la casilla
	 * @throws HayMenosCasasException	Si hay menos casas de las que quiere devolver el propietario
	 * @throws NoEsEdificableException 	Si la casilla no es edificable
	 */
	public void devolverEdificaciones(int posicion, int numeroDeCasas) throws NoEsElPropietarioException, HayMenosCasasException, NoEsEdificableException {
		Casilla c=this.tablero.getCasilla(posicion);
		if (!(c instanceof Calle)) 
			throw new NoEsEdificableException();
		Calle calle=(Calle) c;
		if (calle.getPropietario()!=this)
			throw new NoEsElPropietarioException();
		if (calle.getNumeroDeCasas()<numeroDeCasas)
			throw new HayMenosCasasException();
		calle.quitarCasas(numeroDeCasas);
		double importe=calle.getPrecioDeCadaCasa()*numeroDeCasas/2;
		this.incrementarCapital(importe);
	}


}
