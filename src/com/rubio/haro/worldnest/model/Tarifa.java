package com.rubio.haro.worldnest.model;

import java.util.Objects;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Tarifa {

    private double costo;
    private double impuestos;
    private double comision;
    private String tipo;

    public Tarifa() {
        this(120.0, 15.17, "Turista");
    }

    public Tarifa(double costo, double impuestos, String tipo) {
        super();
        this.costo = costo;
        this.impuestos = impuestos;
        this.tipo = tipo;
    }

    public Tarifa(Tarifa unaTarifa) {
        this(unaTarifa.costo, unaTarifa.impuestos, unaTarifa.tipo);
    }

    public void setTarifa(double costo, double impuestos, String tipo) {
        this.costo = costo;
        this.impuestos = impuestos;
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash
                + (int) (Double.doubleToLongBits(this.costo)
                ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 79 * hash
                + (int) (Double.doubleToLongBits(this.impuestos)
                ^ (Double.doubleToLongBits(this.impuestos) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.tipo);
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
        final Tarifa other = (Tarifa) obj;
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.impuestos) != Double.doubleToLongBits(other.impuestos)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "costo=" + costo + ", impuestos=" + impuestos + ", tipo=" + tipo + '}';
    }

}
