package com.rubio.haro.worldnest.model;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Usuario {

    private String nombre;
    public String Direccion;
    public String Telefono;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String Direccion, String Telefono) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + "}";
    }
}
