package com.rubio.haro.worldnest.model;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Arrendador extends Usuario {

    public Arrendador() {
        super();
    }

    public Arrendador(String nombre) {
        super(nombre);
    }

    public Arrendador(String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
