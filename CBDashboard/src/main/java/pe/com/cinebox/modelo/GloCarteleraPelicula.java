/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "glo_cartelera_pelicula")
@NamedQueries({
    @NamedQuery(name = "GloCarteleraPelicula.findAll", query = "SELECT g FROM GloCarteleraPelicula g")})
public class GloCarteleraPelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carteleraPelicula")
    private Integer idcarteleraPelicula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "id_pelicula", referencedColumnName = "id_pelicula")
    @ManyToOne(optional = false)
    private GloPelicula idPelicula;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id_sucursal")
    @ManyToOne(optional = false)
    private GloSucursal idSucursal;

    public GloCarteleraPelicula() {
    }

    public GloCarteleraPelicula(Integer idcarteleraPelicula) {
        this.idcarteleraPelicula = idcarteleraPelicula;
    }

    public GloCarteleraPelicula(Integer idcarteleraPelicula, Date fechaInicio, Date fechaFin) {
        this.idcarteleraPelicula = idcarteleraPelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdcarteleraPelicula() {
        return idcarteleraPelicula;
    }

    public void setIdcarteleraPelicula(Integer idcarteleraPelicula) {
        this.idcarteleraPelicula = idcarteleraPelicula;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public GloPelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(GloPelicula idPelicula) {
        this.idPelicula = idPelicula;
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
        hash += (idcarteleraPelicula != null ? idcarteleraPelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloCarteleraPelicula)) {
            return false;
        }
        GloCarteleraPelicula other = (GloCarteleraPelicula) object;
        if ((this.idcarteleraPelicula == null && other.idcarteleraPelicula != null) || (this.idcarteleraPelicula != null && !this.idcarteleraPelicula.equals(other.idcarteleraPelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloCarteleraPelicula[ idcarteleraPelicula=" + idcarteleraPelicula + " ]";
    }
    
}
