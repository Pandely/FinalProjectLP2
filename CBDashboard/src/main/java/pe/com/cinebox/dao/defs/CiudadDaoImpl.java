package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefCiudad;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class CiudadDaoImpl extends SysDataAccess<Integer, DefCiudad> implements CiudadDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefCiudad> listarEntidad(){ return getListAll(); }
}
