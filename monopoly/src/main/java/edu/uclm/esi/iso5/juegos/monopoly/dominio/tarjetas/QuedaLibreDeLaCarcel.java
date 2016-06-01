package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.ICtes;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
  
/**
 * Representa una tarjeta por la que el jugador que la tenga quedar� libre de la c�rcel
 * la pr�xima vez que se le mande a ella.
 *
 */
public class QuedaLibreDeLaCarcel extends Tarjeta {

	/**
	 * Construye la tarjeta
	 */
	public QuedaLibreDeLaCarcel() {
		super(true);
	}

	public int operaciones(Jugador j, int tipoDeTarjeta) {
		j.addTarjeta(this, tipoDeTarjeta);
		if (tipoDeTarjeta==ICtes.Suerte)
			return ICtes.SacaTarjetaDeSuerte;
		else return ICtes.SacaTarjetaDeCaja;
	}

	public String toString(){
		return "Queda libre de la carcel.";
	}

}
