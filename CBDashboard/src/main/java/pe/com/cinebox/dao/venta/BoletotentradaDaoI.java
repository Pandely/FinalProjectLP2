package pe.com.cinebox.dao.venta;

import java.util.List;
import pe.com.cinebox.modelo.VentBoletoTentrada;

/**
 *
 * @author hebertcb
 */
public interface BoletotentradaDaoI {
    //public List<Boleto> listarEntidad();
    public List<VentBoletoTentrada> listarEntidadDato(String dato);
    //public VentBoletoTentrada buscarEntidadId(int id);
    public void guardarEntidad(VentBoletoTentrada entidad);
    //public void eliminarEntidad(int id);
    //public void modificarEntidad(Boleto tipoCliente);
}
