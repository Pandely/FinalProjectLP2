package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloSucursal;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class SucursalDaoImpl extends SysDataAccess<Integer, GloSucursal> implements SucursalDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloSucursal> listarEntidad(){ return getListAll(); }

    @Override
    public List<GloSucursal> listarEntidadDato(String dato){ 
        int dato2 = Integer.parseInt(dato);
        return (List<GloSucursal>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloSucursal p WHERE p.idCiudad.idCiudad = ?1")
            .setParameter(1,dato2)
            .list();
    }

    @Override
    public GloSucursal buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloSucursal entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloSucursal entidad){ update(entidad); }
}
