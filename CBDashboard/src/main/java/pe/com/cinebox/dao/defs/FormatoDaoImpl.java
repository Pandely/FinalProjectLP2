package pe.com.cinebox.dao.defs;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.DefFormato;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class FormatoDaoImpl extends SysDataAccess<Integer, DefFormato> implements FormatoDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<DefFormato> listarEntidad(){ return getListAll(); }
}
