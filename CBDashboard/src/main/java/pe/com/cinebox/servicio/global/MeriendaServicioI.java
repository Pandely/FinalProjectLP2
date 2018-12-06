package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloMerienda;

/**
 *
 * @author HEBERT
 */
public interface MeriendaServicioI {
    public List<GloMerienda> listarEntidad();
    public List<GloMerienda> listarEntidadDato(String dato);
    public GloMerienda buscarEntidadId(int id);
    public void guardarEntidad(GloMerienda entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloMerienda entidad);
}
