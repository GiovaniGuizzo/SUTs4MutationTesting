package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.ICtes;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero;

/** 
 *	Representa una de las tarjetas que existen en el Monopoly.
 */
public abstract class Tarjeta {

	protected boolean esParaElJugador;
	protected Tablero tablero;

	/**
	 * Construye una tarjeta
	 * @param paraElJugador	Vale true si la tarjeta se la queda el jugador cuando la saca (p. ej., la
	 * tarjeta de quedar libre de la c�rcel se la queda el jugador hasta que la utiliza)
	 */
	public Tarjeta(boolean paraElJugador) {
		this.esParaElJugador=paraElJugador;
	}
	
	/**
	 * Devuelve true si la tarjeta es para el jugador, y false en otro caso (se saca del mont�n, se lee y se
	 * devuelve)
	 * @return	true si la tarjeta es para el jugador, y false en otro caso 
	 */
	public boolean esParaElJugador() {
		return this.esParaElJugador;
	}

	/**
	 * Dependiendo del tipo de tarjeta, se ejecutan unas cosas u otras. Esta operaci�n
	 * es abstracta y est� redefinida en cada subclase.
	 * @param jugador	El jugador que ha sacado la tarjeta
	 * @param tipoDeTarjeta	El tipoDeTarjeta (puede ser una de las constantes {@link ICtes#Suerte} 
	 * o {@link ICtes#CajaDeComunidad})
	 * @return Un valor definido en {@link ICtes}, que depende del tipo de tarjeta que se ha sacado
	 */
	public abstract int operaciones(Jugador jugador, int tipoDeTarjeta);

	
	public abstract String toString();
	
	/**
	 * Le dice a esta tarjeta la referencia al tablero a la que pertenece
	 * @param tablero	El tablero
	 */
	public void setTablero(Tablero tablero) {
		this.tablero=tablero;
	}
}
