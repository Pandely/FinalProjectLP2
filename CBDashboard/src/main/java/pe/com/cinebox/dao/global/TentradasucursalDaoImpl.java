package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloTentradaSucursal;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class TentradasucursalDaoImpl extends SysDataAccess<Integer, GloTentradaSucursal> implements TentradasucursalDaoI {
    
    @SuppressWarnings("unchecked")

    @Override
    public List<GloTentradaSucursal> listarEntidadDato(String dato){ 
        return (List<GloTentradaSucursal>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloTentradaSucursal p WHERE p.idSucursal = ?1")
            .setParameter(1,dato)
            .list();
    }
    
    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloTentradaSucursal entidad){ update(entidad); }
}
