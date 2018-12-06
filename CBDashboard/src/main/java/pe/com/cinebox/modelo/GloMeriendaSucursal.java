/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "glo_merienda_sucursal")
@NamedQueries({
    @NamedQuery(name = "GloMeriendaSucursal.findAll", query = "SELECT g FROM GloMeriendaSucursal g")})
public class GloMeriendaSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mersuc")
    private Integer idMersuc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    @JoinColumn(name = "id_merienda", referencedColumnName = "id_merienda")
    @ManyToOne(optional = false)
    private GloMerienda idMerienda;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id_sucursal")
    @ManyToOne(optional = false)
    private GloSucursal idSucursal;

    public GloMeriendaSucursal() {
    }

    public GloMeriendaSucursal(Integer idMersuc) {
        this.idMersuc = idMersuc;
    }

    public GloMeriendaSucursal(Integer idMersuc, BigDecimal precio) {
        this.idMersuc = idMersuc;
        this.precio = precio;
    }

    public Integer getIdMersuc() {
        return idMersuc;
    }

    public void setIdMersuc(Integer idMersuc) {
        this.idMersuc = idMersuc;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public GloMerienda getIdMerienda() {
        return idMerienda;
    }

    public void setIdMerienda(GloMerienda idMerienda) {
        this.idMerienda = idMerienda;
    }

    public GloSucursal getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(GloSucursal idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMersuc != null ? idMersuc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloMeriendaSucursal)) {
            return false;
        }
        GloMeriendaSucursal other = (GloMeriendaSucursal) object;
        if ((this.idMersuc == null && other.idMersuc != null) || (this.idMersuc != null && !this.idMersuc.equals(other.idMersuc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloMeriendaSucursal[ idMersuc=" + idMersuc + " ]";
    }
    
}
