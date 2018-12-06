package pe.com.cinebox.servicio.system;
import java.util.List;
import pe.com.cinebox.modelo.SysAcceso;
/**
 *
 * @author HEBERT
 */
public interface AccesoServicioI {
    //public List<SysAcceso> listarEntidad();
    /*
    public List<ViewAcceso> listarEntidadDato(int idUsuario);
    public List<SysAcceso> listarNoombreAcceso();
    public List<SysAcceso> listarNoombreAccesoUsuario(int idUsuario);
    */
    public SysAcceso buscarEntidadId(int id);
    //public void guardarEntidad(SysAcceso accesos);
    //public void eliminarentidad(int id);
    //public void modificarEntidad(SysAcceso accesos);    
    
}
