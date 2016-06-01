package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;

/**
 * Representa una tarjeta por la que el jugador debe pagar una determinada cantidad
 * @author Maco 
 *
 */
public class Cobrar extends Tarjeta {
	private String texto;
	private double importe;
	
	/**
	 * Construye una tarjeta por la que el jugador que la saque cobra de la banca el importe que se pasa
	 * como segundo par�metro. La tarjeta tendr� el texto pasado como primer par�metro.
	 * @param texto	El texto de la tarjeta
	 * @param importe	El importe que cobra el jugador que la saque
	 */
	public Cobrar(String texto, double importe) {
		super(false);
		this.texto=texto;
		this.importe=importe;
	}

	public int operaciones(Jugador j, int tipoDeTarjeta) {
		j.incrementarCapital(this.importe);
		return 0;
	}
	
	public String toString(){
		return texto+" Cobrar:"+importe;
	}
}
