package com.rubio.haro.worldnest.dao;

import com.rubio.haro.worldnest.model.Arrendatario;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
@Entity
@Table(name = "Arrendatario")
public class EntidadArrendatario {

    @Id
    @Column(name = "eid")
    private long eid;
    @Column(name = "enombre")
    private String enombre;
    @Column(name = "edireccion")
    private String edireccion;
    @Column(name = "etelefono")
    private String etelefono;

    public EntidadArrendatario() {
    }

    public EntidadArrendatario(int eid) {
        this.eid = eid;
    }

    public EntidadArrendatario(long eid, String enombre, String edireccion, String etelefono) {
        this.eid = eid;
        this.enombre = enombre;
        this.edireccion = edireccion;
        this.etelefono = etelefono;
    }

    public EntidadArrendatario(int id, Arrendatario arrendatario) {
        this.eid = eid;
        this.enombre = arrendatario.getNombre();
        this.edireccion = arrendatario.getDireccion();
        this.etelefono = arrendatario.getTelefono();
    }

    public void setEdireccion(String edireccion) {
        this.edireccion = edireccion;
    }

    public String getEdireccion() {
        return edireccion;
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public Arrendatario getArrendatario() {
        return new Arrendatario(enombre, edireccion, etelefono);
    }

    public String getEnombre() {
        return enombre;
    }

    public void setEnombre(String enombre) {
        this.enombre = enombre;
    }

    public String getEtelefono() {
        return etelefono;
    }

    public void setEtelefono(String etelefono) {
        this.etelefono = etelefono;
    }

    @Override
    public String toString() {
        return "EntidadArrendatario{" + "eid=" + eid + ", enombre=" + enombre + ", etelefono=" + etelefono + ", edireccion=" + edireccion + '}';

    }

}
