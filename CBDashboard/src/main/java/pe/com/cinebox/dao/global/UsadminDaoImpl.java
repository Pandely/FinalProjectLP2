package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloUsadmin;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class UsadminDaoImpl extends SysDataAccess<Integer, GloUsadmin> implements UsadminDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloUsadmin> listarEntidad(){ 
        return (List<GloUsadmin>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloUsadmin p WHERE p.idPerfil.idPerfil = 2")
            .list();
    }
    
    @Override
    public List<GloUsadmin> listarEntidadDato(String dato){ 
        return (List<GloUsadmin>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloUsadmin p WHERE p.idPerfil = 2 AND p.idSucursal.idCiudad.idCiudad = ?1")
            .setParameter(1,dato)
            .list();
    }

    @Override
    public GloUsadmin buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloUsadmin entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloUsadmin entidad){ update(entidad); }
}
