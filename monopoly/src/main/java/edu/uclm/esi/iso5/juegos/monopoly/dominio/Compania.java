package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException;
 
/**
 * Representa una casilla de tipo compa��a de las que hay en el Monopoly.
 *
 */
public class Compania extends CasillaConPrecio {


	public Compania(String nombre, double precio, int posicion) {
		super(nombre, posicion);
		this.precio=precio;
	}
	
	public double getTasaPorCaer() {
		if (this.propietario==null)
			return 0;
		else if (this.propietario.getNumeroDeCompanias()==1)
			return 4;
		else return 8;
	}

	public String toString() {
		return "\tCompa��a " + this.nombre + "; precio=" + this.precio + "\n";
	}
	
	protected int operaciones(Jugador j) {
		if (this.propietario==null)
			return ICtes.PuedeComprar;
		if (this.propietario!=j) {
			double tasaPorPasar=j.getSumaDados()*this.getTasaPorCaer();
			try {
				j.pagarA(this.propietario, tasaPorPasar);
			} catch (CapitalInsuficienteException e) {
				if (j.puedeHipotecarHasta(tasaPorPasar))
					return ICtes.DebeHipotecar;
				else
					return ICtes.JugadorPierde;
			}
			return ICtes.PagaPorCaer;
		}
		return 0;
	}
}
