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
@Table(name = "glo_pelicula")
@NamedQueries({
    @NamedQuery(name = "GloPelicula.findAll", query = "SELECT g FROM GloPelicula g")})
public class GloPelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pelicula")
    private Integer idPelicula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "duracion")
    private Short duracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "sinopsis")
    private String sinopsis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "imagenRuta")
    private String imagenRuta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "reparto")
    private String reparto;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)  @JsonIgnore
    private DefCategoria idCategoria;
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @ManyToOne(optional = false)  @JsonIgnore
    private DefGenero idGenero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPelicula")  @JsonIgnore
    private Collection<GloCarteleraPelicula> gloCarteleraPeliculaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPelicula")  @JsonIgnore
    private Collection<GloFuncion> gloFuncionCollection;

    public GloPelicula() {
    }

    public GloPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public GloPelicula(Integer idPelicula, String titulo, String codigo, String director, String sinopsis, String imagenRuta, String reparto) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.codigo = codigo;
        this.director = director;
        this.sinopsis = sinopsis;
        this.imagenRuta = imagenRuta;
        this.reparto = reparto;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getImagenRuta() {
        return imagenRuta;
    }

    public void setImagenRuta(String imagenRuta) {
        this.imagenRuta = imagenRuta;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public DefCategoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(DefCategoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public DefGenero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(DefGenero idGenero) {
        this.idGenero = idGenero;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelicula != null ? idPelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloPelicula)) {
            return false;
        }
        GloPelicula other = (GloPelicula) object;
        if ((this.idPelicula == null && other.idPelicula != null) || (this.idPelicula != null && !this.idPelicula.equals(other.idPelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.cinebox.modelo.GloPelicula[ idPelicula=" + idPelicula + " ]";
    }
    
}
