package com.rubio.haro.worldnest.model;

import java.util.LinkedList;


public class RegistroTarjeta {
    private String numeroTarjeta;
    private String cvv;
    private String fechaVencimiento;
    private String expedidor;
    private LinkedList<Reservacion> reservaciones;

    public RegistroTarjeta() {
        this("XXXXXXXXXXXXXXXX", "CCC", "12/18", "Master card");
    }

    public RegistroTarjeta(String numeroTarjeta, String cvv, String fechaVencimiento, String expedidor) {
        super();
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.expedidor = expedidor;
        reservaciones = new LinkedList<>();
    }

    public RegistroTarjeta(RegistroTarjeta unaTarjeta) {
        this(unaTarjeta.numeroTarjeta, unaTarjeta.cvv, unaTarjeta.fechaVencimiento, unaTarjeta.expedidor);
    }

    public void setRegistroTarjeta(String numeroTarjeta, String cvv, String fechaVencimiento, String expedidor) {
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.expedidor = expedidor;
    }

    public void adicionarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }

    public void verReservaciones() {
        for (Reservacion r : reservaciones) {
            System.out.println(r + "\n");
        }
    }
}