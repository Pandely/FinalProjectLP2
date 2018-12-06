/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "glo_sucursal")
@NamedQueries({
    @NamedQuery(name = "GloSucursal.findAll", query = "SELECT g FROM GloSucursal g")})
public class GloSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sucursal")
    private Integer idSucursal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloTentradaSucursal> gloTentradaSucursalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloUsadmin> gloUsadminCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloSala> gloSalaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloCarteleraPelicula> gloCarteleraPeliculaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloFuncion> gloFuncionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<GloMeriendaSucursal> gloMeriendaSucursalCollection;
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad")
    @ManyToOne(optional = false)
    private DefCiudad idCiudad;

    public GloSucursal() {
    }

    public GloSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public GloSucursal(Integer idSucursal, String nombre, String direccion) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Collection<GloTentradaSucursal> getGloTentradaSucursalCollection() {
        return gloTentradaSucursalCollection;
    }

    public void setGloTentradaSucursalCollection(Collection<GloTentradaSucursal> gloTentradaSucursalCollection) {
        this.gloTentradaSucursalCollection = gloTentradaSucursalCollection;
    }

    public Collection<GloUsadmin> getGloUsadminCollection() {
        return gloUsadminCollection;
    }

    public void setGloUsadminCollection(Collection<GloUsadmin> gloUsadminCollection) {
        this.gloUsadminCollection = gloUsadminCollection;
    }

    public Collection<GloSala> getGloSalaCollection() {
        return gloSalaCollection;
    }

    public void setGloSalaCollection(Collection<GloSala> gloSalaCollection) {
        this.gloSalaCollection = gloSalaCollection;
    }

    public Collection<GloCarteleraPelicula> getGloCarteleraPeliculaCollection() {
        return gloCarteleraPeliculaCollection;
    }

    public void setGloCarteleraPeliculaCollection(Collection<GloCarteleraPelicula> gloCarteleraPeliculaCollection) {
        this.gloCarteleraPeliculaCollection = gloCarteleraPeliculaCollection;
    }

    public Collection<GloFuncion> getGloFuncionCollection() {
        return gloFuncionCollection;
    }

    public void setGloFuncionCollection(Collection<GloFuncion> gloFuncionCollection) {
        this.gloFuncionCollection = gloFuncionCollection;
    }

    public Collection<GloMeriendaSucursal> getGloMeriendaSucursalCollection() {
        return gloMeriendaSucursalCollection;
    }

    public void setGloMeriendaSucursalCollection(Collection<GloMeriendaSucursal> gloMeriendaSucursalCollection) {
        this.gloMeriendaSucursalCollection = gloMeriendaSucursalCollection;
    }

    public DefCiudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(DefCiudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSucursal != null ? idSucursal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloSucursal)) {
            return false;
        }
        GloSucursal other = (GloSucursal) object;
        if ((this.idSucursal == null && other.idSucursal != null) || (this.idSucursal != null && !this.idSucursal.equals(other.idSucursal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloSucursal[ idSucursal=" + idSucursal + " ]";
    }
    
}
