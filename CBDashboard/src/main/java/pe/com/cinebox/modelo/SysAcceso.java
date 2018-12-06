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
@Table(name = "sys_acceso")
@NamedQueries({
    @NamedQuery(name = "SysAcceso.findAll", query = "SELECT s FROM SysAcceso s")})
public class SysAcceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso")
    private Integer idAcceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoSeguridad")
    private short codigoSeguridad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private Collection<SysAccesoPefil> sysAccesoPefilCollection;

    public SysAcceso() {
    }

    public SysAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public SysAcceso(Integer idAcceso, String nombre, short codigoSeguridad) {
        this.idAcceso = idAcceso;
        this.nombre = nombre;
        this.codigoSeguridad = codigoSeguridad;
    }

    public Integer getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(short codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
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
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAcceso)) {
            return false;
        }
        SysAcceso other = (SysAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.SysAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
