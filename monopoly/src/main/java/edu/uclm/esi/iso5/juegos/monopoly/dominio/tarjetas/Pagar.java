package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.ICtes;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
 
/**
 * Representa una tarjeta por la que el jugador debe pagar una determinada cantidad
 * @author Maco
 *
 */
public class Pagar extends Tarjeta {
	private String texto;
	private double importe;
	
	/**
	 * Construye una tarjeta por la que el jugador que la saque deber� pagar el importe que se pasa
	 * como segundo par�metro. La tarjeta tendr� el texto pasado como primer par�metro.
	 * @param texto	El texto de la tarjeta
	 * @param importe	El importe que debe pagar el jugador que la saque
	 */
	public Pagar(String texto, double importe) {
		super(false);
		this.texto=texto;
		this.importe=importe;
	}

	public int operaciones(Jugador j, int tipoDeTarjeta) {
		if (j.getCapital()>this.importe) {
			j.decrementarCapital(this.importe);
			this.tablero.addToParking(this.importe);
			return ICtes.PagaAlParking;
		} else {
			if (j.puedeHipotecarHasta(importe)) {
				j.setDeudaConBanca(this.importe);
				return ICtes.DebeHipotecarParaParking;
			} else
				return ICtes.JugadorPierde;
		}
	}
	
	public String toString(){
		return texto+" Pagar:"+importe;
	}
	
}
