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
@Table(name = "glo_tentrada_sucursal")
@NamedQueries({
    @NamedQuery(name = "GloTentradaSucursal.findAll", query = "SELECT g FROM GloTentradaSucursal g")})
public class GloTentradaSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tentsuc")
    private Integer idTentsuc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    @JoinColumn(name = "id_formato", referencedColumnName = "id_formato")
    @ManyToOne(optional = false)
    private DefFormato idFormato;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id_sucursal")
    @ManyToOne(optional = false)
    private GloSucursal idSucursal;
    @JoinColumn(name = "id_tipoEntrada", referencedColumnName = "id_tipoEntrada")
    @ManyToOne(optional = false)
    private DefTipoEntrada idtipoEntrada;

    public GloTentradaSucursal() {
    }

    public GloTentradaSucursal(Integer idTentsuc) {
        this.idTentsuc = idTentsuc;
    }

    public GloTentradaSucursal(Integer idTentsuc, BigDecimal precio) {
        this.idTentsuc = idTentsuc;
        this.precio = precio;
    }

    public Integer getIdTentsuc() {
        return idTentsuc;
    }

    public void setIdTentsuc(Integer idTentsuc) {
        this.idTentsuc = idTentsuc;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public DefFormato getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(DefFormato idFormato) {
        this.idFormato = idFormato;
    }

    public GloSucursal getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(GloSucursal idSucursal) {
        this.idSucursal = idSucursal;
    }

    public DefTipoEntrada getIdtipoEntrada() {
        return idtipoEntrada;
    }

    public void setIdtipoEntrada(DefTipoEntrada idtipoEntrada) {
        this.idtipoEntrada = idtipoEntrada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTentsuc != null ? idTentsuc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTentradaSucursal)) {
            return false;
        }
        GloTentradaSucursal other = (GloTentradaSucursal) object;
        if ((this.idTentsuc == null && other.idTentsuc != null) || (this.idTentsuc != null && !this.idTentsuc.equals(other.idTentsuc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloTentradaSucursal[ idTentsuc=" + idTentsuc + " ]";
    }
    
}
