package com.rubio.haro.worldnest.model;

import java.util.Objects;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class RegistroArrendatario {
    private String correoE;
    private RegistroTarjeta tarjeta;
    private Telefono telefono;
    private Direccion direccion;

    public RegistroArrendatario() {
        this("un_usuario@gmail.com");
    }

    public RegistroArrendatario(String correoE) {
        super();
        this.correoE = correoE;
        tarjeta = new RegistroTarjeta();
        telefono = new Telefono();
        direccion = new Direccion();
    }

    public RegistroArrendatario(RegistroArrendatario unUsuario) {
        this(unUsuario.correoE);
    }

    public void setRegistroArrendador(String correoE) {
        this.correoE = correoE;
    }

    public void adicionarTarjeta(RegistroTarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void adicionarTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void adicionar(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean quitar(Direccion direccion) {
        boolean quitada = false;

        return quitada;
    }

    public Direccion buscar(Direccion d) {
        if (this.direccion == null) {
            return null;
        }
        if (d.getCalle().equals(direccion.getCalle()) && d.getColonia().equals(direccion.getColonia())
                && d.getCp().equals(direccion.getCp())) {
            return direccion;
        }
        return null;
    }

    public boolean modificar(Direccion d) {
        boolean modificada = false;
        if (d != null) {
            direccion = d;
            modificada = true;
        }
        return modificada;
    }

    public void verRegistro() {
        if (correoE != null) {
            System.out.println("Correo: " + correoE);
        }
        if (tarjeta != null) {
            System.out.println("Tarjeta: " + tarjeta);
        }
        if (telefono != null) {
            System.out.println("Telefono: " + telefono);
        }
        if (direccion != null) {
            System.out.println("Direccion: " + direccion);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.correoE);
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
        final RegistroArrendatario other = (RegistroArrendatario) obj;
        if (!Objects.equals(this.correoE, other.correoE)) {
            return false;
        }
        if (!Objects.equals(this.tarjeta, other.tarjeta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegistroUsuario{" + "correoE=" + correoE + ", tarjeta=" + tarjeta + '}';
    }

}
