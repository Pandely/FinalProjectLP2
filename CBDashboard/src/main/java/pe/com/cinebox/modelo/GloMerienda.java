/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "glo_merienda")
@NamedQueries({
    @NamedQuery(name = "GloMerienda.findAll", query = "SELECT g FROM GloMerienda g")})
public class GloMerienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_merienda")
    private Integer idMerienda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "imagenRuta")
    private String imagenRuta;
    @JoinColumn(name = "id_tmerienda", referencedColumnName = "id_tmerienda")
    @ManyToOne(optional = false)
    private DefTipoMerienda idTmerienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMerienda")
    private Collection<GloMeriendaSucursal> gloMeriendaSucursalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMerienda")
    private Collection<VentBoletoMerienda> ventBoletoMeriendaCollection;

    public GloMerienda() {
    }

    public GloMerienda(Integer idMerienda) {
        this.idMerienda = idMerienda;
    }

    public GloMerienda(Integer idMerienda, String nombre, String descripcion, String imagenRuta) {
        this.idMerienda = idMerienda;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenRuta = imagenRuta;
    }

    public Integer getIdMerienda() {
        return idMerienda;
    }

    public void setIdMerienda(Integer idMerienda) {
        this.idMerienda = idMerienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenRuta() {
        return imagenRuta;
    }

    public void setImagenRuta(String imagenRuta) {
        this.imagenRuta = imagenRuta;
    }

    public DefTipoMerienda getIdTmerienda() {
        return idTmerienda;
    }

    public void setIdTmerienda(DefTipoMerienda idTmerienda) {
        this.idTmerienda = idTmerienda;
    }

    public Collection<GloMeriendaSucursal> getGloMeriendaSucursalCollection() {
        return gloMeriendaSucursalCollection;
    }

    public void setGloMeriendaSucursalCollection(Collection<GloMeriendaSucursal> gloMeriendaSucursalCollection) {
        this.gloMeriendaSucursalCollection = gloMeriendaSucursalCollection;
    }

    public Collection<VentBoletoMerienda> getVentBoletoMeriendaCollection() {
        return ventBoletoMeriendaCollection;
    }

    public void setVentBoletoMeriendaCollection(Collection<VentBoletoMerienda> ventBoletoMeriendaCollection) {
        this.ventBoletoMeriendaCollection = ventBoletoMeriendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMerienda != null ? idMerienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloMerienda)) {
            return false;
        }
        GloMerienda other = (GloMerienda) object;
        if ((this.idMerienda == null && other.idMerienda != null) || (this.idMerienda != null && !this.idMerienda.equals(other.idMerienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloMerienda[ idMerienda=" + idMerienda + " ]";
    }
    
}
