package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloPelicula;

/**
 *
 * @author Student
 */
public interface PeliculaServicioI {
    public List<GloPelicula> listarEntidad();
    public List<GloPelicula> listarEntidadDato(String dato);
    public List<GloPelicula> getCarteleraSede(int dato);
    public GloPelicula buscarEntidadId(int id);
    public void guardarEntidad(GloPelicula entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloPelicula entidad);
}
