package pe.com.cinebox.servicio.global;

import java.util.List;
import pe.com.cinebox.modelo.GloFuncion;

/**
 *
 * @author hebertcb
 */
public interface FuncionServicioI {
    //public List<Boleto> listarEntidad();
    public List<GloFuncion> listarEntidadDato(int dato, int dato2);
    public GloFuncion buscarEntidadId(int id);
    public void guardarEntidad(GloFuncion entidad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(GloFuncion tipoCliente);
}
