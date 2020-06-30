package com.rubio.haro.worldnest.model;

import java.util.Objects;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Telefono {

    private String deCasa;
    private String movil;
    private String oficina;

    public Telefono() {
        this("55243748", 1);
    }

    public Telefono(String numero, int donde) {
        switch (donde) {
            case 0:
                deCasa = numero;
                movil = "";
                oficina = "";
                break;
            case 1:
                deCasa = "";
                movil = numero;
                oficina = "";
                break;
            case 2:
                deCasa = "";
                movil = "";
                oficina = numero;
                break;
            case 3:
                deCasa = "";
                movil = "";
                oficina = "";
                break;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.deCasa);
        hash = 97 * hash + Objects.hashCode(this.movil);
        hash = 97 * hash + Objects.hashCode(this.oficina);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (!Objects.equals(this.deCasa, other.deCasa)) {
            return false;
        }
        if (!Objects.equals(this.movil, other.movil)) {
            return false;
        }
        if (!Objects.equals(this.oficina, other.oficina)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "deCasa=" + deCasa + ", movil=" + movil
                + ", oficina=" + oficina + '}';
    }

}
