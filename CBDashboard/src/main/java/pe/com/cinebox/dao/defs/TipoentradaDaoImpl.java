package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefTipoEntrada;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class TipoentradaDaoImpl extends SysDataAccess<Integer, DefTipoEntrada> implements TipoentradaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefTipoEntrada> listarEntidad(){ return getListAll(); }
}
