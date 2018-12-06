package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloMeriendaSucursal;

/**
 *
 * @author hebertcb
 */
public interface MeriendasucursalServicioI {
    //public List<GloMeriendaSucursal> listarEntidad();
    public List<GloMeriendaSucursal> listarEntidadDato(String dato);
    //public GloMeriendaSucursal buscarEntidadId(int id);
    public void guardarEntidad(GloMeriendaSucursal entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloMeriendaSucursal entidad);
}
