package edu.uclm.esi.iso5.juegos.monopoly.dominio;

/**
 * Representa una deuda que se tiene con un acreedor.
 *
 */
public class Deuda {

	private Jugador acreedor;
	private double importeDeuda;

	/**
	 * Construye una instancia.
	 * @param acreedor	Jugador al que se le debe dinero.
	 * @param importe	Cantidad de dinero que se le debe.
	 */
	public Deuda(Jugador acreedor, double importe) {
		this.acreedor=acreedor;
		this.importeDeuda=importe;
	}

	Jugador getAcreedor() {
		return acreedor;
	}

	double getImporteDeuda() {
		return importeDeuda;
	}

	void pagar() {
		this.acreedor.incrementarCapital(this.importeDeuda);
	}

}
