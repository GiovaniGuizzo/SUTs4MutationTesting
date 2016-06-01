package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta;

public class CajaDeComunidad extends Casilla {

	public CajaDeComunidad(int posicion) {
		super("Caja de comunidad", posicion);
	}

	protected int operaciones(Jugador j) {
		Tarjeta t=this.tablero.popTarjeta(ICtes.CajaDeComunidad);
		if (t.esParaElJugador()) {
			this.tablero.cogerTarjeta(ICtes.CajaDeComunidad);
		} else {
			this.tablero.cogerTarjeta(ICtes.CajaDeComunidad);
			this.tablero.devolverTarjeta(t, ICtes.CajaDeComunidad);
		}
		return t.operaciones(j, ICtes.CajaDeComunidad);
	}

}
