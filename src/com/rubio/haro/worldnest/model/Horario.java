package com.rubio.haro.worldnest.model;

import java.util.Objects;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Horario {
    private String hora;
    private String fecha;

    public Horario() {
        this("14:00", "20/05/20");
    }

    public Horario(String hora, String fecha) {
        super();
        this.hora = hora;
        this.fecha = fecha;
    }

    public void setHorario(String hora, String fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass() != obj.getClass())
            return true;

        final Horario other = (Horario) obj;
        if (Objects.equals(this.hora, other.hora) && Objects.equals(this.fecha, other.fecha))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Horario " + "\n Hora " + hora + "\n Fecha " + fecha + '\n';
    }

}
