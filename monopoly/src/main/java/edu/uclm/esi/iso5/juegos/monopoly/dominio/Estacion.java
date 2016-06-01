package edu.uclm.esi.iso5.juegos.monopoly.dominio;

/**
 * Representa una casilla de tipo estación, de las que hay en el Monopoly
 *
 */
public class Estacion extends CasillaConPrecio {

	/**
	 * Construye una instancia
	 * @param nombre	Nombre de la estación
	 * @param precio	Precio de adquisición
	 * @param posicion	Posición dentro del tablero
	 */
	public Estacion(String nombre, double precio, int posicion) {
		super(nombre, posicion);
		this.precio=precio;
	}
	
	public double getTasaPorCaer() {
		int numeroDeEstacionesDelDueño=this.propietario.getNumeroDeEstaciones();
		switch (numeroDeEstacionesDelDueño) {
		case 1 : return this.getPrecio()/8;
		case 2 : return this.getPrecio()/4;
		case 3 : return this.getPrecio()/2;
		}
		return this.getPrecio();
	}
	
	public String toString() {
		return "\tEstación " + this.nombre + "; precio=" + this.precio + "\n";
	}
}