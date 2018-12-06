/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
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
@Table(name = "glo_funcion")
@NamedQueries({
    @NamedQuery(name = "GloFuncion.findAll", query = "SELECT g FROM GloFuncion g")})
public class GloFuncion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_funcion")
    private Integer idFuncion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "hora")
    private String hora;
    @Size(max = 5)
    @Column(name = "calidad")
    private String calidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 3)
    @Column(name = "idioma")
    private String idioma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncion")
    private Collection<VentBoleto> ventBoletoCollection;
    @JoinColumn(name = "id_formato", referencedColumnName = "id_formato")
    @ManyToOne(optional = false)
    private DefFormato idFormato;
    @JoinColumn(name = "id_pelicula", referencedColumnName = "id_pelicula")
    @ManyToOne(optional = false)
    private GloPelicula idPelicula;
    @JoinColumn(name = "id_sala", referencedColumnName = "id_sala")
    @ManyToOne(optional = false)
    private GloSala idSala;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id_sucursal")
    @ManyToOne(optional = false)
    private GloSucursal idSucursal;

    public GloFuncion() {
    }

    public GloFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public GloFuncion(Integer idFuncion, String hora, Date fecha) {
        this.idFuncion = idFuncion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Collection<VentBoleto> getVentBoletoCollection() {
        return ventBoletoCollection;
    }

    public void setVentBoletoCollection(Collection<VentBoleto> ventBoletoCollection) {
        this.ventBoletoCollection = ventBoletoCollection;
    }

    public DefFormato getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(DefFormato idFormato) {
        this.idFormato = idFormato;
    }

    public GloPelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(GloPelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    public GloSala getIdSala() {
        return idSala;
    }

    public void setIdSala(GloSala idSala) {
        this.idSala = idSala;
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
        hash += (idFuncion != null ? idFuncion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloFuncion)) {
            return false;
        }
        GloFuncion other = (GloFuncion) object;
        if ((this.idFuncion == null && other.idFuncion != null) || (this.idFuncion != null && !this.idFuncion.equals(other.idFuncion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloFuncion[ idFuncion=" + idFuncion + " ]";
    }
    
}
