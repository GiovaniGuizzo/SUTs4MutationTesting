package edu.uclm.esi.iso5.juegos.monopoly.dominio;

/**
 * Representa la casilla de Vaya a la c�rcel. Cuando un jugador cae en esta casilla, se le manda a la c�rcel
 * salvo que tenga una tarjeta que le libre de ella.
 *
 */
public class VayaALaCarcel extends Casilla { 

	public VayaALaCarcel(int posicion) {
		super("Vaya a la c�rcel", posicion);
	}

	protected int operaciones(Jugador j) {
		if (j.tieneTarjetaDeSalirDeLaCarcel()) {
			j.devolverTarjetaDeSalirDeLaCarcel();
			return ICtes.SeLibraDeLaCarcel;
		} else {
			return ICtes.VaALaCarcel;
		}		
	}

}
