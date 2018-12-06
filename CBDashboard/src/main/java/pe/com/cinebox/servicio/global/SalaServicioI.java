package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloSala;

/**
 *
 * @author hebertcb
 */
public interface SalaServicioI {
    //public List<GloSala> listarEntidad();
    public List<GloSala> listarEntidadDato(String dato);
    public GloSala buscarEntidadId(int id);
    public void guardarEntidad(GloSala entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloSala entidad);
}
