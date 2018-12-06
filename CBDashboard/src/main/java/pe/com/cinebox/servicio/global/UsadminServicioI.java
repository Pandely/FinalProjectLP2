package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloUsadmin;

public interface UsadminServicioI {
    public List<GloUsadmin> listarEntidad();
    public List<GloUsadmin> listarEntidadDato(String dato);
    public GloUsadmin buscarEntidadId(int id);
    public void guardarEntidad(GloUsadmin entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloUsadmin entidad);
}
