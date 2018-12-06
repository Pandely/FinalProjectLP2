package pe.com.cinebox.dao.venta;

import java.util.List;
import pe.com.cinebox.modelo.VentBoletoMerienda;

/**
 *
 * @author hebertcb
 */
public interface BoletomeriendaDaoI {
    //public List<VentBoletoMerienda> listarEntidad();
    public List<VentBoletoMerienda> listarEntidadDato(String dato);
    //public VentBoletoMerienda buscarEntidadId(int id);
    public void guardarEntidad(VentBoletoMerienda entidad);
    //public void eliminarEntidad(int id);
    //public void modificarEntidad(BoletoMdeerienda entidad);
}
