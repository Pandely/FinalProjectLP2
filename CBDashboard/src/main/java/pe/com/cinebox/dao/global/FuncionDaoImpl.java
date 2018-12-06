package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloFuncion;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class FuncionDaoImpl extends SysDataAccess<Integer, GloFuncion> implements FuncionDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloFuncion> listarEntidadDato(int sucur, int peli){ 
        return (List<GloFuncion>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloFuncion p WHERE p.idSucursal.idSucursal = ?1 AND p.idPelicula.idPelicula = ?2")
            .setParameter(1,sucur)
            .setParameter(2, peli)
            .list();
    }

    @Override
    public GloFuncion buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloFuncion entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }
    
    @Override
    public void modificarEntidad(GloFuncion entidad){ update(entidad); }
}
