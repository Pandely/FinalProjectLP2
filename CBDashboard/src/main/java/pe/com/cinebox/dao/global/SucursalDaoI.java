package pe.com.cinebox.dao.global;

import java.util.List;
import pe.com.cinebox.modelo.GloSucursal;

/**
 *
 * @author hebertcb
 */
public interface SucursalDaoI {
    public List<GloSucursal> listarEntidad();
    public List<GloSucursal> listarEntidadDato(String dato);
    public GloSucursal buscarEntidadId(int id);
    public void guardarEntidad(GloSucursal entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloSucursal entidad);
}
