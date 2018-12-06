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
@Table(name = "def_tipo_entrada")
@NamedQueries({
    @NamedQuery(name = "DefTipoEntrada.findAll", query = "SELECT d FROM DefTipoEntrada d")})
public class DefTipoEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoEntrada")
    private Integer idtipoEntrada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoEntrada")
    private Collection<GloTentradaSucursal> gloTentradaSucursalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoEntrada")
    private Collection<VentBoletoTentrada> ventBoletoTentradaCollection;

    public DefTipoEntrada() {
    }

    public DefTipoEntrada(Integer idtipoEntrada) {
        this.idtipoEntrada = idtipoEntrada;
    }

    public DefTipoEntrada(Integer idtipoEntrada, String nombre, String descripcion) {
        this.idtipoEntrada = idtipoEntrada;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdtipoEntrada() {
        return idtipoEntrada;
    }

    public void setIdtipoEntrada(Integer idtipoEntrada) {
        this.idtipoEntrada = idtipoEntrada;
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

    public Collection<GloTentradaSucursal> getGloTentradaSucursalCollection() {
        return gloTentradaSucursalCollection;
    }

    public void setGloTentradaSucursalCollection(Collection<GloTentradaSucursal> gloTentradaSucursalCollection) {
        this.gloTentradaSucursalCollection = gloTentradaSucursalCollection;
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
        hash += (idtipoEntrada != null ? idtipoEntrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefTipoEntrada)) {
            return false;
        }
        DefTipoEntrada other = (DefTipoEntrada) object;
        if ((this.idtipoEntrada == null && other.idtipoEntrada != null) || (this.idtipoEntrada != null && !this.idtipoEntrada.equals(other.idtipoEntrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.DefTipoEntrada[ idtipoEntrada=" + idtipoEntrada + " ]";
    }
    
}
