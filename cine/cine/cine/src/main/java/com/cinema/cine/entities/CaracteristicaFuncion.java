/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.cine.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JL
 */
@Entity
@Table(name = "caracteristica_funcion", catalog = "cinev2", schema = "")
@NamedQueries({
    @NamedQuery(name = "CaracteristicaFuncion.findAll", query = "SELECT c FROM CaracteristicaFuncion c"),
    @NamedQuery(name = "CaracteristicaFuncion.findByIdCaracteristica", query = "SELECT c FROM CaracteristicaFuncion c WHERE c.idCaracteristica = :idCaracteristica"),
    @NamedQuery(name = "CaracteristicaFuncion.findByCaracteristica", query = "SELECT c FROM CaracteristicaFuncion c WHERE c.caracteristica = :caracteristica"),
    @NamedQuery(name = "CaracteristicaFuncion.findByDescripcion", query = "SELECT c FROM CaracteristicaFuncion c WHERE c.descripcion = :descripcion")})
public class CaracteristicaFuncion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caracteristica", nullable = false)
    private Integer idCaracteristica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "caracteristica", nullable = false, length = 300)
    private String caracteristica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caracteristicaFuncion")
    private Collection<AtributoFuncion> atributoFuncionCollection;

    public CaracteristicaFuncion() {
    }

    public CaracteristicaFuncion(Integer idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public CaracteristicaFuncion(Integer idCaracteristica, String caracteristica, String descripcion) {
        this.idCaracteristica = idCaracteristica;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public Integer getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Integer idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<AtributoFuncion> getAtributoFuncionCollection() {
        return atributoFuncionCollection;
    }

    public void setAtributoFuncionCollection(Collection<AtributoFuncion> atributoFuncionCollection) {
        this.atributoFuncionCollection = atributoFuncionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaracteristica != null ? idCaracteristica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracteristicaFuncion)) {
            return false;
        }
        CaracteristicaFuncion other = (CaracteristicaFuncion) object;
        if ((this.idCaracteristica == null && other.idCaracteristica != null) || (this.idCaracteristica != null && !this.idCaracteristica.equals(other.idCaracteristica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cinema.cine.entities.CaracteristicaFuncion[ idCaracteristica=" + idCaracteristica + " ]";
    }
    
}
