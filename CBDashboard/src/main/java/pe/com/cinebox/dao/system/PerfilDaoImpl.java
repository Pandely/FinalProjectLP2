package pe.com.cinebox.dao.system;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import java.util.List;
import pe.com.cinebox.modelo.SysPerfil;

/**
 *
 * @author HEBERT
 */
@Repository
public class PerfilDaoImpl extends SysDataAccess<Integer, SysPerfil> implements PerfilDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<SysPerfil> listarEntidad(){ return getListAll(); }
}
