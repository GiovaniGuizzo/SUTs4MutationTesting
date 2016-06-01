package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.awt.Color;
import java.util.Vector;

public class Barrio {

    protected Vector calles;
    private java.awt.Color color;

    public Barrio(Color color) {
        this.color = color;
        this.calles = new Vector();
    }

    public void addCalle(Calle calle) {
        this.calles.add(calle);
    }

    public boolean algunaCasillaEstaHipotecada() {
        for (int i = 0; i < this.calles.size(); i++) {
            Calle c = (Calle) this.calles.get(i);
            if (c.estaHipotecada()) {
                return true;
            }
        }
        return false;
    }

    public int numeroDeCasas() {
        int r = 0;
        for (int i = 0; i < this.calles.size(); i++) {
            Calle c = (Calle) this.calles.get(i);
            r += c.getNumeroDeCasas();
        }
        return r;
    }

    public boolean todasLasCallesPertenecenAlMismo() {
        Jugador propietarioCalle1 = ((Calle) this.calles.get(0)).getPropietario();
        if (propietarioCalle1 == null) {
            return false;
        }
        for (int i = 0; i < this.calles.size(); i++) {
            Calle c = (Calle) this.calles.get(i);
            if (c.getPropietario() == null || c.getPropietario() != propietarioCalle1) {
                return false;
            }
        }
        return true;
    }

}
