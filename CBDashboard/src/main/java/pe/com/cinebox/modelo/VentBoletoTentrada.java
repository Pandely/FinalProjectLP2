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
@Table(name = "vent_boleto_tentrada")
@NamedQueries({
    @NamedQuery(name = "VentBoletoTentrada.findAll", query = "SELECT v FROM VentBoletoTentrada v")})
public class VentBoletoTentrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_boletoTentrada")
    private Integer idboletoTentrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioUnitario")
    private BigDecimal precioUnitario;
    @JoinColumn(name = "id_boleto", referencedColumnName = "id_boleto")
    @ManyToOne(optional = false)
    private VentBoleto idBoleto;
    @JoinColumn(name = "id_tipoEntrada", referencedColumnName = "id_tipoEntrada")
    @ManyToOne(optional = false)
    private DefTipoEntrada idtipoEntrada;

    public VentBoletoTentrada() {
    }

    public VentBoletoTentrada(Integer idboletoTentrada) {
        this.idboletoTentrada = idboletoTentrada;
    }

    public VentBoletoTentrada(Integer idboletoTentrada, BigDecimal precioUnitario) {
        this.idboletoTentrada = idboletoTentrada;
        this.precioUnitario = precioUnitario;
    }

    public Integer getIdboletoTentrada() {
        return idboletoTentrada;
    }

    public void setIdboletoTentrada(Integer idboletoTentrada) {
        this.idboletoTentrada = idboletoTentrada;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public VentBoleto getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(VentBoleto idBoleto) {
        this.idBoleto = idBoleto;
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
        hash += (idboletoTentrada != null ? idboletoTentrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentBoletoTentrada)) {
            return false;
        }
        VentBoletoTentrada other = (VentBoletoTentrada) object;
        if ((this.idboletoTentrada == null && other.idboletoTentrada != null) || (this.idboletoTentrada != null && !this.idboletoTentrada.equals(other.idboletoTentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.VentBoletoTentrada[ idboletoTentrada=" + idboletoTentrada + " ]";
    }
    
}
