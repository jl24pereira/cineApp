/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.cine.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author JL
 */
@Entity
@Table(name = "boleto", catalog = "cinev2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Boleto.findAll", query = "SELECT b FROM Boleto b"),
    @NamedQuery(name = "Boleto.findByIdBoleto", query = "SELECT b FROM Boleto b WHERE b.idBoleto = :idBoleto"),
    @NamedQuery(name = "Boleto.findByPrecioBase", query = "SELECT b FROM Boleto b WHERE b.precioBase = :precioBase")})
public class Boleto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_boleto", nullable = false)
    private Integer idBoleto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_base", precision = 22)
    private Double precioBase;
    @JoinTable(name = "boleto_factura", joinColumns = {
        @JoinColumn(name = "id_boleto", referencedColumnName = "id_boleto", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_factura", referencedColumnName = "id_factura", nullable = false)})
    @ManyToMany
    private Collection<Factura> facturaCollection;
    @JoinColumn(name = "id_asiento", referencedColumnName = "id_asiento", nullable = false)
    @ManyToOne(optional = false)
    private AsientoSala idAsiento;
    @JoinColumn(name = "id_descuento", referencedColumnName = "id_descuento", nullable = false)
    @ManyToOne(optional = false)
    private Descuento idDescuento;
    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion", nullable = false)
    @ManyToOne(optional = false)
    private Funcion idFuncion;

    public Boleto() {
    }

    public Boleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    public AsientoSala getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(AsientoSala idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Descuento getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(Descuento idDescuento) {
        this.idDescuento = idDescuento;
    }

    public Funcion getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Funcion idFuncion) {
        this.idFuncion = idFuncion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoleto != null ? idBoleto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleto)) {
            return false;
        }
        Boleto other = (Boleto) object;
        if ((this.idBoleto == null && other.idBoleto != null) || (this.idBoleto != null && !this.idBoleto.equals(other.idBoleto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cinema.cine.entities.Boleto[ idBoleto=" + idBoleto + " ]";
    }
    
}
