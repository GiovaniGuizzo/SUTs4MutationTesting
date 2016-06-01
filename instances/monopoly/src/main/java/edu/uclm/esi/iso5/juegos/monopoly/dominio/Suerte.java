package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;
 
/**
 * Representa una casilla de Suerte. Cuando un jugador cae en una casilla de este tipo, saca
 * la tarjeta de Suerte que haya en la cima del mont�n de tarjetas de suerte.
 *
 */
public class Suerte extends Casilla {

	public Suerte(int posicion) {
		super("Suerte", posicion);
	}

	protected int operaciones(Jugador j) {
		Tarjeta t=this.tablero.popTarjeta(ICtes.Suerte);
		if (t.esParaElJugador()) {
			this.tablero.cogerTarjeta(ICtes.Suerte);
		} else {
			this.tablero.cogerTarjeta(ICtes.Suerte);
			this.tablero.devolverTarjeta(t, ICtes.Suerte);
		}
		return t.operaciones(j, ICtes.Suerte);
	}	
}
