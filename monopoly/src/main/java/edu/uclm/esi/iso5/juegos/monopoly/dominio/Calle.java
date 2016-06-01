package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.BarrioConHipotecaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadasCasasException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoPoseeTodoElBarrioException;
 
/**
 * Representa una casilla de tipo calle, de las que hay en el tablero del Monopoly.
 * Las calles pertenecen a un barrio (que se almacena en un campo de tipo {@link Barrio}). Tambi�n
 * tienen un campo con el n�mero de casas que tiene edificadas, y otro con el precio de edificar cada casa.
 *
 */
public class Calle extends CasillaConPrecio {

	private Barrio barrio;
	private int numeroDeCasas;
	private double precioDeCadaCasa;
	private double[] tasas;

	/**
	 * Construye una instancia de tipo Calle.
	 * @param nombre	Nombre de la calle
	 * @param precio	Precio de adquisici�n
	 * @param barrio	Barrio al que pertenece
	 * @param posicion	Posici�n en el tablero
	 * @param precioDeCadaCasa	Precio de cada casa
	 * @param tasaSinEdificar 	Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla, 
	 * 							si no tiene edificaciones. Si el propietario posee todo el barrio, 
	 * 							debe pagarse el doble. 
	 * @param tasa1Casa 		Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla
	 * 							si est� edificada con una casa.
	 * @param tasa2Casas 		Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla
	 * 							si est� edificada con dos casas.
	 * @param tasa3Casas 		Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla
	 * 							si est� edificada con tres casas.
	 * @param tasa4Casas 		Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla
	 * 							si est� edificada con cuatro casas.
	 * @param tasaHotel 		Cantidad que debe pagarse al propietario de esta calle por caer en esta casilla
	 * 							si est� edificada con cinco casas (5 casas=1 hotel).
	 */
	public Calle(String nombre, double precio, Barrio barrio, int posicion, double precioDeCadaCasa, 
			double tasaSinEdificar, double tasa1Casa, double tasa2Casas, double tasa3Casas, 
			double tasa4Casas, double tasaHotel) {
		super(nombre, posicion);
		this.precio=precio;
		this.barrio=barrio;
		this.precioDeCadaCasa=precioDeCadaCasa;
		this.tasas=new double[] {tasaSinEdificar, tasa1Casa, tasa2Casas, tasa3Casas, tasa4Casas, tasaHotel};
		barrio.addCalle(this);
	}

	public double getTasaPorCaer() {
		if (this.estaHipotecada())
			return 0;
		if (this.numeroDeCasas==0) {
			if (!this.barrio.todasLasCallesPertenecenAlMismo())
				return this.tasas[0];
			else return 2*this.tasas[0];
		} else {
			switch (this.numeroDeCasas) {
			case 1: return this.tasas[1];
			case 2: return this.tasas[2];
			case 3: return this.tasas[3];
			case 4: return this.tasas[4];
			}
			return this.tasas[5];
		}
	}

	double getPrecioDeCadaCasa() {
		return precioDeCadaCasa;
	}

	public String toString() {
		return "\tCalle " + this.nombre + " (" + this.posicion + "); precio=" + this.precio + "; " +
			(this.estaHipotecada ? "Hipotecada;" : "No hipotecada;") + " Casas: " + this.numeroDeCasas + "\n";
	}

	/**
	 * Devuelve el n� de casas edificadas en esta calle
	 * @return	n� de casas edificadas en esta calle
	 */
	public int getNumeroDeCasas() {
		return numeroDeCasas;
	}

	public void hipotecar() throws EstaEdificadaException {
		if (this.barrio.numeroDeCasas()==0) {
			this.estaHipotecada=true;
			this.propietario.incrementarCapital(this.getPrecio()/2);
		} else 
			throw new EstaEdificadaException();
	}

	Barrio getBarrio() {
		return this.barrio;
	}

	void edificar(int numeroDeCasas) {
		this.numeroDeCasas+=numeroDeCasas;
	}

	public void quitarCasas(int numeroDeCasas) {
		this.numeroDeCasas=this.numeroDeCasas-numeroDeCasas;
	}

}
