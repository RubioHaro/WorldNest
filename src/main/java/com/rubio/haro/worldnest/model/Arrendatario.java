package com.rubio.haro.worldnest.model;

/**
 *
 * @author Rubio Haro
 */
public class Arrendatario extends Usuario {

    public Arrendatario() {
        super();
    }

    public Arrendatario(String nombre) {
        super(nombre);
    }

    public Arrendatario(String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
