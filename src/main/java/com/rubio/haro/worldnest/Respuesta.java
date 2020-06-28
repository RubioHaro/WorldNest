package com.rubio.haro.worldnest;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Respuesta {

    private boolean estado;
    private String mensaje;

    public Respuesta() {
        estado = false;
        mensaje = "mensaje sin iniciar";
    }

    public Respuesta(boolean estado, String mensaje) {
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean getEstado() {
        return estado;
    }

}
