package pe.com.cinebox.dao.global;

import pe.com.cinebox.modelo.GloUscliente;

/**
 *
 * @author hebertcb
 */
public interface UsclienteDaoI {
    //public List<GloUscliente> listarEntidad();
    //public List<GloUscliente> listarEntidadDato(String dato);
    public GloUscliente buscarEntidadId(int id);
    public void guardarEntidad(GloUscliente entidad);
    //public void eliminarEntidad(int id);
    public void modificarEntidad(GloUscliente entidad);
}
