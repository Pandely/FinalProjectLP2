package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefGenero;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class GeneroDaoImpl extends SysDataAccess<Integer, DefGenero> implements GeneroDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefGenero> listarEntidad(){ return getListAll(); }
}
