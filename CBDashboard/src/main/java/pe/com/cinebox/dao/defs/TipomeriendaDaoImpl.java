package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefTipoMerienda;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class TipomeriendaDaoImpl extends SysDataAccess<Integer, DefTipoMerienda> implements TipomeriendaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefTipoMerienda> listarEntidad(){ return getListAll(); }
}
