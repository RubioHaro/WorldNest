package com.rubio.haro.worldnest.dao;

import com.rubio.haro.worldnest.model.Arrendatario;
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
@Table(name = "Arrendatario")
public class EntidadArrendatario {

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

    public EntidadArrendatario() {
    }

    public EntidadArrendatario(int eid) {
        this.eid = eid;
    }

    public EntidadArrendatario(String enombre, String edireccion, String etelefono) {
        this.epassword = "WNP-" + enombre + edireccion + etelefono;
        this.enombre = enombre;
        this.edireccion = edireccion;
        this.etelefono = etelefono;
    }

    public EntidadArrendatario(Arrendatario arrendatario) {
        this.enombre = arrendatario.getNombre();
        this.edireccion = arrendatario.getDireccion();
        this.etelefono = arrendatario.getTelefono();
        this.epassword = new String(arrendatario.getPassword());
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

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public boolean login(String password) {
        return this.epassword.equals(password);
    }
}
