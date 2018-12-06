package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloCarteleraPelicula;

/**
 *
 * @author HEBERT
 */
public interface CartelerapeliculaServicioI {
    //public List<GloCarteleraPelicula> listarEntidad();
    public List<GloCarteleraPelicula> listarEntidadDato(String dato);
    //public GloCarteleraPelicula buscarEntidadId(int id);
    public void guardarEntidad(GloCarteleraPelicula entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloCarteleraPelicula entidad);
}
