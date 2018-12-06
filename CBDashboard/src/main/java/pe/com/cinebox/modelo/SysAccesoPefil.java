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

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "sys_acceso_pefil")
@NamedQueries({
    @NamedQuery(name = "SysAccesoPefil.findAll", query = "SELECT s FROM SysAccesoPefil s")})
public class SysAccesoPefil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso_perfil")
    private Integer idAccesoPerfil;
    @JoinColumn(name = "id_acceso", referencedColumnName = "id_acceso")
    @ManyToOne(optional = false)
    private SysAcceso idAcceso;
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
    @ManyToOne(optional = false)
    private SysPerfil idPerfil;

    public SysAccesoPefil() {
    }

    public SysAccesoPefil(Integer idAccesoPerfil) {
        this.idAccesoPerfil = idAccesoPerfil;
    }

    public Integer getIdAccesoPerfil() {
        return idAccesoPerfil;
    }

    public void setIdAccesoPerfil(Integer idAccesoPerfil) {
        this.idAccesoPerfil = idAccesoPerfil;
    }

    public SysAcceso getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(SysAcceso idAcceso) {
        this.idAcceso = idAcceso;
    }

    public SysPerfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(SysPerfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccesoPerfil != null ? idAccesoPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAccesoPefil)) {
            return false;
        }
        SysAccesoPefil other = (SysAccesoPefil) object;
        if ((this.idAccesoPerfil == null && other.idAccesoPerfil != null) || (this.idAccesoPerfil != null && !this.idAccesoPerfil.equals(other.idAccesoPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.SysAccesoPefil[ idAccesoPerfil=" + idAccesoPerfil + " ]";
    }
    
}
