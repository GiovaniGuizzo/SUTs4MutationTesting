package edu.uclm.esi.iso5.juegos.monopoly.dominio;

/**
 * Representa una casilla de tipo impuesto. Cuando un jugador cae en esta casilla, debe pagar
 * cierta cantidad.
 *
 */ 
public class Impuesto extends Casilla {
	private double importe;

	/**
	 * Construye una instancia
	 * @param nombre	Nombre de la casilla (p. ej., "Impuesto de lujo")
	 * @param importe	Importe que debe pagarse
	 * @param posicion	Posici�n dentro del tablero
	 */
	public Impuesto(String nombre, double importe, int posicion) {
		super(nombre, posicion);
		this.importe=importe;
	}

	/**
	 * Devuelve el importe que debe pagarse por caer en esta casilla
	 * @return	importe que debe pagarse por caer en esta casilla
	 */
	public double getImporte() {
		return importe;
	}

	protected int operaciones(Jugador j) {
		j.decrementarCapital(importe);
		this.tablero.addToParking(importe);
		return ICtes.PagarImpuestos;
	}

	
}
