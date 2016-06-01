package edu.uclm.esi.iso5.juegos.monopoly.dominio;

/**
 * Representa la casilla P�rking Gratuito que hay en el Monopoly.
 * Cuando un jugador cae en esta casilla, recibe el dinero que haya acumulado (por pagos que 
 * hayan hecho los jugadores al sacar tarjetas que les obligan a pagar).
 */ 
public class Parking extends Casilla {

	private double capital;

	public Parking(int posicion) {
		super("P�rking gratuito", posicion);
		this.capital=0;
	}

	void incrementaCapital(double importe) {
		this.capital+=importe;
	}

	/**
	 * Devuelve el capital que hay en el P�rking, y que recibir� el jugador que caiga en esta casilla
	 * @return capital que hay en el P�rking
	 */
	public double getCapital() {
		return this.capital;
	}

	protected int operaciones(Jugador j) {
		j.incrementarCapital(this.capital);
		this.capital=0;
		return ICtes.CobraParking;
	}

}
