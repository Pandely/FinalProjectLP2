package pe.com.cinebox.dao.venta;

import pe.com.cinebox.modelo.VentBoleto;

/**
 *
 * @author hebertcb
 */
public interface BoletoDaoI {
    //public List<VentBoleto> listarEntidad();
    //public List<VentBoleto> listarEntidadDato(String dato);
    public VentBoleto buscarEntidadId(int id);
    public void guardarEntidad(VentBoleto entidad);
    //public void eliminarEntidad(int id);
    //public void modificarEntidad(VentBoleto entidad);
}
