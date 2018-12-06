/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "vent_boleto")
@NamedQueries({
    @NamedQuery(name = "VentBoleto.findAll", query = "SELECT v FROM VentBoleto v")})
public class VentBoleto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_boleto")
    private Integer idBoleto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "serie")
    private String serie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantEntrada")
    private short cantEntrada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nbutacas")
    private String nbutacas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asistencia")
    private boolean asistencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigoqr")
    private String codigoqr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaVenc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenc;
    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne(optional = false)
    private GloFuncion idFuncion;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private GloUscliente idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBoleto")
    private Collection<VentBoletoMerienda> ventBoletoMeriendaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBoleto")
    private Collection<VentBoletoTentrada> ventBoletoTentradaCollection;

    public VentBoleto() {
    }

    public VentBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public VentBoleto(Integer idBoleto, BigDecimal total, String serie, Date fechaHora, short cantEntrada, String nbutacas, boolean asistencia, String codigoqr, Date fechaVenc) {
        this.idBoleto = idBoleto;
        this.total = total;
        this.serie = serie;
        this.fechaHora = fechaHora;
        this.cantEntrada = cantEntrada;
        this.nbutacas = nbutacas;
        this.asistencia = asistencia;
        this.codigoqr = codigoqr;
        this.fechaVenc = fechaVenc;
    }

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public short getCantEntrada() {
        return cantEntrada;
    }

    public void setCantEntrada(short cantEntrada) {
        this.cantEntrada = cantEntrada;
    }

    public String getNbutacas() {
        return nbutacas;
    }

    public void setNbutacas(String nbutacas) {
        this.nbutacas = nbutacas;
    }

    public boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getCodigoqr() {
        return codigoqr;
    }

    public void setCodigoqr(String codigoqr) {
        this.codigoqr = codigoqr;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public GloFuncion getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(GloFuncion idFuncion) {
        this.idFuncion = idFuncion;
    }

    public GloUscliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(GloUscliente idCliente) {
        this.idCliente = idCliente;
    }

    public Collection<VentBoletoMerienda> getVentBoletoMeriendaCollection() {
        return ventBoletoMeriendaCollection;
    }

    public void setVentBoletoMeriendaCollection(Collection<VentBoletoMerienda> ventBoletoMeriendaCollection) {
        this.ventBoletoMeriendaCollection = ventBoletoMeriendaCollection;
    }

    public Collection<VentBoletoTentrada> getVentBoletoTentradaCollection() {
        return ventBoletoTentradaCollection;
    }

    public void setVentBoletoTentradaCollection(Collection<VentBoletoTentrada> ventBoletoTentradaCollection) {
        this.ventBoletoTentradaCollection = ventBoletoTentradaCollection;
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
        if (!(object instanceof VentBoleto)) {
            return false;
        }
        VentBoleto other = (VentBoleto) object;
        if ((this.idBoleto == null && other.idBoleto != null) || (this.idBoleto != null && !this.idBoleto.equals(other.idBoleto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.VentBoleto[ idBoleto=" + idBoleto + " ]";
    }
    
}
