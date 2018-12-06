/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
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
@Table(name = "vent_boleto_merienda")
@NamedQueries({
    @NamedQuery(name = "VentBoletoMerienda.findAll", query = "SELECT v FROM VentBoletoMerienda v")})
public class VentBoletoMerienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_boletoMerienda")
    private Integer idboletoMerienda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private short cantidad;
    @JoinColumn(name = "id_boleto", referencedColumnName = "id_boleto")
    @ManyToOne(optional = false)
    private VentBoleto idBoleto;
    @JoinColumn(name = "id_merienda", referencedColumnName = "id_merienda")
    @ManyToOne(optional = false)
    private GloMerienda idMerienda;

    public VentBoletoMerienda() {
    }

    public VentBoletoMerienda(Integer idboletoMerienda) {
        this.idboletoMerienda = idboletoMerienda;
    }

    public VentBoletoMerienda(Integer idboletoMerienda, short cantidad) {
        this.idboletoMerienda = idboletoMerienda;
        this.cantidad = cantidad;
    }

    public Integer getIdboletoMerienda() {
        return idboletoMerienda;
    }

    public void setIdboletoMerienda(Integer idboletoMerienda) {
        this.idboletoMerienda = idboletoMerienda;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public VentBoleto getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(VentBoleto idBoleto) {
        this.idBoleto = idBoleto;
    }

    public GloMerienda getIdMerienda() {
        return idMerienda;
    }

    public void setIdMerienda(GloMerienda idMerienda) {
        this.idMerienda = idMerienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idboletoMerienda != null ? idboletoMerienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentBoletoMerienda)) {
            return false;
        }
        VentBoletoMerienda other = (VentBoletoMerienda) object;
        if ((this.idboletoMerienda == null && other.idboletoMerienda != null) || (this.idboletoMerienda != null && !this.idboletoMerienda.equals(other.idboletoMerienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.VentBoletoMerienda[ idboletoMerienda=" + idboletoMerienda + " ]";
    }
    
}
