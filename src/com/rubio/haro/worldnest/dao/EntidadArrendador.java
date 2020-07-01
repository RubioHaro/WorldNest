package com.rubio.haro.worldnest.dao;

import com.rubio.haro.worldnest.model.Arrendador;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
@Entity
@Table(name = "Arrendador")
public class EntidadArrendador {

    @Id
    @Column(name = "eid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eid;
    @Column(name = "enombre")
    private String enombre;
    @Column(name = "edireccion")
    private String edireccion;
    @Column(name = "etelefono")
    private String etelefono;
    @Column(name = "epassword")
    private String epassword;

    public EntidadArrendador() {
    }

    public EntidadArrendador(int eid) {
        this.eid = eid;
    }

    public EntidadArrendador(String enombre, String edireccion, String etelefono) {
        this.epassword = "WNP-" + enombre + edireccion + etelefono;
        this.enombre = enombre;
        this.edireccion = edireccion;
        this.etelefono = etelefono;
    }

    public EntidadArrendador(Arrendador arrendador) {
        this.enombre = arrendador.getNombre();
        this.edireccion = arrendador.getDireccion();
        this.etelefono = arrendador.getTelefono();
        this.epassword = new String(arrendador.getPassword());
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

    public Arrendador getArrendador() {
        return new Arrendador(enombre, edireccion, etelefono);
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
        return "EntidadArrendador{" + "eid=" + eid + ", enombre=" + enombre + ", etelefono=" + etelefono + ", edireccion=" + edireccion + '}';
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public boolean login(String password) {
        return this.epassword.equals(password);
    }
}
