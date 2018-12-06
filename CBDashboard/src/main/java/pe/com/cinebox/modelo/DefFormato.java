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
@Table(name = "def_formato")
@NamedQueries({
    @NamedQuery(name = "DefFormato.findAll", query = "SELECT d FROM DefFormato d")})
public class DefFormato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_formato")
    private Integer idFormato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFormato")
    private Collection<GloTentradaSucursal> gloTentradaSucursalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFormato")
    private Collection<GloSala> gloSalaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFormato")
    private Collection<GloFuncion> gloFuncionCollection;

    public DefFormato() {
    }

    public DefFormato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    public DefFormato(Integer idFormato, String nombre) {
        this.idFormato = idFormato;
        this.nombre = nombre;
    }

    public Integer getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<GloTentradaSucursal> getGloTentradaSucursalCollection() {
        return gloTentradaSucursalCollection;
    }

    public void setGloTentradaSucursalCollection(Collection<GloTentradaSucursal> gloTentradaSucursalCollection) {
        this.gloTentradaSucursalCollection = gloTentradaSucursalCollection;
    }

    public Collection<GloSala> getGloSalaCollection() {
        return gloSalaCollection;
    }

    public void setGloSalaCollection(Collection<GloSala> gloSalaCollection) {
        this.gloSalaCollection = gloSalaCollection;
    }

    public Collection<GloFuncion> getGloFuncionCollection() {
        return gloFuncionCollection;
    }

    public void setGloFuncionCollection(Collection<GloFuncion> gloFuncionCollection) {
        this.gloFuncionCollection = gloFuncionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormato != null ? idFormato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefFormato)) {
            return false;
        }
        DefFormato other = (DefFormato) object;
        if ((this.idFormato == null && other.idFormato != null) || (this.idFormato != null && !this.idFormato.equals(other.idFormato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.DefFormato[ idFormato=" + idFormato + " ]";
    }
    
}
