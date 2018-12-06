package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefCategoria;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class CategoriaDaoImpl extends SysDataAccess<Integer, DefCategoria> implements CategoriaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefCategoria> listarEntidad(){ return getListAll(); }
}
