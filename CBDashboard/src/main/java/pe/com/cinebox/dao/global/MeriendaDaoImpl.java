package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloMerienda;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class MeriendaDaoImpl extends SysDataAccess<Integer, GloMerienda> implements MeriendaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloMerienda> listarEntidad(){ return getListAll(); }

    @Override
    public List<GloMerienda> listarEntidadDato(String dato){
        return (List<GloMerienda>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloMerienda p WHERE p.nombre LIKE ?1")
            .setParameter(1,"%"+dato+"%")
            .list();
    }
    
    @Override
    public GloMerienda buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloMerienda entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloMerienda entidad){ update(entidad); }
}
