package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloMeriendaSucursal;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class MeriendasucursalDaoImpl extends SysDataAccess<Integer, GloMeriendaSucursal> implements MeriendasucursalDaoI {
    
    @SuppressWarnings("unchecked")

    @Override
    public List<GloMeriendaSucursal> listarEntidadDato(String dato){ 
        return (List<GloMeriendaSucursal>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloMeriendaSucursal p WHERE p.idSucursal = ?1")
            .setParameter(1,dato)
            .list();
    }

    @Override
    public void guardarEntidad(GloMeriendaSucursal entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloMeriendaSucursal entidad){ update(entidad); }
}
