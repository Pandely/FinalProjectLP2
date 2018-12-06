package pe.com.cinebox.dao.system;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.SysAcceso;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class AccesoDaoImpl extends SysDataAccess<Integer, SysAcceso> implements AccesoDaoI {
    
    @SuppressWarnings("unchecked")
    /*
    public List<SysAcceso> listarEntidadDato(String dato){ 
        return (List<SysAcceso>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from SysAcceso p WHERE p.. LIKE ?1")
            .setParameter(1,"%"+ dato+"%")
            .list();
    }
    public List<SysAcceso> listarNoombreAcceso(){
        
    }
    
    public List<SysAcceso> listarNoombreAccesoUsuario(int idUsuario){
        
    }    
    */

    @Override
    public SysAcceso buscarEntidadId(int id){ return getById(id); }
}
