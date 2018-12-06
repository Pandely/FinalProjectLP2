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

/**
 *
 * @author HEBERT
 */
@Entity
@Table(name = "glo_sala")
@NamedQueries({
    @NamedQuery(name = "GloSala.findAll", query = "SELECT g FROM GloSala g")})
public class GloSala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sala")
    private Integer idSala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private short numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private long capacidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nFilas")
    private short nFilas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nColumnas")
    private short nColumnas;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id_sucursal")
    @ManyToOne(optional = false)
    private GloSucursal idSucursal;
    @JoinColumn(name = "id_formato", referencedColumnName = "id_formato")
    @ManyToOne(optional = false)
    private DefFormato idFormato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSala")
    private Collection<GloFuncion> gloFuncionCollection;

    public GloSala() {
    }

    public GloSala(Integer idSala) {
        this.idSala = idSala;
    }

    public GloSala(Integer idSala, short numero, long capacidad, short nFilas, short nColumnas) {
        this.idSala = idSala;
        this.numero = numero;
        this.capacidad = capacidad;
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }

    public short getNFilas() {
        return nFilas;
    }

    public void setNFilas(short nFilas) {
        this.nFilas = nFilas;
    }

    public short getNColumnas() {
        return nColumnas;
    }

    public void setNColumnas(short nColumnas) {
        this.nColumnas = nColumnas;
    }

    public GloSucursal getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(GloSucursal idSucursal) {
        this.idSucursal = idSucursal;
    }

    public DefFormato getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(DefFormato idFormato) {
        this.idFormato = idFormato;
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
        hash += (idSala != null ? idSala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloSala)) {
            return false;
        }
        GloSala other = (GloSala) object;
        if ((this.idSala == null && other.idSala != null) || (this.idSala != null && !this.idSala.equals(other.idSala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloSala[ idSala=" + idSala + " ]";
    }
    
}
