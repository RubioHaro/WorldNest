
package com.rubio.haro.worldnest.model;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Reservacion {
    private String claveReservacion;
    private Arrendador arrendador;
    private Arrendatario arrendatario;
    private RegistroTarjeta tarjeta;

    public Reservacion() {
        this( new Random().toString()  );
    }

    public Reservacion(String claveReservacion) {
        super();
        this.claveReservacion = claveReservacion;
    }
    public Reservacion( Reservacion reservacion ) {
        this( reservacion.claveReservacion  );
    }
    
    
    public void adicionarTerjeta( RegistroTarjeta tarjeta ) {
        this.tarjeta = tarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.claveReservacion);
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
        final Reservacion other = (Reservacion) obj;
        if (!Objects.equals(this.claveReservacion, other.claveReservacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "claveReservacion=" + claveReservacion + ", tarjeta=" + tarjeta + '}';
    }

    
    
}
