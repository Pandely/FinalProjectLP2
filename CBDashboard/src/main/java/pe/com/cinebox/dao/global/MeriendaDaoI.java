package pe.com.cinebox.dao.global;

import java.util.List;
import pe.com.cinebox.modelo.GloMerienda;

/**
 *
 * @author Student
 */
public interface MeriendaDaoI {
    public List<GloMerienda> listarEntidad();
    public List<GloMerienda> listarEntidadDato(String dato);
    public GloMerienda buscarEntidadId(int id);
    public void guardarEntidad(GloMerienda entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloMerienda entidad);
}
