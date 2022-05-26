package com.rubio.haro.worldnest.dao;

import com.rubio.haro.worldnest.model.Empleado;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
@Entity
@Table(name = "Empleado")
public class EntidadEmpleado {

    @Id
    @Column(name = "EID")
    private long eid;
    @Column(name = "ENOMBRE")
    private String enombre;
    @Column(name = "ESALARIO")
    private double esalario;
    @Column(name = "EGRADO")
    private String egrado;

    public EntidadEmpleado() {
    }

    public EntidadEmpleado(int eid) {
        this.eid = eid;
    }

    public EntidadEmpleado(int eid, Empleado empleado) {
        this.eid = eid;
        enombre = empleado.getNombre();
        esalario = empleado.getSalario();
        egrado = empleado.getGrado();
    }

    public EntidadEmpleado(Empleado empleado) {
        enombre = empleado.getNombre();
        esalario = empleado.getSalario();
        egrado = empleado.getGrado();
    }

    public Empleado getEmpleado() {
        return new Empleado(enombre, esalario, egrado);
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public String getEnombre() {
        return enombre;
    }

    public void setEnombre(String enombre) {
        this.enombre = enombre;
    }

    public double getEsalario() {
        return esalario;
    }

    public void setEsalario(double esalario) {
        this.esalario = esalario;
    }

    public String getEgrado() {
        return egrado;
    }

    public void setEgrado(String egrado) {
        this.egrado = egrado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "eid=" + eid + ", enombre=" + enombre + ", esalario=" + esalario + ", egrado=" + egrado + '}';
    }

}
