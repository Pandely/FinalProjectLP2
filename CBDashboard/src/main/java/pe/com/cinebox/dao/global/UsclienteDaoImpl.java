package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloUscliente;

/**
 *
 * @author HEBERT
 */
@Repository
public class UsclienteDaoImpl extends SysDataAccess<Integer, GloUscliente> implements UsclienteDaoI {
    
    @SuppressWarnings("unchecked")

    @Override
    public GloUscliente buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloUscliente entidad){ savev(entidad); }

    @Override
    public void modificarEntidad(GloUscliente entidad){ update(entidad); }
}
