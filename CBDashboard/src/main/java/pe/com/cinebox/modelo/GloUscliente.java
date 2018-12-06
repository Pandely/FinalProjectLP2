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
@Table(name = "glo_uscliente")
@NamedQueries({
    @NamedQuery(name = "GloUscliente.findAll", query = "SELECT g FROM GloUscliente g")})
public class GloUscliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apPaterno")
    private String apPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaNac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Column(name = "ncelular")
    private Long ncelular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<VentBoleto> ventBoletoCollection;
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
    @ManyToOne(optional = false)
    private SysPerfil idPerfil;

    public GloUscliente() {
    }

    public GloUscliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public GloUscliente(Integer idCliente, String codigo, String nombre, String apPaterno, String genero, Date fechaNac, String email, String password) {
        this.idCliente = idCliente;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.email = email;
        this.password = password;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Long getNcelular() {
        return ncelular;
    }

    public void setNcelular(Long ncelular) {
        this.ncelular = ncelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<VentBoleto> getVentBoletoCollection() {
        return ventBoletoCollection;
    }

    public void setVentBoletoCollection(Collection<VentBoleto> ventBoletoCollection) {
        this.ventBoletoCollection = ventBoletoCollection;
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
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloUscliente)) {
            return false;
        }
        GloUscliente other = (GloUscliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloUscliente[ idCliente=" + idCliente + " ]";
    }
    
}
