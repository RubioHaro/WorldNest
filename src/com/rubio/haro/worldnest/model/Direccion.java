
package com.rubio.haro.worldnest.model;

import java.util.Objects;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Direccion {
    private String calle;
    private String numeroExterior;
    private String numeroInterior;
    private String colonia;
    private String cp;
    private String municipio;
    private String estado;
    private String pais;
    
    public Direccion() {
        
    }

    public Direccion(String calle, String noExt, String noInt, String colonia, 
            String cp, String municipioDelegacion, String entidadFederativa, 
            String pais) {
        super();
        this.calle = calle;
        this.numeroExterior = noExt;
        this.numeroInterior = noInt;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipioDelegacion;
        this.estado = entidadFederativa;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoExt() {
        return numeroExterior;
    }

    public void setNoExt(String noExt) {
        this.numeroExterior = noExt;
    }

    public String getNoInt() {
        return numeroInterior;
    }

    public void setNoInt(String noInt) {
        this.numeroInterior = noInt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getMunicipioDelegacion() {
        return municipio;
    }

    public void setMunicipioDelegacion(String municipioDelegacion) {
        this.municipio = municipioDelegacion;
    }

    public String getEntidadFederativa() {
        return estado;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.estado = entidadFederativa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.calle);
        hash = 67 * hash + Objects.hashCode(this.numeroExterior);
        hash = 67 * hash + Objects.hashCode(this.numeroInterior);
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
        final Direccion other = (Direccion) obj;
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.numeroExterior, other.numeroExterior)) {
            return false;
        }
        if (!Objects.equals(this.numeroInterior, other.numeroInterior)) {
            return false;
        }
        if (!Objects.equals(this.colonia, other.colonia)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
    public void verDireccion() {
        System.out.println( this );
    }

    @Override
    public String toString() {
        return "Direccion " + 
                "\n Calle " + calle + 
                "\n No. Ext " + numeroExterior + ", No. Int " + numeroInterior + 
                "\n Colonia " + colonia + ", cp " + cp + 
                "\n Municipio / Delegacion " + municipio + 
                "\n entidadFederativa " + estado + 
                "\n pais " + pais + '\n';
    }
    
}
