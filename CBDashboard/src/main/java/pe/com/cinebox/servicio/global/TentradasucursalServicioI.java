package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloTentradaSucursal;

/**
 *
 * @author hebertcb
 */
public interface TentradasucursalServicioI {
    //public List<GloTentradaSucursal> listarEntidad();
    public List<GloTentradaSucursal> listarEntidadDato(String dato);
    //public GloTentradaSucursal buscarEntidadId(int id);
    //public void guardarEntidad(GloTentradaSucursal entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloTentradaSucursal entidad);
}
