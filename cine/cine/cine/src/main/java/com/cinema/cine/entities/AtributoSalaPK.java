/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.cine.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JL
 */
@Embeddable
public class AtributoSalaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_caracteristica", nullable = false)
    private int idCaracteristica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_sala", nullable = false)
    private int idSala;

    public AtributoSalaPK() {
    }

    public AtributoSalaPK(int idCaracteristica, int idSala) {
        this.idCaracteristica = idCaracteristica;
        this.idSala = idSala;
    }

    public int getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(int idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCaracteristica;
        hash += (int) idSala;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributoSalaPK)) {
            return false;
        }
        AtributoSalaPK other = (AtributoSalaPK) object;
        if (this.idCaracteristica != other.idCaracteristica) {
            return false;
        }
        if (this.idSala != other.idSala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cinema.cine.entities.AtributoSalaPK[ idCaracteristica=" + idCaracteristica + ", idSala=" + idSala + " ]";
    }
    
}
