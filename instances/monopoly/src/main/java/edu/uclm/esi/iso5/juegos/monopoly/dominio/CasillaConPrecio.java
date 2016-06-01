package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException;
 
/**
 * Especializaci�n de {@link Casilla} que representa una casilla que puede comprarse y que tiene, por tanto,
 * un precio. Aporta dos campos a los que ya hereda de {@link Casilla}: uno para determinar si esta casilla
 * est� hipotecada, y otro que representa el precio de adquisici�n de esta casilla.
 * Tiene varias especializaciones para atender al tipo de casilla con precio de que se trate (Calle, Estaci�n, etc.) 
 *
 */
public abstract class CasillaConPrecio extends Casilla {

	protected boolean estaHipotecada;
	protected double precio;

	/**
	 * Construye una instancia con el nombre y la posici�n pasadas como par�metros
	 * @param nombre	El nombre de la casilla
	 * @param posicion	La posici�n en el tablero
	 */
	public CasillaConPrecio(String nombre, int posicion) {
		super(nombre, posicion);
	}

	public CasillaConPrecio() {
		super("Sin nombre", -1);
	}
	
	/**
	 * Devuelve true si est� hipotecada, y false en otro caso
	 * @return	true si est� hipotecada, y false en otro caso
	 */
	public boolean estaHipotecada() {
		return this.estaHipotecada;
	}

	/**
	 * Devuelve el precio de la casilla
	 * @return	el precio de la casilla
	 */
	public double getPrecio() {
		return this.precio;
	}
	
	protected int operaciones(Jugador j) {
		if (this.propietario==null)
			return ICtes.PuedeComprar;
		if (this.propietario!=j) {
			double tasaPorPasar=this.getTasaPorCaer();
			try {
				j.pagarA(this.propietario, tasaPorPasar);
			} catch (CapitalInsuficienteException e) {
				if (j.puedeHipotecarHasta(tasaPorPasar))
					return ICtes.DebeHipotecar;
				else
					return ICtes.JugadorPierde;
			}
			return ICtes.PagaPorCaer;
		}
		return 0;
	}

	/**
	 * Devuelve el importe que debe pagar el jugador que cae en esta casilla
	 * @return el importe que debe pagar el jugador que cae en esta casilla
	 */
	public abstract double getTasaPorCaer();

	/**
	 * Se ejecuta cuando el jugador que posee est� casilla desea hipotecarla
	 * @throws EstaEdificadaException	Si la casilla tiene edificaciones
	 */
	public void hipotecar() throws EstaEdificadaException {
		this.estaHipotecada=true;
		this.propietario.incrementarCapital(this.getPrecio()/2);
	}

	void comprar(Jugador jugador) throws CasillaNoVendibleException, CapitalInsuficienteException {
		if (this.propietario!=null)
			throw new CasillaNoVendibleException();
		if (jugador.getCapital()<this.getPrecio())
			throw new CapitalInsuficienteException();
		jugador.addPosesion(this);
		jugador.decrementarCapital(this.getPrecio());
	}

	void levantarHipoteca() {
		this.estaHipotecada=false;
	}	
}
