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
@Table(name = "sys_perfil")
@NamedQueries({
    @NamedQuery(name = "SysPerfil.findAll", query = "SELECT s FROM SysPerfil s")})
public class SysPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfil")
    private Collection<GloUscliente> gloUsclienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfil")
    private Collection<GloUsadmin> gloUsadminCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfil")
    private Collection<SysAccesoPefil> sysAccesoPefilCollection;

    public SysPerfil() {
    }

    public SysPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public SysPerfil(Integer idPerfil, String nombre, String descripcion) {
        this.idPerfil = idPerfil;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
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

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Collection<GloUscliente> getGloUsclienteCollection() {
        return gloUsclienteCollection;
    }

    public void setGloUsclienteCollection(Collection<GloUscliente> gloUsclienteCollection) {
        this.gloUsclienteCollection = gloUsclienteCollection;
    }

    public Collection<GloUsadmin> getGloUsadminCollection() {
        return gloUsadminCollection;
    }

    public void setGloUsadminCollection(Collection<GloUsadmin> gloUsadminCollection) {
        this.gloUsadminCollection = gloUsadminCollection;
    }

    public Collection<SysAccesoPefil> getSysAccesoPefilCollection() {
        return sysAccesoPefilCollection;
    }

    public void setSysAccesoPefilCollection(Collection<SysAccesoPefil> sysAccesoPefilCollection) {
        this.sysAccesoPefilCollection = sysAccesoPefilCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfil != null ? idPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysPerfil)) {
            return false;
        }
        SysPerfil other = (SysPerfil) object;
        if ((this.idPerfil == null && other.idPerfil != null) || (this.idPerfil != null && !this.idPerfil.equals(other.idPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.SysPerfil[ idPerfil=" + idPerfil + " ]";
    }
    
}
