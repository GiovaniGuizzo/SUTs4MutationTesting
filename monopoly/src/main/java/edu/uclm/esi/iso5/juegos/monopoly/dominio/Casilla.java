package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.util.Vector;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException;
 
/**
 * Representa una casilla del tablero. Es una clase abstracta con varias especializaciones.
 * La casilla tiene un nombre, un array con los jugadores que est�n situados en ella, una posici�n en el tablero,
 * un propietario (si lo tiene) y una referencia al tablero sobre el cual la casilla est� situada.
 *
 */
public abstract class Casilla {
	protected String nombre;
	protected Jugador[] jugadores;
	protected int posicion;
	protected Jugador propietario;
	protected Tablero tablero;
	
	/**
	 * Construye una instancia de tipo Casilla
	 * @param nombre	Nombre de la casilla (de la calle, estaci�n, etc.)
	 * @param posicion	Posici�n de la casilla dentro del tablero
	 */
	public Casilla(String nombre, int posicion) {
		this.nombre=nombre;
		this.posicion=posicion;
		this.jugadores=new Jugador[6];
	}

	int add(Jugador jugador) {
		int cont=0;
		while (this.jugadores[cont]!=null)
			cont++;
		this.jugadores[cont]=jugador;
		jugador.setCasilla(this);
		int r=operaciones(jugador);
		return r;
	}

	protected int operaciones(Jugador j) {
		return 0;
	}

	/**
	 * Devuelve true si el jugador pasado como par�metro est� en esta casilla, y false en otro caso
	 * @param jugador	El jugador por el cual preguntamos
	 * @return	true si el jugador pasado como par�metro est� en esta casilla, y false en otro caso
	 */
	public boolean contains(Jugador jugador) {
		for (int i=0; i<this.jugadores.length; i++)
			if (this.jugadores[i]!=null && this.jugadores[i]==jugador)
				return true;
		return false;
	}

	/**
	 * Devuelve la posici�n de esta casilla en el tablero
	 * @return	la posici�n de esta casilla en el tablero
	 */
	public int getPosicion() {
		return this.posicion;
	}

	void quitar(Jugador jugador) {
		for (int i=0; i<this.jugadores.length; i++)
			if (this.jugadores[i]!=null && this.jugadores[i]==jugador) {
				this.jugadores[i]=null;
				return;
			}
	}

	void comprar(Jugador jugador) throws CasillaNoVendibleException, CapitalInsuficienteException {
		throw new CasillaNoVendibleException();
	}

	void setTablero(Tablero tablero) {
		this.tablero=tablero;
	}

	/***
	 * Devuelve una referencia al tablero en el que est� ubicada esta casilla
	 * @return	referencia al tablero en el que est� ubicada esta casilla
	 */
	public Tablero getTablero() {
		return tablero;
	}

	/**
	 * Devuelve una referencia al jugador que posee esta casilla (o null si no tiene due�o)
	 * @return	referencia al jugador que posee esta casilla (o null si no tiene due�o)
	 */
	public Jugador getPropietario() {
		return propietario;
	}

	void setPropietario(Jugador propietario) {
		this.propietario = propietario;
	}
}
