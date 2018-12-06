package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloSala;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class SalaDaoImpl extends SysDataAccess<Integer, GloSala> implements SalaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloSala> listarEntidadDato(String dato){ 
        int dato2 = Integer.parseInt(dato);
        return (List<GloSala>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloSala p WHERE p.idSucursal.idSucursal = ?1")
            .setParameter(1,dato2)
            .list();
    }
    
    @Override
    public GloSala buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloSala entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }
    
    @Override
    public void modificarEntidad(GloSala entidad){ update(entidad); }
}
