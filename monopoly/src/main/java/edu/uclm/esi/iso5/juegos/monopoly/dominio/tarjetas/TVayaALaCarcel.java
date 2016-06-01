package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.ICtes;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
 
/**
 * Representa una tarjeta que manda a la c�rcel al jugador que la saque
 *
 */
public class TVayaALaCarcel extends Tarjeta {

	/**
	 * Construye la instancia
	 */
	public TVayaALaCarcel() {
		super(false);
	}

	public int operaciones(Jugador j, int tipoDeTarjeta) {
		if (j.tieneTarjetaDeSalirDeLaCarcel()) {
			j.devolverTarjetaDeSalirDeLaCarcel();
			return ICtes.SeLibraDeLaCarcel;
		} else {
			return ICtes.VaALaCarcel;
		}
	}
	
	public String toString(){
		return "Vaya a la carcel.";
	}

}
