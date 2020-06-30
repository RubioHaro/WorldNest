package com.rubio.haro.worldnest.model;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Usuario {

    private String nombre;
    private String Direccion;
    private String Telefono;
    private char[] password;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.password = new char[10];
        this.nombre = nombre;
    }

    public Usuario(String nombre, String Direccion, String Telefono) {
        this.password = new char[10];
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

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + "}";
    }
}
