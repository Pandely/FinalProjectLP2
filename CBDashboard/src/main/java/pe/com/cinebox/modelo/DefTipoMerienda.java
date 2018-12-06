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
@Table(name = "def_tipo_merienda")
@NamedQueries({
    @NamedQuery(name = "DefTipoMerienda.findAll", query = "SELECT d FROM DefTipoMerienda d")})
public class DefTipoMerienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tmerienda")
    private Integer idTmerienda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTmerienda")
    private Collection<GloMerienda> gloMeriendaCollection;

    public DefTipoMerienda() {
    }

    public DefTipoMerienda(Integer idTmerienda) {
        this.idTmerienda = idTmerienda;
    }

    public DefTipoMerienda(Integer idTmerienda, String nombre) {
        this.idTmerienda = idTmerienda;
        this.nombre = nombre;
    }

    public Integer getIdTmerienda() {
        return idTmerienda;
    }

    public void setIdTmerienda(Integer idTmerienda) {
        this.idTmerienda = idTmerienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<GloMerienda> getGloMeriendaCollection() {
        return gloMeriendaCollection;
    }

    public void setGloMeriendaCollection(Collection<GloMerienda> gloMeriendaCollection) {
        this.gloMeriendaCollection = gloMeriendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTmerienda != null ? idTmerienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefTipoMerienda)) {
            return false;
        }
        DefTipoMerienda other = (DefTipoMerienda) object;
        if ((this.idTmerienda == null && other.idTmerienda != null) || (this.idTmerienda != null && !this.idTmerienda.equals(other.idTmerienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.DefTipoMerienda[ idTmerienda=" + idTmerienda + " ]";
    }
    
}
